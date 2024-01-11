package com.day2.session3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_NeedOfExceptionHanding {
    public static void main(String[] args) {
    Scanner scanner =null;
        try{
            int a, b;
            scanner = new Scanner(System.in);
            System.out.println("PE first number");
            a = scanner.nextInt();
            System.out.println("PE sec number");
            b = scanner.nextInt();
            int c=a/b;
            System.out.println(c);
        }
        catch (InputMismatchException ex){
            System.out.println("data should int");
        }
        catch (ArithmeticException ex){
            System.out.println("deno must not be zero");
        }
        catch(Exception e){
        }
        finally {
            scanner.close();
        }

    }
}
