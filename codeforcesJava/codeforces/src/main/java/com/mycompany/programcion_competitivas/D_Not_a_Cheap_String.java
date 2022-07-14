/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programcion_competitivas;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 


public class D_Not_a_Cheap_String {
    
    public static void main(String[] args) {
        
        FastScanner sc=new FastScanner();
        
        int test= sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        
        for (int x = 0; x < test; x++) {
            
            char ch[] = sc.next().toCharArray();
            int maximo =sc.nextInt();
            int total=0;
            String cad= new String(ch);
            //ordena string
            char[] chars = cad.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            
            for(int i=0;i<cad.length();i++){
                total+=cad.charAt(i)-'a'+1;
            }
            int flag=0;
            for(int i=sorted.length()-1;i>=0;i--){
                
                if(total<=maximo){
                   // System.out.println(i);
                    flag=1;
                    sorted=sorted.substring(0,i+1);
                    break;
                }
                total-=sorted.charAt(i)-'a'+1;
                
            }
           // System.out.println(sorted);
            if(flag==0){
                System.out.println("");
            }
            else{
                
                for(int i=0;i<cad.length();i++){
                    
                    String caracter=""+cad.charAt(i);
                    int posicion = sorted.indexOf(caracter);
                    if(posicion!=-1){
                        //System.out.println(sorted);
                        sorted=sorted.substring(0,posicion)+
                               sorted.substring(posicion+1);
                        System.out.print(caracter);
                        
                    }
                    
                }
                System.out.println("");
            }
            
        }
    }
    public static class FastScanner {
    BufferedReader br;
    StringTokenizer st;

    public FastScanner(String s) {
            try {
                    br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
            }
    }

    public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
    }

    String nextToken() {
            while (st == null || !st.hasMoreElements()) {
                    try {
                            st = new StringTokenizer(br.readLine());
                    } catch (IOException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                    }
            }
            return st.nextToken();
    }
    String next() {
        while (!st.hasMoreTokens())
                try {
                        st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                        e.printStackTrace();
                }
        return st.nextToken();
    }
    int nextInt() {
            return Integer.parseInt(nextToken());
    }

    long nextLong() {
            return Long.parseLong(nextToken());
    }

    double nextDouble() {
            return Double.parseDouble(nextToken());
    }
}

    
}
