//  Adição.java
// Programa adicional que usa JOptionPane para entrada e saída.
import javax.swing.JOptionPane; 

public class Addition 
{
   public static void main(String[] args)
   {
      // obter entrada do usuário nas caixas de diálogo de entrada do JOptionPane
      String firstNumber = 
         JOptionPane.showInputDialog("Enter first integer");
      String secondNumber =
          JOptionPane.showInputDialog("Enter second integer");

      // converter entradas de String em valores int para uso em um cálculo
      int number1 = Integer.parseInt(firstNumber); 
      int number2 = Integer.parseInt(secondNumber);

      int sum = number1 + number2; // add numbers

      // exibir o resultado em uma caixa de diálogo de mensagem JOptionPane
      JOptionPane.showMessageDialog(null, "The sum is " + sum, 
         "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
   } 
} //Final do código 


