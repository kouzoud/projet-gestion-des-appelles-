package controlFront;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
//@WebServlet(name= "/Controle",urlPatterns = "/Controle")

public class ControleFront extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher  requestDispatcher=request.getRequestDispatcher("PROJECT01_war_exploded/webapp/about.jsp");
        requestDispatcher.forward(request,response);

    }}
