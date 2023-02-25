/*Crie uma função recursiva que retorne a soma dos elementos de um vetor de N inteiros*/

package recursividade;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ex5 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de elementos do vetor"));
        int vetor[] = new int[n];

        for(int i = 0; i < n; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "º elemento do vetor"));
        }

        JOptionPane.showMessageDialog(null, "Vetor: " + Arrays.toString(vetor) + "\nSoma dos elementos do vetor: " + soma(vetor, (n - 1)));
    }

    public static int soma(int vetor[], int n) {
        if(n == 0) {
            return vetor[0];
        
        }else{
            return vetor[n] + soma(vetor, (n - 1));
        } 
    }
}
