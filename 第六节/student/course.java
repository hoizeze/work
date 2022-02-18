package student;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class course {
    String name ;
    int num,score;

    public static void main(String[] args) throws SQLException {
        Driver driver = new com.mysql.cj.jdbc.Driver();
        String url = "jdbc:mysql://localhost:3306/first?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "123456");
        Connection connection = driver.connect(url, properties);
        String sql = "select * from course";
        String sql2 = "select avg(score) , max(score) , min(score) from course";
        Statement statement = connection.createStatement();
        Statement statement2 = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        ResultSet resultSet2 = statement2.executeQuery(sql2);
        while (resultSet.next())//打印课程内全部信息
        {
           course c = new course();
           c.name = resultSet.getString(1);
           c.num = resultSet.getInt(2);
           c.score = resultSet.getInt(3);
           System.out.println(c.name + "\t" + c.num +"\t" +c.score);
        }
        resultSet2.next();
        System.out.println("平均成绩是："+resultSet2.getFloat(1)+"   最高分是："+resultSet2.getInt(2) + "   最低分是："+resultSet2.getInt(3));
        statement.close();
        resultSet.close();
        connection.close();
    }
}
