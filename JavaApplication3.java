package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
        int indice =13, soma = 0, k = 0;
        
        while(k < indice){
            k = k+1;
            soma = soma + k;
        }
        
        System.out.print(soma);
        
        //2) Fibonacci
        Scanner scan = new Scanner(System.in);

        int atual = 1, anterior = 0, casa = 10, valor;

        System.out.println("digite um valor:");
        valor = scan.nextInt();

        boolean eFibonacci = false;

        System.out.print(atual + "\t");
        for (int f = 0; f <= casa; f++) {
            atual = atual + anterior;
            anterior = atual - anterior;
            System.out.print(atual + "\t");

            if (valor == atual) {
                eFibonacci = true;
                break;
            }
        }
        if (eFibonacci) {
            System.out.println("\nO seu numero pertence a sequencia");
        } else {
            System.out.println("\nSeu numero não pertence a sequencia");
        }
        
        //5) Inverter String
        String stringOrg = "Teste";

        String stringInv = "";
        for (int i = stringOrg.length() - 1; i >= 0; i--) {
            stringInv += stringOrg.charAt(i);
        }

        System.out.println("String original: " + stringOrg);
        System.out.println("String invertida: " + stringInv);
    }
    }

