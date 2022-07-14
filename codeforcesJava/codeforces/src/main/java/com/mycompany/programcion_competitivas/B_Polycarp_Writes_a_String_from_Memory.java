/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programcion_competitivas;

import java.util.Scanner;

public class B_Polycarp_Writes_a_String_from_Memory {
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        Scanner sc_string= new Scanner(System.in);
        
        int test=sc.nextInt();
        int[] used = new int[300];
        for(int j='a';j<='z';j++){
            used[j]=0;
        }
        for (int x = 0; x < test; x++) {
            //System.out.println(1);
            String cad=sc_string.next();
            int dif=0;
            int total=0;
            for (int i = 0; i < cad.length(); i++) {
                //System.out.println("2");
                char actual = cad.charAt(i);
                int num = actual;
                if(used[num]==0){
                    dif++;
                    used[num]=1;
                    System.out.println("x");
                }
                if(dif>3){
                    total++;
                    dif=1;
                    for(int j='a';j<='z';j++){
                        used[j]=0;
                    }
                }
                System.out.println(dif+" "+total+" "+actual);
            }
            System.out.println(total+1);
            for(int j='a';j<='z';j++){
                used[j]=0;
            }
            
        }
        
    }
    
}
