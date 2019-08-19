package jdbcTest;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Scanner;

public class UserLoginTest01 {
    public static void main(String[] args) {
        Map<String, String> userInfo = initUI();
        Boolean loginSuccess = login(userInfo);
        System.out.println(loginSuccess ? "登录成功" : "登录失败");
    }

    /**
     * 登录系统
     *
     * @param userInfo 用户输入的用户名和密码信息
     * @return false登录失败，true登录成功
     */
    private static Boolean login(Map<String, String> userInfo) {
        String userName = userInfo.get("userName");
        String password = userInfo.get("password");
        return canLogin(userName, password);
    }

    /**
     * 调用数据库数据检测是否可登录
     *
     * @param userName 用户输入的用户名
     * @param password 用户输入的密码
     * @return false 登录失败，true 登录成功
     *
     * sql漏洞
     * 请输入用户名：asdf
     * 请输入密码：asdf' or '1'='1
     * 登录成功
     */

    private static Boolean canLogin(String userName, String password) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null; //查询结果集
        boolean isSuccess = false;

        try {
            //引入配置文件
            ResourceBundle bundle = ResourceBundle.getBundle("jdbc");

            String driver = bundle.getString("driver");
            String url = bundle.getString("url");
            String user = bundle.getString("user");
            String pwd = bundle.getString("password");

            //1.注册驱动
            Class.forName(driver);
            //2.链接数据库
            conn = DriverManager.getConnection(url, user, pwd);
            //3.获取链接对象
            stmt = conn.createStatement();
            String sql = "select * from t_user where userName='" + userName + "' and password='" + password + "'";
            //4.执行sql语句
            rs = stmt.executeQuery(sql);
            //5.处理结果集，如果查询到数据
            if (rs.next()) {
                isSuccess = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //6.释放资源
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
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

        return isSuccess;
    }


    /**
     * 初始化用户界面
     *
     * @return 用户输入用户名和密码信息
     */
    private static Map<String, String> initUI() {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String userName = scan.nextLine();
        System.out.print("请输入密码：");
        String password = scan.nextLine();

        Map<String, String> userInfo = new HashMap<>();
        userInfo.put("userName", userName);
        userInfo.put("password", password);
        return userInfo;
    }
}
