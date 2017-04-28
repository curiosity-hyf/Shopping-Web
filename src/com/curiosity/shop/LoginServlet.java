package com.curiosity.shop;

import javax.servlet.http.Cookie;
import java.io.IOException;
import java.io.Writer;

/**
 * Description :
 * Author : curiosity-hyf
 * Date : 17-4-27
 * E-mail : curiooosity.h@gmail.com
 */
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Writer writer = response.getWriter();
        writer.append("testtest");
        writer.write("tttttt");
        writer.flush();
        writer.close();
    }
}
