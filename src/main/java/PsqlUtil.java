import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Author: LiuCaiLiang
 * Desc:
 * Date: 2021/9/18
 */
public class PsqlUtil {
    // 定义数据库连接参数
    public static final String DRIVER_CLASS_NAME = "org.postgresql.Driver";
    public static final String URL = "jdbc:postgresql://PG-001:5432/";
    public static final String USERNAME = "postgres";
    public static final String PASSWORD = "psql123!@#";

    // 注册数据库驱动
    static {
        try {
            Class.forName(DRIVER_CLASS_NAME);
        } catch (ClassNotFoundException e) {
            System.out.println("注册失败！");
            e.printStackTrace();
        }
    }

    // 获取连接
    public static Connection getConn() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    // 关闭连接
    public static void closeConn(Connection conn) {
        if (null != conn) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("关闭连接失败！");
                e.printStackTrace();
            }
        }
    }
    //测试
    public static void main(String[] args) throws SQLException {
        System.out.println(PsqlUtil.getConn());
    }
}
