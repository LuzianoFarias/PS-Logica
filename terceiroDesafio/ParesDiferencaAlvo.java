package terceiroDesafio;

import java.util.Arrays;
import java.util.Scanner;

public class ParesDiferencaAlvo {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        //Leitura do tamanho do array e do valor alvo
        int n = sc.nextInt();
        int k = sc.nextInt();

        //Leitura do array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        //Ordena o array em ordem crescente
        Arrays.sort(arr);

        int count = 0;
        int i = 0;
        int j = 1;

        //Percorre o array comparando cada par de elementos
        while (j < n){
            int diferenca = arr[j] - arr[i];
            if (diferenca == k){
                count++;
                j++;
            } else if (diferenca > k) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println(count);
        sc.close();
    }

}
