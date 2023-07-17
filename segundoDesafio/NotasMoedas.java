package segundoDesafio;

import java.util.Locale;
import java.util.Scanner;

public class NotasMoedas {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();

        int[] notas = {100, 50, 20, 10, 5, 2};
        double[] moedas = {1, 0.50, 0.25, 0.10, 0.05, 0.01};

        System.out.println("NOTAS:");
        for (int i = 0; i < notas.length; i++){
            int quantidadeNotas = (int) (valor / notas[i]);
            valor %= notas[i];
            System.out.println(quantidadeNotas + "     nota(s) de R$ " + notas[i] + ".00");
        }

        System.out.println("MOEDAS:");
        for (int i = 0; i < moedas.length; i++){
            int quantidadeMoedas = (int) (valor / moedas[i]);
            valor %= moedas[i];
            System.out.println(quantidadeMoedas + "     moeda(s) de R$ " + String.format("%.2f", moedas[i]));
        }
        sc.close();
    }
}
