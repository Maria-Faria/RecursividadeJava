/*Faça uma função recursiva que receba um número inteiro positivo N e exiba todos os números de 0 até N em ordem crescente*/ 

package recursividade;

import javax.swing.JOptionPane;

public class Ex3 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro positivo"));

        System.out.println("Números de 0 até " + n);
        System.out.println("-------------------------------------------------");
        exibir(n);
    }

    public static void exibir(int n) {
        if(n == 0) {
            System.out.println("\t" + n);
            
        }else{
            exibir((n - 1));
            System.out.println("\t" + n);
        }
    }
}
