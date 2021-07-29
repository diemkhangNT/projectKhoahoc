package vn.plusplus.project;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;
import sun.util.resources.cldr.de.CalendarData_de_AT;

import javax.swing.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        while (true){
            System.out.print("Nhap a: ");
            a= input.nextInt();
            System.out.print("Nhap b: ");
            b = input.nextInt();
            System.out.println("Phuong trinh co dang: y = "+a+"x + "+b);
            // Giai phuong trinh bac nhat:
            float y,x;
            try{
                x = (float) -(b/a);
                if(b!=0){
                    if(b%a!=0){
                    System.out.println("Phuong trinh co nghiem: \nx = "+-b+"/"+a+"\ny = 0");
                }else System.out.println("Phuong trinh co nghiem: \nx = "+(int)x+"\ny = 0");
                break;
                }else Integer.parseInt("Acb");
            }catch (ArithmeticException e){
                System.out.println("Loi phep toan! (a != 0) Moi nhap lai: ");
            }catch (Exception e){
                System.out.println("Loi phep toan! (b != 0) Moi nhap lai:");
            }
        }
        // Tim UCLN
        if(b<a){
            int temp = a;
            a=b;
            b=temp;
        }
        int max = 0;
        System.out.print("Cac uoc chung: ");
        for(int i=1;i<=a;i++){
            if(b%i==0){
                if (a%i==0){
                    System.out.print(i+" ");
                    max = i;
                }
            }
        }
        System.out.println("\nUCLN: "+max);
        //Tim BCNN
        System.out.println("BCNN: "+(a*b)/max);

    }
}
