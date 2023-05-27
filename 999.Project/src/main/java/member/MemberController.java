package member;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;








@WebServlet("*.member")
public class MemberController extends HttpServlet {
	RequestDispatcher rd;
	DAO dao = new DAO();
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("접속됨.");
		String mapping = req.getServletPath();
		
		if(mapping.equals("/create.member")) {
			System.out.println("접속ㅁㄴㅇㅁㄴㅇㅁㄴㅇ");
//			dao.test();
			
			DTO dto = new DTO();
			dto.setId(req.getParameter("id"));
			dto.setPw(req.getParameter("pw"));
			dto.setName(req.getParameter("name"));
			
			dao.insert(dto);
			
			List<DTO> list = dao.listSelect();
			for(DTO item : list) {
				System.out.println(item.getName());
			}
			
		}
	}

}
