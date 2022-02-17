import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class student {
    String sNo,sName,sex,classNo;

    public static void main(String[] args) throws SQLException {
        Driver driver = new com.mysql.cj.jdbc.Driver();
        String url = "jdbc:mysql://localhost:3306/first?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "123456");
        Connection connection = driver.connect(url, properties);
        String sql= "select sNo,sName,sex,classNo from student";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        List<student> list = new ArrayList<>();
        while (resultSet.next())
        {
            student stu = new student();
            stu.sNo = resultSet.getString(1);
            stu.sName = resultSet.getString(2);
            stu.sex = resultSet.getString(3);
            stu.classNo = resultSet.getString(4);
            list.add(stu);
        }
        System.out.println(list);
        statement.close();
        resultSet.close();
        connection.close();
    }


}
