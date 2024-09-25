// Fig. 12.10: TextFieldTest.java
// Testing TextFieldFrame.
import javax.swing.JFrame; //Este codigo está importando componente JFrame da modulo swing biblioteca javax

public class TextFieldTest // declação 
{
   public static void main(String[] args) // declaraçãp do medodo main
   { 
      TextFieldFrame textFieldFrame = new TextFieldFrame(); // declaração da variavel textFielFrame. Declaração de um novo objeto 
      textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Esse codigo está definindo, Jframe
      textFieldFrame.setSize(350, 100); //Este codigo define o tamanho
      textFieldFrame.setVisible(true); //Este codigo está definindo o vizual
   } 
} // end class TextFieldTest // fim da classe textfildtest

