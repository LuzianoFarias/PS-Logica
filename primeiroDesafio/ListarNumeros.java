package primeiroDesafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListarNumeros {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        int quantidade = sc.nextInt();

        for (int i = 1; i <= quantidade; i++){
            int numero = sc.nextInt();

            if (numero % 2 == 0){
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }

        Collections.sort(pares);
        Collections.sort(impares,Collections.reverseOrder());

        for (int par : pares) {
            System.out.println(par);
        }

        for (int impar : impares) {
            System.out.println(impar);
        }

        sc.close();
    }
}
