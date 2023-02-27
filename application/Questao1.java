package application;

import java.util.Scanner;

public class Questao1 { 

    public static void main(String[]args){ 

        Scanner sc = new Scanner(System.in); 

        System.out.println("Digite um número: "); 

        int numero = sc.nextInt();  

        if(numero % 2 == 0){ 
            System.out.printf("%d é par", numero); 
        } else { 
            System.out.printf("%d é ímpar", numero); 
        } 
    }     
} 