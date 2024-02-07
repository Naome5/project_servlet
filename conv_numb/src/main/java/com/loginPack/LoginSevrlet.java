package com.loginPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginSevrlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4147476710296724088L;

	public  void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException {
		
	    String username = req.getParameter("username");
        String password = req.getParameter("password");
        
        String user= "Naome";
        String pass= "123";
		
        try {
        	if(username.equals(user)&&password.equals(pass)) {
        		res.setContentType("text/html");
        		PrintWriter out=res.getWriter();
        		   out.println("<html><body>");
                   out.println("<h2>Login Successful</h2>");
                   out.println("</body></html>");
        	}else {
        		String errorMessage = "Incorrect username or password. Please try again.";
        		req.setAttribute("error", errorMessage);

        		 RequestDispatcher dispatcher = req.getRequestDispatcher("/Login.jsp");
                 dispatcher.forward(req, res);	
        	}
        	
        }catch (Exception e) {
		
		}
		
		
		
		
	}

}
