package com.sadman.servlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletExample implements Servlet {
    ServletConfig config=null;

    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        System.out.println("Servlet is initialized");
    }

    public ServletConfig getServletConfig() {
        return config;
    }

    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out=response.getWriter();
        out.print("<html><body>");
        out.print("<b>hello simple servlet</b>");
        out.print("</body></html>");
    }

    public String getServletInfo() {
        return "copyright sadman";
    }

    public void destroy() {
        System.out.println("Servlet is destroyed");
    }
}
