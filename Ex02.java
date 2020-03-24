import javax.swing.*;

public class Ex02
{
    public static void main(String... args)
    {
        int vetor[] = new int[100];
        int x;
        int y;
        String resp = "" ;
        for(x = 0; x <= 99 ; x++)
        {
                y = x*2 ;
                vetor[x] = y;
                resp += vetor[x] + " ";
            
        }
        JOptionPane.showMessageDialog(null,resp,"resposta", JOptionPane.INFORMATION_MESSAGE);
    }
}