package quartoDesafio;

import java.util.Scanner;

public class DecifrarFrases {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha após o valor de n

        for (int i = 0; i < n; i++){
            String linha = sc.nextLine();

            //Decifrar a linha
            String decifrada = decifrarLinha(linha);

            System.out.println(decifrada);
        }
        sc.close();
    }

    private static String decifrarLinha(String linha){
        int tamanho = linha.length();
        StringBuilder decifrada = new StringBuilder();

        //Decifra a metade esquerda da linha (da metade até o início)
        for (int i = tamanho / 2 - 1; i >= 0; i--){
            decifrada.append(linha.charAt(i));
        }

        //Decifra a metade direita da linha (do tamanho -1 até a metade +1)
        for (int i = tamanho - 1; i > tamanho / 2; i--){
            decifrada.append(linha.charAt(i));
        }
        return decifrada.toString();
    }
}
