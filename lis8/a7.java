/*
Losowe liczby
w indeksy parzyste - liczby parzyste
w indeksy nieparzyste - liczby nieparzyste

 */
package lis8;

import java.util.Random;

public class a7 {


    public static void main(String[] args) {
        Random r = new Random();
        int tab[][] = new int[10][10];
        int x;
        int a = 1;
        int b = 100;
        for(int w=0; w<10; w++){
            for(int k=0; k<10; k++){
                x = r.nextInt(b-a+1)+a;
                if(k%2!=0){
                    if(x%2==0) tab[w][k] = x;
                    else tab[w][k] = x+1;
                }
                if(k%2==0){
                    if(x%2!=0) tab[w][k] = x;
                    else if(x==100) tab[w][k] = x-1;
                    else tab[w][k] = x+1;
                }
            }
        }
        for(int w=0; w<10; w++){
            System.out.println();
            for(int k=0; k<10; k++){
                System.out.print(tab[w][k]+" ");
                
            }
            
        }
        System.out.println();
    }
    
}
