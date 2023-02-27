package application;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor (intervalo máximo): ");
        int valorMaximo = sc.nextInt(); // Entrada do valor máximo
      

        System.out.println("Digite o segundo valor (intervalo mínimo)");  
        for (int i = sc.nextInt(); i <= valorMaximo; i++) { // Entrada do valor mínimo (i)
            if(i % 3 == 0){ // Verifica quais números são divisíveis por 3
                System.out.println(i); // Imprime os valores divisíveis por 3
            } 
        }
    }
}
