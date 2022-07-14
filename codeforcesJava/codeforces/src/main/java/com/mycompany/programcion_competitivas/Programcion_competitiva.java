/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.programcion_competitivas;

import java.util.Scanner;

public class Programcion_competitiva {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int test=sc.nextInt();
        
        for(int t=0;t<test;t++){
            
            int n = sc.nextInt();
            int z = sc.nextInt();
            int solution=0;
            for(int i=0;i<n;i++){
                int axu=sc.nextInt();
                if((axu|z)>solution){
                    solution=(axu|z);
                }
                
            }
            
            System.out.println(solution);
        
        
        }
        
    }
}
