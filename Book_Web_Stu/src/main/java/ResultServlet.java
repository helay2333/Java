import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Green写代码
 * @date 2022-11-18 14:36
 */
@WebServlet("/resultServlet")
public class ResultServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        //获取数据
        PrintWriter out = resp.getWriter();
        String name = (String) req.getAttribute("name");
        out.println("名字"+ name);
    }
}
