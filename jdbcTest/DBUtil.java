package jdbcTest;

import java.sql.*;
import java.util.ResourceBundle;

public class DBUtil {
    //引入配置文件
    private static ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
    private static String driver = bundle.getString("driver");
    private static String url = bundle.getString("url");
    private static String user = bundle.getString("user");
    private static String pwd = bundle.getString("password");

    //Constructor
    private DBUtil() {
    }

    //静态代码块,只执行一次
    static {
        //1.只注册驱动一次
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库连接
     * @return 数据库连接对象
     * @throws SQLException sql
     */
    public static Connection getConnection() throws SQLException {
        //2.链接数据库
        return DriverManager.getConnection(url, user, pwd);
    }

    public static void close(Connection conn, Statement ps, ResultSet rs) {
        //6.释放资源
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
