package com.mycompany.programcion_competitivas;

import java.util.Scanner;

public class B_Permutation {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();
        int [] arr = new int[20000000];
        for (int x = 0; x < test; x++) {
            
            int cost =0;
            int n=sc.nextInt();
            
            for(int i=0;i<=n;i++){
                arr[i]=0;
            }
            
            System.out.print(2+"\n"+1+" ");
        
            for(int i=2;i<=n;i++){
                
                if(arr[i]==0){
                    
                    System.out.print(i+" ");
                    arr[i]=1;
                    for(int j=i+i; ;j*=2){
                        if(j>n){
                            break;
                        }
                        if(arr[j]==0){
                      
                            arr[j]=1;
                            System.out.print(j+" ");
                            
                        }
                        
                        
                    }
                    
                }
                
            }
            System.out.println("");
   
        }
        
    }
    
}
