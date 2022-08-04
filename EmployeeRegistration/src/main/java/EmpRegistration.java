

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.mysql.cj.xdevapi.Statement;

@WebServlet("/EmpRegistration")
public class EmpRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PreparedStatement st1=null;
        Connection con; 
	  
			
        PrintWriter out = response.getWriter();

		 String  Fname =request.getParameter("Fname");
		 String  Lname =request.getParameter("Lname");
		 String Uname =request.getParameter("Uname");
		 String Pass =request.getParameter("pass");
		 String Address =request.getParameter("Add");
		 String contact =request.getParameter("contact");
		 
		 
		
		try
		{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/employee", "root","Pp9822333995");	
		String query ="insert into employee_registration(FirstName,LastName,UserName,Password,Address,contact)values(?,?,?,?,?,?)";
		st1= con.prepareStatement(query);

		st1.setString(1, Fname);
		st1.setString(2, Lname);
		st1.setString(3, Uname);
		st1.setString(4, Pass);
		st1.setString(5, Address);
		st1.setString(6, contact);
		int k = st1.executeUpdate();


		if(k ==1)
		  {
		    out.println("Thanks for registration ......");
			String query2 = "select max(id) from student";
			Statement st2 = (Statement) con.createStatement();
			ResultSet rs1 = ((java.sql.Statement) st2).executeQuery( query2);	
			rs1.next( );
			String reg_No = rs1.getString(1);
			out.println("Your registration id is " + reg_No);
		  }
		else
		  {
		    out.println("Cant' update");
		  }
		}
		catch(Exception ee)
		  {
			System.out.println(ee.toString());
		  }

		}
		


}
