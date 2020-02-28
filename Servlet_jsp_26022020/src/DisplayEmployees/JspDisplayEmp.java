package DisplayEmployees;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JspDisplayEmp
 */
@WebServlet("/JspDisplayEmp")
public class JspDisplayEmp extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException ,IOException {
		PrintWriter out = resp.getWriter();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		
			Statement statement = connection.createStatement();
			String sql = "Select * from Employees";
			
			ResultSet status = statement.executeQuery(sql);
			
			/*out.println("<html>");
			out.println("<head> REGISTRATION FORM</head>");
			out.println("<Body>");
			out.println("<table border='1'>");
			out.println("<tr><th>First Name</th><th>Last Name<th></tr>");
			
			out.println("<html>");
			out.println("<html>");*/
			
			while(status.next()) {
				String FirstNameString = status.getString("FIRST_NAME");
				float Salaryemp = status.getFloat("SALARY");
				out.println(FirstNameString+ " "+ Salaryemp);
			}
			
							
		} catch (ClassNotFoundException e) {
	
			e.printStackTrace();
	} 
		catch (SQLException e) {
		e.printStackTrace();
		}
		
		
	}
	};
	

