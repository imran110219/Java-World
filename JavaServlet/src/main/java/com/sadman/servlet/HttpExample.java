package com.sadman.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HttpExample extends HttpServlet {
    private String mymsg;

    public void init() throws ServletException {
        mymsg = "Http Servlet Demo";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Setting up the content type of web page
        response.setContentType("text/html");
        // Writing the message on the web page
        PrintWriter out = response.getWriter();
        out.print("<h2>" + mymsg + "</h2>");
        out.print("<p>Servlet -> Generic Servlet -> Http Servlet</p>");
    }

    public void destroy() {
        // Leaving empty. Use this if you want to perform
        //something at the end of Servlet life cycle.
    }
}
