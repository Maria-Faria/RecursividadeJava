/*Implemente, de forma recursiva, uma função int pot(int x, int n) que, dados dois números inteiros x e n, calcula o valor de x^n*/

package recursividade;

import javax.swing.JOptionPane;

public class Ex2 {
    public static void main(String[] args) {
        int x, n;

        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a base da potência"));
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o expoente da potência"));

        JOptionPane.showMessageDialog(null, (String.format("%d ^ %d = %d", x, n, pot(x, n))));
    }

    public static int pot(int x, int n) {
        if(n == 0) {
            return 1;
        
        }else {
            return x * pot(x, (n - 1));
        }
    }
}
