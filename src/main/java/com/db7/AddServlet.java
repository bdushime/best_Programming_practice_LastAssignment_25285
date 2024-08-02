package com.db7;

import org.apache.logging.log4j.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;

public class AddServlet extends HttpServlet
{
	private static  Logger logger =LogManager.getLogger(AddServlet.class);
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		
		int k=i+j;
		
		PrintWriter out =res.getWriter();
		
		out.println("result is"+k);
		logger.info("Addition result:"+k);
		if(k >10) {
			logger.info("The result is greater than 10");
		}
		
	}
}
