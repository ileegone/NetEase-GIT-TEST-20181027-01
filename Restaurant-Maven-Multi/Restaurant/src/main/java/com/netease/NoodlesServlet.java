package com.netease;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.netease.Kitchen;
import org.apache.log4j.*;

public class NoodlesServlet extends HttpServlet {
	private static Logger logger = Logger.getLogger(NoodlesServlet.class);
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();

        String vegetable = request.getParameter("vegetable");
        String noodles = Kitchen.makeNoodles(vegetable);
        writer.println(noodles);
        
        logger.info(" vegetable = " + vegetable);
        
    }
}
