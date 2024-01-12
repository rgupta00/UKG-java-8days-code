package com.day3.session1.revision_ex;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class A_Ex_UnchecekdEx {
    public static void main(String[] args) {
        //ARM java 7
      try(Scanner scanner=new Scanner(System.in)){
          System.out.println("Enter a number x");
          int x=scanner.nextInt();

          System.out.println("Enter a number y");
          int y=scanner.nextInt();

          int z=x/y;
          System.out.println(z);

      }catch (ArithmeticException e){
          System.out.println(e);
      }
      catch (InputMismatchException e){
          System.out.println(e);
      }
      catch (Exception e){
          System.out.println(e);
      }
        System.out.println("hello");

    }
}