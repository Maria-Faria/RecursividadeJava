/*Faça uma função recursiva que receba um número inteiro positivo N e exiba todos os números de N até 0 em ordem decrescente*/

package recursividade;

import javax.swing.JOptionPane;

public class Ex4 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro positivo")); 

        System.out.println("Números de " + n + " até 0");
        System.out.println("----------------------------------------");
        decrescente(n);
    }

    public static void decrescente(int n) {
        if(n == 0) {
            System.out.println("\t" + n);
        
        }else{
            System.out.println("\t" + n);
            decrescente((n - 1));
        }
    }
}
