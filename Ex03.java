import javax.swing.*;
public class Ex03
{
    public static void main(String... args)
    {
       int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos numeros será digitar"));
       int vetor[] = new int[x];
       int soma = 0 ; 
       double result = 0;
       for (int i = 0 ; i < x ; i++)
       {
         vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero"));
         soma += vetor[i];
       }
       result = soma/x ; 
       JOptionPane.showMessageDialog(null, result);
    }

}