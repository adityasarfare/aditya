


<%@ page language="java" %>
<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Employee  </title>
</head>
<body>
<h1>Display Employee details</h1>
   <%
try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");

	Statement statement = connection.createStatement();
	String sql = "Select * from Employees";
	
	ResultSet status = statement.executeQuery(sql);
%>

<table border="1">
   <tr>
   <th>First Name</th>
   <th> Salary</th>
   </tr>
   
   <%
   // while(status.next()){
    	%><tr style="background-color:burlywood">
    	<td>
 
    
   %>
   <%
   //}
   %>>

</table>

 <%
} catch (ClassNotFoundException e) {
	
			e.printStackTrace();
	} 
		catch (SQLException e) {
		e.printStackTrace();
		}
		
		
	
	%>


</body>
</html>