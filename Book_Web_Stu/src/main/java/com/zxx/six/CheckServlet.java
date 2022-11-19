package com.zxx.six;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author Green写代码
 * @date 2022-11-18 17:29
 */
@WebServlet("/checkServlet")
public class CheckServlet extends HttpServlet {
    private static int WIDTH = 60;
    private static int HEIGHT = 20;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(true);
        resp.setContentType("image/jpeg");
        ServletOutputStream sos = resp.getOutputStream();
        resp.setHeader("Pragma","No-cache");
    }
}
