//Yasmin Kioko Shimabuku

package atividade2;

import java.util.Arrays;

public class AtividadeSomativa2 {

    public static void main(String[] args){
        int vetor [] = {3,6,8,1,4,9,0}; //vetores iguais para os dois métodos

        System.out.println("Original:");
        System.out.println(Arrays.toString(vetor));

        selection_sort(vetor, vetor.length);
        System.out.println("SelectionSort:");
        System.out.println(Arrays.toString(vetor));
        

        System.out.println("BubbleSort:");
        bubble_sort(vetor, vetor.length);
        System.out.println(Arrays.toString(bubble_sort(vetor, vetor.length)));
    }

    private static void selection_sort(int lista[], int n){

        int menor, auxiliar;

        for (int i = 0; i < n-1; i++) { //iteração atrelada ao tamanho do vetor n

            menor = i; // menor posição

            for (int j = i+1; j<n; j++){ // verifica as proximas posições
                if (lista[j] < lista[menor]){ // se j for menor que i
                    menor = j; //guarda numero onde j está agora é o menor
                }
            }
            
            auxiliar = lista[i]; // vetor de i recebe auxiliar
            lista[i] = lista[menor]; // o item na posição i é o menor
            lista[menor] = auxiliar; // guarda o vetor

        }
    }

    private static int[] bubble_sort(int lista[], int n){ //com recursividade

        int auxiliar;

        if (n == 1){
            return lista;
        } else {
            for (int i = 0; i < n-1; i++){
                if (lista[i] > lista [i+1]){
                    auxiliar = lista[i];
                    lista[i] = lista[i+1];
                    lista[i+1] = auxiliar;
                }
            }
        } return bubble_sort(lista, n-1);

    }

}