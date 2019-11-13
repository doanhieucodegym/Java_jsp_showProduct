package servlets;

import com.sun.net.httpserver.HttpsServer;
import models.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        List<Product> products = new ArrayList<>();
        products.add(new Product("iphonX",300f,"https://aphoto.vn/wp-content/uploads/2019/02/hinhavata-1.jpg"));
        products.add(new Product("caca",500f,"https://aphoto.vn/wp-content/uploads/2019/02/hinhavata-1.jpg"));
        products.add(new Product("Bphon",400f,"https://aphoto.vn/wp-content/uploads/2019/02/hinhavata-1.jpg"));

        req.setAttribute("productsaa",products);
        RequestDispatcher requestDispatcher =req.getRequestDispatcher("products.jsp");
        requestDispatcher.forward(req,resp);

    }
}
