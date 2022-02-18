package student;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class grad extends student{
    public grad(int id) throws SQLException {
        super(id);
        Driver driver = new com.mysql.cj.jdbc.Driver();
        String url = "jdbc:mysql://localhost:3306/first?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "123456");
        Connection connection = driver.connect(url, properties);
        Statement statement = connection.createStatement();
        String sql = "select * from grad ,stu where stu.id = grad.id && stu.id="+id;
        ResultSet resultSet = statement.executeQuery(sql);
        resultSet.next();
        System.out.println("该学生为研究生，导师为: "+resultSet.getString(1)+"   课题为："+resultSet.getString(2));
    }

    public static void main(String[] args) throws SQLException {
        new grad(5002);

    }
}
