package com.sadman.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Generic extends GenericServlet {
    public void service(ServletRequest request, ServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter pwriter=response.getWriter();
        pwriter.print("<html>");
        pwriter.print("<body>");
        pwriter.print("<h2>Generic Servlet Demo</h2>");
        pwriter.print("<p>Servlet -> Generic Servlet</p>");
        pwriter.print("</body>");
        pwriter.print("</html>");
    }
}