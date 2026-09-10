/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import java.util.*;
/**
 *
 * @author effor
 */
public class Exercise1 {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Welcome To the Concert!");
        System.out.println("Enter Your Age To Determine the ticket price: ");
        int age = kbd.nextInt();
        if (age < 13){
            System.out.println("The price of the ticket is R50");
        }
        else if(age >= 13 && age <= 17){
            System.out.println("The price is R80");
                }
        else{
            System.out.println("The price of the ticket is R120");
          if (age == 18){
              System.out.println("Welcome to the adult hood!!");
          }}
        
       
       kbd.close();
        
                
      }
    }

