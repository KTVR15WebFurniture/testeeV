/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import parts.Worker;


/**
 *
 * @author pupil
 */
@WebServlet(name = "Webcontroller", loadOnStartup = 1, urlPatterns = {"/index", "/worker", "/addWorker"})
public class Webcontroller extends HttpServlet {

    @EJB
    Worker workerFacade;
    
//    @EJB
//    PersonFacade personFacade;

//    @Override
//    public void init() throws ServletException {
//        //tut mozhno  propisqvat stroki:       getServletContext().setAttribute("customers", customerFacade.findAll());
//        
//    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String userPath = request.getServletPath();

        if ("/worker".equals(userPath)) {
//            if ($addProduct) {
//                productFacade.setProduct().add("клавиатура",3600);  //setAttribute ?
//            }

            request.setAttribute("workers", workerFacade.findAll());
            userPath = "/worker";
        }

        if ("/addWorker".equals(userPath)) {
            //добываем параметры из запроса
            String name = request.getParameter("name"); //iz formq .jsp "name"
            String price = request.getParameter("surname");
            //Инициируем переменную класса Product
            Product product = new Product(name, Integer.parseInt(price));
            //Записываем полученный продукт в базу
            //            productFacade.create(product);
            // (если есть связь с продавцом по ИД для этого считаем продавца по имени 
            // так как метода поиска по имени изначально нет, создаем его в sellerFacade
            Seller dimaivanov = sellerFacade.findPersonByName("Дима", "Иванов");
            dimaivanov.getProducts().add(product);
            sellerFacade.edit(dimaivanov);
            productFacade.create(product);

            
            
            request.setAttribute("addProduct", productFacade.findAll());
            userPath = "/WEB-INF/addProduct";
            response.sendRedirect("index.jsp");
            return;
        }

        
        if ("/seller".equals(userPath)) {

            getServletContext().setAttribute("sellers", sellerFacade.findAll());
            userPath = "/WEB-INF/seller";
        }
    

        request.getRequestDispatcher(userPath + ".jsp").forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
