package com.ukg.empapp;
import  java.sql.*;
public class A_HelloWorld {
    public static void main(String[] args) {
        //load the driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        //create the conn object
        Connection con=null;
      try{
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ukgdemo",
                  "root","root");
          System.out.println("conn is done");
          Statement stmt=con.createStatement();
          ResultSet rs=stmt.executeQuery("select * from emp");
          while (rs.next()){
              System.out.println(rs.getInt(1)+": "+
                      rs.getString(2)+": "+ rs.getDouble(3));
          }
      }catch (SQLException e){
          System.out.println(e);
      }
      catch (Exception e){
          System.out.println(e);
      }finally {
          if(con!=null){
              try {
                  con.close();
              } catch (SQLException e) {
                  System.out.println("some ex");
              }
          }
      }



    }
}
