package jdbcTest;

import java.sql.*;
import java.util.ResourceBundle;

public class JdbcTest {
    public static void main(String[] args) {
        //引入配置
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");

        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String password = bundle.getString("password");

        Statement stmt = null;
        Connection conn = null;
        ResultSet rs = null;
        try {


            //1.注册驱动
            Class.forName(driver);

            //2.链接数据库
            conn = DriverManager.getConnection(url, user, password);

            //3.获取数据库操作对象
            stmt = conn.createStatement();
            //4.SQL语句
            String sql = "select * from emp";
            //int stmt.executeUpdate(insert/delete/update) 专门增删改语句,返回修改记录数量int
            //ResultSet stmt.executeQuery(select)专门执行select语句,返回查询结果集
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println("name: " + rs.getString("ename") + " sal：" + rs.getDouble("sal"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //6.释放资源
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
