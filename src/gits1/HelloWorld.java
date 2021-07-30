/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gits1;
import java.util.Scanner;
/**
 *
 * @author ZULIA ARISANDA
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        double a;
        double b;
        double hasil;
        double hasil2;
        double sisa;
        double sisa2;
       
           
        System.out.print("Masukan Nilai A = ");
        a = input.nextInt();
        hasil = a/3;
        sisa = a%3;
        System.out.print("Masukan Nilai B = ");
        b = input.nextInt();
        hasil2 = b/5;
        sisa2 = b%5;

        
        if ((sisa==0) && (sisa2!=0)){
            System.out.println("Hello");
        } else if ((sisa2==0) && (sisa!=0)) {
            System.out.println("World");
        } else if ((sisa==0) && (sisa2==0)){
            System.out.println("Hello World");
        } else{
           System.out.println("Tidak Memenuhi");
        }
    }
    
}
