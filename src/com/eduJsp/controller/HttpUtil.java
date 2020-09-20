package com.eduJsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpUtil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public static void forward(HttpServletRequest req, HttpServletResponse res, 
											String path) throws ServletException, IOException {
		
		try {
			RequestDispatcher dispatcher = req.getRequestDispatcher(path);
			dispatcher.forward(req, res);
			
		}catch(Exception ex) {
			System.out.println("forward 오류:" + ex);
		}

	}

}