package com.day3.session1.revision_ex;

import java.io.*;

public class B_CheckedEx {
    public static void main(String[] args){
      try( BufferedReader br=new BufferedReader
              (new FileReader(new File("data.txt")))){
          String line=null;
          while((line=br.readLine())!=null){
              String []strings=line.split(" ");
              for( String str : strings ){
                  System.out.println(str);
              }
          }
      }catch(FileNotFoundException e){
          System.out.println(e);
      }catch(IOException e){
          System.out.println(e);
      }catch(Exception e){
          System.out.println(e);
      }
    }
}
