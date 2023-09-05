import javax.swing.JOptionPane;

public class SomaDoisNumeros{
    public static void main(String [] args){
        //declarando variável

        double op1;
        double op2;
        double resultado;
        
        //entrada
        op1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro operando"));

        op2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo operando"));
        //processamento
        resultado = op1+op2;

        //saida
        JOptionPane.showMessageDialog(null,resultado);
    }
}