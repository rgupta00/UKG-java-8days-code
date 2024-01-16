package com.ukg.empapp;

import com.ukg.empapp.factory.ConnectionFactory;

import java.sql.*;

public class C_HelloWorldWithConnFactory {
    public static void main(String[] args) {

        Connection con= ConnectionFactory.getConnection();
      try{
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
