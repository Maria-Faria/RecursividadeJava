/*Escreva uma função recursiva que retorne o menor elemento de um vetor*/

package recursividade;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex6 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de elementos do vetor"));
        int vetor[] = new int[n];
        int menor = 0;

        for(int i = 0; i < n; i++) {
            vetor[i] = (int)(Math.random() * 100);
            menor = vetor[0];
        }

        JOptionPane.showMessageDialog(null, Arrays.toString(vetor) + "\nO menor elemento do vetor é " + menorElemento(vetor, (n - 1), menor));
    }

    public static int menorElemento(int vetor[], int n, int menor){
        if(n == 0) {
            return menor;
        }
        
        if(vetor[n] < menor) {
            menor = vetor[n]; 
        }
        
        return menorElemento(vetor, (n - 1), menor);
    }   
}