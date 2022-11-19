import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Green写代码
 * @date 2022-11-18 14:33
 */
@WebServlet("/requestForwardServlet")
public class RequestForwardServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text/html;charset=utf-8");
//        req.setAttribute("name", "周羽飞");
//        RequestDispatcher dispatcher = req.getRequestDispatcher("/requestServlet");
//        dispatcher.forward(req, resp);
        resp.sendRedirect("https://www.sogou.com");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
