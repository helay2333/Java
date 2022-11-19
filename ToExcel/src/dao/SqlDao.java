package dao;

import bean.Student;
import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

/**
 * @author Green写代码
 * @date 2022-11-19 11:18
 */
public class SqlDao {
    //数据库驱动
    private static String driver = "com.mysql.jdbc.Driver";
    //数据库连接地址
    private static String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=False";
    //数据库用户名
    private static String user = "root";
    //数据库密码
    private static String password = "abc123";

    //数据库连接
    protected Connection conn = null;
    //statement对象
    protected PreparedStatement preparedStatement = null;

    /*
    数据库连接
     */
    protected Connection getConn() throws SQLException {
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl(url);
        ((MysqlDataSource)dataSource).setPassword(password);
        ((MysqlDataSource)dataSource).setUser(user);
        conn = dataSource.getConnection();
        return conn;
    }
    /*
    数据库添加操作
     */
    public void Add(List<Student> list){
        try {
            getConn();
            String sql = "insert into students(classes, card, name, gender, score) values(?,?,?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            for(int i = 0; i < list.size(); i++){
                preparedStatement.setString(1, list.get(i).getClasses());
                preparedStatement.setString(2, list.get(i).getCard());
                preparedStatement.setString(3, list.get(i).getName());
                preparedStatement.setString(4, list.get(i).getGender());
                preparedStatement.setInt(5, list.get(i).getScore());
                preparedStatement.addBatch();
            }
            int[] n = preparedStatement.executeBatch();
            System.out.println(Arrays.toString(n));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
