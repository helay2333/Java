

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LastAccessServlet
 */
@WebServlet("/LastAccessServlet")
public class LastAccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LastAccessServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf8");
		PrintWriter out = response.getWriter();
		String last = null;
		Cookie[] cs = request.getCookies();
		for(int i = 0; cs!= null && i < cs.length; i++) {
			if(cs[i].getName().equals("last")) {
				last = cs[i].getValue();
				break;
			}
		}
		if(last == null) {
			out.println("您是首次访问本站");
		}else {
			out.println("您上次访问的时间是：" + last);
		}
		String currenttime = new SimpleDateFormat("yyyy-MM-dd_hh:ss").format(new Date());
		System.out.println(currenttime);
		Cookie cookie = new Cookie("last",currenttime);
		response.addCookie(cookie);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
