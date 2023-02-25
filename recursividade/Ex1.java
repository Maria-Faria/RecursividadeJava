/*Crie uma função recursiva int soma(int) que receba um número inteiro positivo N e calcule o somatório dos números de 1 a N*/

package recursividade;

import javax.swing.JOptionPane;

public class Ex1 {
    public static void main(String[] args) {
        int n, result = 0, i = 1;
        
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro positivo"));//5

        }while(n < 0);

        JOptionPane.showMessageDialog(null, "Soma dos números de 1 a " + n + " = " + somar(n, i, result));
    }

    public static int somar(int n, int i, int result) {
        
        if(i <= n) {
            result += i;
            i++;
            return somar(n, i, result);
        
        }else{
            return result;
        }
    }
}
