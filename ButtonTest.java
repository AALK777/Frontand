// Fig. 12.16: ButtonTest.java
// Testing ButtonFrame.
import javax.swing.JFrame;//  Importando o componente JFrame, modolo swing, biblioteca Javax

public class ButtonTest // declaração da classe butontesd
{
   public static void main(String[] args) //declaração do metodo main. construtor 
   { //inicio chave
      ButtonFrame buttonFrame = new ButtonFrame(); // declaração da variavel buttonframe do tipo button frame. declaração de tipo do arquivo e definindo variavel
      buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// definiindo a aperacão de fechamento padrão
      buttonFrame.setSize(275, 110); //definindo tamanho
      buttonFrame.setVisible(true); //mostranto a janela
   } 
} // end class ButtonTest

