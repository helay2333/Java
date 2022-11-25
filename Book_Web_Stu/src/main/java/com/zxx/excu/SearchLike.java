package com.zxx.excu;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

@WebServlet("/searchByName")
public class SearchLike extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String num = req.getParameter("num");
        System.out.println(num);
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<User> list=new ArrayList<User>();
        try {
            conn = JDBCUtils.getConnection();
            stmt = conn.createStatement();
            String sql = "select * from students where card like '%" + num+"'";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                User user = new User();
                user.setStudentNum(rs.getString("card"));
                user.setUsername(rs.getString("name"));
                user.setScore(rs.getInt("score"));
                System.out.println(user);
                list.add(user);
            }
            System.out.println(list);
            req.setAttribute("users",list);
            req.getRequestDispatcher("/list.jsp").forward(req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(rs, stmt, conn);
        }
    }
}
