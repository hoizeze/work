package come.java.demo;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class jdbc {


  public static void main(String[] args) throws SQLException {
    Driver driver = new com.mysql.cj.jdbc.Driver();
    String url = "jdbc:mysql://localhost:3306/first?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
    Properties properties = new Properties();
    properties.setProperty("user", "root");
    properties.setProperty("password", "123456");
    Connection connection = driver.connect(url, properties);
    String sql = "insert into student(sNo,sName,sex,classNo) values('1','小侯','男','1班')";
    String sql1 = "update student set classNo='3班' where sNo='1'";
    String sql2 = "delete from student where sNo='1'";
    String sql3 = "SELECT * from student";
    Statement statement = connection.createStatement();
    statement.executeUpdate(sql);
    statement.executeUpdate(sql1);
    statement.executeUpdate(sql2);
    statement.executeQuery(sql3);
    statement.close();
    connection.close();
  }
}
