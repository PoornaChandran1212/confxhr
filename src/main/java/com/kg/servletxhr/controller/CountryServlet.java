package com.kg.servletxhr.controller;

import com.kg.servletxhr.model.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.servlet.Registration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

/**
* RegisterServlet
*/
@WebServlet("/country")
public class CountryServlet extends HttpServlet  {
   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doGet(req, resp);
   }@Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       System.out.println("do post called");

       
       String firstname = req.getParameter("firstname");
       String lastname = req.getParameter("lastname");
       String title = req.getParameter("title");
       String organization = req.getParameter("organization");
       String email = req.getParameter("email");
       String dob = req.getParameter("dob");
       String phone = req.getParameter("phone");
       String fax = req.getParameter("fax");
       String address1 = req.getParameter("address1");
       String address2 = req.getParameter("address2");
       String city = req.getParameter("city");
       String state = req.getParameter("state");
       String zipcode = req.getParameter("zipcode");
        String showmycontact = req.getParameter("showmycontact");
   //    // String showmycontact="";

   //               String contact[]=req.getParameterValues("contact");

   //               for(int i=0;i<contact.length;i++){

   //                 showmycontact+=contact[i]+" ";
   //                }

      //String daysattending = req.getParameter("daysattending");
       String daysattending ="";
              String days[]=req.getParameterValues("daysattending");
             for(int j=0;j<days.length;j++){
               daysattending+=days[j]+" ";
                }
       //String activityattending = req.getParameter("activityattending");
       String activityattending ="";
              String days1[]=req.getParameterValues("activityattending");
             for(int j=0;j<days1.length;j++){
               activityattending+=days1[j]+" ";
                }
       String meals = req.getParameter("meals");
        System.out.println("****"+meals);
       String requirements = req.getParameter("requirements");
       String lastconfattend = req.getParameter("lastconfattend");
       String id = req.getParameter("id");
       String sql = "INSERT INTO  country(firstname,lastname,title,organization,email,dob,phone,fax,address1,address2,city,state,zipcode,showmycontact,daysattending,activityattending,meals,requirements,lastconfattend,id )values('" + firstname + "','" + lastname + "','" + title + "','" + organization + "','" + email + "','" + dob+ "','" + phone + "','" + fax + "','" + address1 + "','" + address2 + "','" + city + "','" + state + "','" + zipcode + "','" + showmycontact + "','" + daysattending + "','" + activityattending + "','" + meals + "','" + requirements + "','" + lastconfattend + "','" + id + "')";
       System.out.println(sql);
       try {
        int resultSet = MysqlConnect.getDbCon().insert(sql);
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
     }
         System.out.println("inserted successfully");
   }

}