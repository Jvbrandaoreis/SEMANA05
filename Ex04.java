import javax.swing.*;

public class Ex04
{
    public static void main(String... args)
    {
        int vetor[] = new int[100];
        int y = 0;
        String resp = "";
        int i;
        for(i=0; y == 0 ; i++)
        {
            int dig = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero ou 0 para sair da aplicação"));
            if(dig == 0)
            {
                y = 1;
            }
            else
            {
                vetor[i] = dig;
                resp += vetor[i] + " ";
            }
        }
        i -= 1;
        JOptionPane.showMessageDialog(null,"Quantidade de numeros digitados:" + i + "\n" + "Os numeros " + resp);
    }

}