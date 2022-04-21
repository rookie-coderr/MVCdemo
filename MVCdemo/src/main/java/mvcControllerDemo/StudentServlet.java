package mvcControllerDemo;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvcModelDemo.Student;
import mvcUtilDemo.StudentUtilData;

@WebServlet("/studentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Student> students = StudentUtilData.getStudents(); // jdbc
		
		request.setAttribute("studentList", students);
		
		RequestDispatcher rd = request.getRequestDispatcher("/ViewStudents.jsp");
		
		rd.forward(request, response);	
		
	}


}