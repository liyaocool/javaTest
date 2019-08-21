package jdbcTest;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserLoginTest02 {
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
     * <p>
     * 防止sql漏洞
     * PreparedStatement 代替 Statement
     */

    private static Boolean canLogin(String userName, String password) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null; //查询结果集
        boolean isSuccess = false;

        try {
            conn = DBUtil.getConnection();

            //3.获取预编译的数据库链接对象
            String sql = "select * from t_user where userName = ? and password = ?";
            //先预编译好sql框架
            ps = conn.prepareStatement(sql);
            //给编译后的sql语句中？占位符赋值，jdbc下标从1开始
            ps.setString(1, userName);
            ps.setString(2, password);
            //4.正式执行sql语句
            rs = ps.executeQuery();
            //5.处理结果集，如果查询到数据
            if (rs.next()) {
                isSuccess = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn, ps, rs);
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
