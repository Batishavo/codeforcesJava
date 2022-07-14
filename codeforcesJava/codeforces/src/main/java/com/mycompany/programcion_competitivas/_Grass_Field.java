/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programcion_competitivas;

import java.util.Scanner;

public class _Grass_Field {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int test= sc.nextInt();
        int [][] field = new int[4][4];
        
        for (int x = 0; x < test; x++) {
            
            //System.out.println("x");
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                   
                    field[i][j]=sc.nextInt();
                    
                }
            }
            
            if( field[0][0]==1 && field[1][1]==1  &&
                field[0][1]==1 && field[1][0]==1 ){
                
                System.out.println("2");
            
            }
            else if(field[0][0]==0 && field[1][1]==0 &&
               field[0][1]==0 && field[1][0]==0 ){
                
                System.out.println("0");
            }
            else{
                System.out.println("1");
            }
            
        }
    }
    
}
