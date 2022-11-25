package com.zxx.excu;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.*;

public class JDBCUtils {
    //数据库驱动
    private static String driver = "com.mysql.jdbc.Driver";
    //数据库连接地址
    private static String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=False";
    //数据库用户名
    private static String user = "root";
    //数据库密码
    private static String password = "abc123";

    //数据库连接
    protected static Connection conn = null;
    //statement对象
    protected PreparedStatement preparedStatement = null;
    public static Connection getConnection() throws SQLException {
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl(url);
        ((MysqlDataSource)dataSource).setPassword(password);
        ((MysqlDataSource)dataSource).setUser(user);
        conn = dataSource.getConnection();
        return conn;
    }

    public static void release(ResultSet rs, Statement stmt, Connection conn) {
        try {
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
