package com.taobao.hsf.test.service.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.taobao.hsf.test.service.HelloWorldService;

@SuppressWarnings("serial")
public class HelloWorldServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		WebApplicationContext context = WebApplicationContextUtils
				.getWebApplicationContext(getServletContext());
		HelloWorldService helloWorldService = (HelloWorldService) context
				.getBean("helloWorldService");
		PrintWriter out = resp.getWriter();
		out.println(helloWorldService.sayHello("liujin"));
		return;
	}
}
