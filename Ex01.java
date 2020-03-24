import javax.swing.*;
public class Ex01
{
    public static void main(String... args)
    {
        int vetor[] = new int [100];
        String resp = "";
        for(int x = 99; x>=0 ; x--)
        {
           vetor[x] = x;
           resp += "\n" + vetor[x] + " ";
        }
        JOptionPane.showMessageDialog(null,resp,"resposta", JOptionPane.INFORMATION_MESSAGE);
    }
}