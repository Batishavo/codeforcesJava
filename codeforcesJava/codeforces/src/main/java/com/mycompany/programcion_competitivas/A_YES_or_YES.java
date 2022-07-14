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
import java.util.StringTokenizer;
public class A_YES_or_YES {
    
    public static void main(String[] args) {
        FastScanner sc=new FastScanner();
        
        int test= sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        
        for (int x = 0; x < test; x++) {
            char ch[] = sc.next().toCharArray();
            String cad= new String(ch);
            
            cad=cad.toUpperCase();
            
            if(cad.equals("YES")){
                
                System.out.println("YES");
            
            }
            else{
            
                System.out.println("NO");
                
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
