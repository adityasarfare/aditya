package Session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServlet1
 */
@WebServlet("/SessionServlet2")
public class SessionServlet2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
		
		HttpSession session = req.getSession();
		
		String username = (String) session.getAttribute("Usernamekey");
		String language = (String) session.getAttribute("Languagekey");
       
		String ID = session.getId();
		PrintWriter out = resp.getWriter();
		out.println(ID);
		
		
		
	}
}
