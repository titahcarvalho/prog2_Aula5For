package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, maior=0, menor=0, contador=0, soma=0, media=0;

        for ( int i = 0; i<= 10; i++) {
            System.out.println("Digite um numero:");
            numero = entrada.nextInt();
            if ((numero <= 10) && (numero >= 0)){
                if (i == 0) {
                    menor = numero;
                }
                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
                soma += numero;
                contador++;
            }else {
                System.out.println("\nNúmero " + numero + " fora da faixa de 0 a 10.");
            break;
            }

            if (contador > 0) {
                media = soma / contador;
            }
            System.out.println("Maior: " + maior + "\nMenor: " + menor);
            System.out.println("Média:" + media);

        }
        entrada.close();
    }
}

