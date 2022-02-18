package student;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class student {

  public student(int id) throws SQLException {
      Driver driver = new com.mysql.cj.jdbc.Driver();
      String url = "jdbc:mysql://localhost:3306/first?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
      Properties properties = new Properties();
      properties.setProperty("user", "root");
      properties.setProperty("password", "123456");
      Connection connection = driver.connect(url, properties);
      Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
      String sql = "select * from stu ,course where stu.id = course.id && stu.id="+id;
      String sql1 = "select count(grade) from course where id="+id+" &&grade<60";
      String sql2 = "select count(grade) from course where id="+id;
      ResultSet resultSet = statement.executeQuery(sql);
      resultSet.next();
      System.out.println("name:"+resultSet.getString(1)+"\tsex:"+resultSet.getString(2)+"\tage:"+resultSet.getInt(3)+"\theight:"+resultSet.getInt(4)+"\tzone:"+resultSet.getString(5)+"\tschool:"+resultSet.getString(6)+"\tid:"+resultSet.getString(7));
      resultSet.beforeFirst();
      while (resultSet.next())
      {
        System.out.println("\ncourse:   "+resultSet.getString(10)+"  grade:   "+resultSet.getString(9)+"  cid:   "+resultSet.getString(11));
      }
      Statement statement1 = connection.createStatement();
      Statement statement2 = connection.createStatement();
      ResultSet resultSet1 =statement1.executeQuery(sql1);
      ResultSet resultSet2 = statement2.executeQuery(sql2);
      resultSet1.next();resultSet2.next();
      if((float)resultSet1.getInt(1)/resultSet2.getInt(1)>0.4){
          System.out.println("您挂科率超过40%");
      }
      else
      {
          System.out.println("您成绩良好");
      }
      statement.close();
      resultSet.close();
      resultSet1.close();
      resultSet2.close();
      connection.close();

  }

    public static void main(String[] args) throws SQLException {

      new student(5002);//根据学号查询学生的所有信息 挂科率高于40%发出警告
    }
}
