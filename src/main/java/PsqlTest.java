import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Author: LiuCaiLiang
 * Desc:
 * Date: 2021/9/18
 */
public class PsqlTest {


   /*
   建表语句：
   CREATE TABLE images (imgname text, img bytea);
    */

    public static void main(String[] args) {
        Connection conn = null;
        String strSQL = null;
        String pathName = "D:\\CMS\\psql.png";
        //插入数据
        try {
            conn = PsqlUtil.getConn();
            File file = new File(pathName);
//            strSQL = "insert into images(imgname,img) values (?,?)";
//            insertData(conn, strSQL, file);
            strSQL = "SELECT img FROM images WHERE imgname = ?";
            getData(conn, strSQL, file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void insertData(Connection conn, String strSQL, File file) throws SQLException, IOException {
        FileInputStream fis = new FileInputStream(file);
        PreparedStatement ps = conn.prepareStatement(strSQL);
        String filename = file.getName().trim();
        ps.setString(1, filename);
        FileInputStream fileInputStream = new FileInputStream(file);
        //图片以二进制保存到数据库
        ps.setBinaryStream(2,fileInputStream,(int)file.length());
        ps.executeUpdate();
        ps.close();
        fis.close();
    }

    private static void getData(Connection conn, String strSQL, File file) throws SQLException, IOException {
        //读取数据
        PreparedStatement ps = conn.prepareStatement(strSQL);
        String filename = file.getName().trim();
        ps.setString(1, filename);
        ResultSet rs = ps.executeQuery();
        if (rs != null) {
            while (rs.next()) {
                byte[] imgBytes = rs.getBytes(1);
                // 保存文件到本地
                FileOutputStream os = new FileOutputStream("D:\\CMS\\psql3.png");
                os.write(imgBytes);
            }
            rs.close();
        }
        ps.close();
    }
}
