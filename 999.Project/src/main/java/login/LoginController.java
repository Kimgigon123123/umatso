package login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.DAO;
import member.DTO;


@WebServlet("*.login")
public class LoginController extends HttpServlet {

	RequestDispatcher rd;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("접속완료.");
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		DAO dao = new DAO();
		String userid = dao.loginid(id);
		System.out.println(userid);
		String userpw = dao.loginpw(id);
		System.out.println(userpw);
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter writer = resp.getWriter();
		if(id.equals(userid)&&pw.equals(userpw)) {
			
			writer.print("<h1>로그인성공!!</h1>");
		}else {
			writer.print("<h1>로그인실패!!</h1>");
		}
		rd.forward(req, resp);
	}

}
