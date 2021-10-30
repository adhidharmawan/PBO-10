/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangka;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Tebak {
    
    void input(){
        int angka = (int)(Math.random() *100);
          System.out.println("PERMAIANAN TEBAK ANGKA :");
          System.out.println("Hai.. nama saya Mr. Java, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!! ");

        while(true){
                System.out.println("Masukkan Tebakan Anda:");
                Scanner jawab = new Scanner (System.in);
                int tebakan = jawab.nextInt();


        if ( tebakan == angka ){
            System.out.println("Yeeee… Bilangan tebakan anda BENAR :-)");
            break;}
        else if ( tebakan < angka ){
            System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil");}
        else if ( tebakan > angka ){
            System.out.println("Hehehe… Bilangan tebakan anda terlalu besar");}
            System.out.println("---------------------------------------------------");
        }
 
    }    
}
