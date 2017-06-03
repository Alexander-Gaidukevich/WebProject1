package servlets;

import bean.AllCars;
import bean.Car;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/s3")
public class CarCostServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String costString = request.getParameter("cost");
        int cost = Integer.parseInt(costString);

        List<Car> cars = AllCars.getAllCars();

        List<Car> newCarByCost = new ArrayList<Car>();
       for(int i=0; i < cars.size(); i++) {
            if(cars.get(i).getCost() > cost) {
                newCarByCost.add(cars.get(i));
            }
        }
        request.setAttribute("newCarByCost", newCarByCost);
        request.setAttribute("cost", cost);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/page4.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/page3.jsp");
        dispatcher.forward(request, response);
    }
}