package com.eduJsp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddressInsertController implements Controller {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws
		ServletException, IOException{

		HttpUtil.forward(req, res, "/WEB-INF/view/addressInsert.jsp");
		
	}

}
