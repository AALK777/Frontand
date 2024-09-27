// Fig. 12.15: ButtonFrame.java
// Command buttons and action events.
import java.awt.FlowLayout;// flowlayout é a janela exibida fluidamente. a forma como renderiza a saida das camadas
import java.awt.event.ActionListener;// clicando nos botoes da janela. captura de eventos, clik
import java.awt.event.ActionEvent;//clicando nos botoes da janela, promove o evento da execução anterior
import javax.swing.JFrame;// Jframe estrutura a janela
import javax.swing.JButton;// é o imagem do botao da janela 
import javax.swing.Icon;// responsavel pelos botoes centrais
import javax.swing.ImageIcon;//carrega a imagem 
import javax.swing.JOptionPane;// mensagem que aparece quando clica nos botoes

public class ButtonFrame extends JFrame // herança que o buttonFrame esta recebendo, a herança é toda a estrutura da janela 
{// abre chaves, inicia o bloco de codigo buttonframe
   private final JButton plainJButton; // button with just text// declaração de tipo de variaveis
   private final JButton fancyJButton; // button with icons

   // ButtonFrame adds JButtons to JFrame
   public ButtonFrame()// construtor,mesmo nome da classe e do arquivo
   {
      super("Testing Buttons");// super define o titulo, seper vem de superior
      setLayout(new FlowLayout());// definindo a janela 

      plainJButton = new JButton("Plain Button"); // button with text// esta definindo o nome do botão. botão com texto
      add(plainJButton); // add plainJButton to JFrame

      Icon bug1 = new ImageIcon(getClass().getResource("bug1.gif"));// declarando e atribuindo o icone, a imagem que aparece na janela 
      Icon bug2 = new ImageIcon(getClass().getResource("bug2.gif"));// eclarando e atribuindo o icone 2, a imagem que aparece na janela 
      fancyJButton = new JButton("Fancy Button", bug1); // set image// dividindo a o botao entre texto e imagem do icone 
      fancyJButton.setRolloverIcon(bug2); // set rollover image// invoca a imagem dois quando passa o cursor do mouse no botao 
      add(fancyJButton); // add fancyJButton to JFrame// após definico o passar o cursor no botão, esse codigo adiciona, define está ação

      // create new ButtonHandler for button event handling 
      ButtonHandler handler = new ButtonHandler();// executa a operação manual, essa ação vem do buttonhandler
      fancyJButton.addActionListener(handler);//
      plainJButton.addActionListener(handler);//
   }

   // inner class for button event handling
   private class ButtonHandler implements ActionListener //controla as ações dentro da janela 
   {
      // handle button event
      @Override// 
      public void actionPerformed(ActionEvent event)// declara o evento da ação 
      {
         JOptionPane.showMessageDialog(ButtonFrame.this, String.format( // exibindo dialogo da mensagem 
            "You pressed: %s", event.getActionCommand()));// pega o comando da ação do botão, com o texto 
      }
   } 
} // end class ButtonFrame// fechando a classe buttonFrame 

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
