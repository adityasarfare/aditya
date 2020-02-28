package RegsitraionLab;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Build a Registration Form
//Accept data from user.
//Display the data in a table.

@WebServlet("/First")
public class FirstServlet extends HttpServlet {
	
	
		
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		String Firstname = req.getParameter("Firstname");
		String Lastname = req.getParameter("Lastname");
		String Email = req.getParameter("Email");
		String Password = req.getParameter("Password");
		
		inertDB( Firstname,  Lastname, Email, Password);
		out.println("Done");
	}
	
	public void inertDB(String Firstname, String Lastname, String Email, String Passowrd) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		
			Statement statement = connection.createStatement();
			String sql = "insert into RegistrationNew values ('" + Firstname + "','" + Lastname + "','" + Email + "','" + Passowrd+"')";
			System.out.println(sql);
			
			int status = statement.executeUpdate(sql);
			
			if(status==1) {
				System.out.println("1 row inserted");
			}
							
		} catch (ClassNotFoundException e) {
	
			e.printStackTrace();
	} 
		catch (SQLException e) {
		e.printStackTrace();
		}
		
		
	}
	
	/*Add some custom fuctionality to our session demo

	print the session id.
	the time when session was created.
	remove an attribute from a session.
	after 1 minute, invalidate the session.*/
}
