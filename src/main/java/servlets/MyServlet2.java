package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/s2")
public class MyServlet2 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        super.doPost(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        String varTextA = "Hello World!";
        request.setAttribute("aaaaaaaa", varTextA);
        String varTextB = "It JSP.";
        request.setAttribute("bbbbbbbbbbb", varTextB);

        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(5);
        list.add(5);
        request.setAttribute("list", list);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/page2.jsp");
        dispatcher.forward(request, response);
    }
}