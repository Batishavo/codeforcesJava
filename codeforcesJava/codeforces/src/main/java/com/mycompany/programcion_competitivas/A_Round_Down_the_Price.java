/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programcion_competitivas;

import java.util.Scanner;

public class A_Round_Down_the_Price {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int test=sc.nextInt();
        
        for (int x = 0; x < test; x++) {
            
            int n=sc.nextInt();
            
            for(int i=1;i<=n;i*=10){
                
                if(i*10>n){
                    System.out.println(n-i);
                    break;
                }
                
                
            }
            
        }
        
    }
    
}
