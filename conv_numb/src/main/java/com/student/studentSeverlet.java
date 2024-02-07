package com.student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class studentSeverlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6816840626170670586L;

	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException{
	    String fullName = req.getParameter("fullName");
        int age = Integer.parseInt(req.getParameter("age"));
        String gender = req.getParameter("gender");
        String email = req.getParameter("email");
        String course = req.getParameter("course");
        int year = Integer.parseInt(req.getParameter("year"));
	
        
        String prevStudents = "<html><head><title>Admission Preview</title></head><body>"
                + "<h2>Admission Preview</h2>"
                + "<p><strong>Full Name:</strong> " + fullName + "</p>"
                + "<p><strong>Age:</strong> " + age + "</p>"
                + "<p><strong>Gender:</strong> " + gender + "</p>"
                + "<p><strong>Email:</strong> " + email + "</p>"
                + "<p><strong>Desired Course:</strong> " + course + "</p>"
                + "<p><strong>Year of Admission:</strong> " + year + "</p>"
                + "</body></html>";
    
        res.setContentType("text/html");

       
        PrintWriter out = res.getWriter();

       
        out.println(prevStudents);
	}
	
}
