package caseclass

import com.alibaba.fastjson.JSON

/**
  *
  *
  * @author 1111358@cecdat.com
  * @version 1.0.0
  */

//测试结论，样例类用json 转对象时，不严格一定需要json的字段全部齐全，不齐全的字段默认为空，可在对象出来后再添加
object CastClassTest2{

    def main(args: Array[String]): Unit = {

//        val jsonString = "{\"id\": \"1\",\"user_level\": \"2\",\"birthday\": \"3\",\"gender\": \"4\",\"age_group\": \"5\",\"gender_name\": \"6\"}"
        val jsonString = "{\"id\": \"1\",\"user_level\": \"2\",\"birthday\": \"3\",\"gender\": \"4\",\"age_group\": \"5\"}"
        val info2: UserInfo = JSON.parseObject(jsonString,classOf[UserInfo])
        info2.gender_name ="6"
        println(info2)
        val info = UserInfo("1","2","3","4","20","nan")
        println(info)
    }
}




case class UserInfo(
                           id:String,
                           user_level:String,
                           birthday:String,
                           gender:String,
                           var age_group:String,//年龄段
                           var gender_name:String) //性别