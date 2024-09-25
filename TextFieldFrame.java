// Fig. 12.9: TextFieldFrame.java
// JTextFields and JPasswordFields.
import java.awt.FlowLayout; //componente modulo biblioteca pacote
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class TextFieldFrame extends JFrame // herdando 
{// inicio da classe TextFielFrame
   private final JTextField textField1; // text field with set size//Declaração de variavel
   private final JTextField textField2; // text field with text
   private final JTextField textField3; // text field with text and size
   private final JPasswordField passwordField; // password field with text

   // TextFieldFrame constructor adds JTextFields to JFrame
   public TextFieldFrame()// construtor/ public exporta o construtor pra ser importado
   {// inicio do bloco de codigos do construtor textfieldframe
      super("Testing JTextField and JPasswordField");// Defini o titulo da janela
      setLayout(new FlowLayout());

      // construct textfield with 10 columns
      textField1 = new JTextField(10); // está defindo 10 colunas
      add(textField1); // add textField1 to JFrame // Adicionando o textfild

      // construct textfield with default text
      textField2 = new JTextField("Enter text here");// Está atribuindo um novo textfield. com texto para janela
      add(textField2); // add textField2 to JFrame

      // construct textfield with default text and 21 columns
      textField3 = new JTextField("Uneditable text field", 21);// atribuindo um novo textfild com uma coluna de texto definida. setEditable é um codigo para não ser editado
      textField3.setEditable(false); // disable editing
      add(textField3); // add textField3 to JFrame

      // construct passwordfield with default text
      passwordField = new JPasswordField("Hidden text");//Está sendo atribudo uma senha, oculta 
      add(passwordField); // add passwordField to JFrame/ adicionando senha

      // register event handlers
      TextFieldHandler handler = new TextFieldHandler();// Handler é um manipulador dos campos texto. hansler é uma variavel
      textField1.addActionListener(handler);// adiciona um escutador de ação (enviar o handler) esses quatro codigo vão enviar o mesmo metodo
      textField2.addActionListener(handler);
      textField3.addActionListener(handler);
      passwordField.addActionListener(handler);
   } // end TextFieldFrame constructor

   // private inner class for event handling
   private class TextFieldHandler implements ActionListener //Este codigo injeta actionlistener dentro da classe textfildhandler. 
   {//inicio do bloco da classe textfildhandler
      // process textfield events
      @Override// Este codigo significa que pode ser alterado tudo que esta abaixo. o (@)significa alerta. Sobrescreve public void actionPerformed(ActionEvent event) 
      public void actionPerformed(ActionEvent event)// ação que determina o que será executado abaixo. para receber as informações é necessario (event)
      {//inicio do bloco de codigo actionPerformed
         String string = ""; //Definindo o tipo da variavel. atribuindo um texto vazio
         // user pressed Enter in JTextField textField1
         if (event.getSource() == textField1)// If é um algoritimo de validação, ele permite validar. dois sinais de == comparação. comparar lado esquerdo com lado direito. Getsource irá retornar verdadeira
            string = String.format("textField1: %s",// a string que antes era vazia recebe um novo texto, formatado. o texto inserido é textfild1 (%)retorna um texto. 
               event.getActionCommand()); // esta codigo captura o texto do parametro events do codigo a cima. insere o texto na janela de pesquisa

         // user pressed Enter in JTextField textField2
         else if (event.getSource() == textField2)//esses algoritimos Else if são execuções dentro da janela, como texto
            string = String.format("textField2: %s",
               event.getActionCommand());

         // user pressed Enter in JTextField textField3
         else if (event.getSource() == textField3)
            string = String.format("textField3: %s", 
               event.getActionCommand());

         // user pressed Enter in JTextField passwordField
         else if (event.getSource() == passwordField)
            string = String.format("passwordField: %s", 
               event.getActionCommand());

         // display JTextField content
         JOptionPane.showMessageDialog(null, string); // Invocação de uma mensagem de dialogo. parametro null pode ser invocada em qualquer momento na caixa de texto, janela.
      }// fim da classe privada
   } // end private inner class TextFieldHandler
} // end class TextFieldFrame// fim da classe textfildframe

