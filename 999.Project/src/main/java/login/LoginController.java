package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("*.login")
public class LoginController extends HttpServlet {

	RequestDispatcher rd;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("접속완료.");
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		
		PrintWriter writer = resp.getWriter();
		if(id.equals("admin")&&pw.equals("admin1234")) {
			rd = req.getRequestDispatcher("login/loginsucsuccess.jsp");
		}else {
			rd = req.getRequestDispatcher("login/loginfail.jsp");
		}
		rd.forward(req, resp);
	}

}
