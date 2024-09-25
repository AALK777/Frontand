
import java.awt.FlowLayout; // importando o componente 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.SwingConstants; 
import javax.swing.Icon; 
import javax.swing.ImageIcon; 

public class LabelFrame extends JFrame // Declarando a classe LabelFrame. O extends está herdando o componente Jframe
{ // iniciando o bloco de codigos da classe LabelFlame
   private final JLabel label1; // estas tres linhas são declarações de variaveis. o private não exporta a variavel. O final serve para declarar uma variavel somente leitura. JLabel é o tipo da variavel. label1 é o nome da variavel
   private final JLabel label2; 
   private final JLabel label3; 

   // O construdor é maleavel, não pode ser protegido. Ele organiza os codigos. Tem que ter o mesmo nome da classe e do arquivo
   public LabelFrame()
   { // inicio bloco de codigos construtor
      super("Testing JLabel"); // metodo de interface. O super esta definindo o titulo da janela. Super vem de superior. 
      setLayout(new FlowLayout()); // Este codigo define o desenho (Layaout) Da Janela. O flowLayout significa, seguir o fluxo, ir na frente.

      // JLabel constructor with a string argument
      label1 = new JLabel("Label with text"); // este codigo está recebendo um novo objeto (Jlabel) o Texto da janela do código anterior 
      label1.setToolTipText("This is label1"); // este codigo esta definindo uma dica (setToolTipoText. Quando colocar o mouse em cima do elemento, texto na janela)
      add(label1); // add label1 to JFrame // este codigo está adicionando o os codigos label1, label1. Ele vai imprimiir, injetar, mostrar os textos na janela

      // JLabel constructor with string, Icon and alignment arguments
      Icon bug = new ImageIcon(getClass().getResource("bug1.png")); //Variavel bug, declaração de tipo Icon. está sendo enviado um parametro. (getClass)
      label2 = new JLabel("Label with text and icon", bug, // Este codigo está recenedo uma variavel de tipo label. A , dentro da declaração de paremetros serve como separador de parametros. 
         SwingConstants.LEFT); //Este codigo alinha os textos na janela, alinhamento espacial. Esta linha de codigo está exportando a variavel (LEFT)
      label2.setToolTipText("This is label2");
      add(label2); // add label2 to JFrame

      label3 = new JLabel(); // Este codigo está declarando uma variavel = esse sinal declara uma variavel. Este codigo atribui um abjedo
      label3.setText("Label with icon and text at bottom"); // Este codigo está definindo o texto (Label with icon and text at bottom) 
      label3.setIcon(bug); // Esta adicionando a variavel Icon. 
      label3.setHorizontalTextPosition(SwingConstants.CENTER); //Este codigo está definindo a posição do texto. O local de definição é centro da janela
      label3.setVerticalTextPosition(SwingConstants.BOTTOM); // Este codigo está definindo a posição do texto. O local de definição é baixo
      label3.setToolTipText("This is label3"); //Este codigo mostra uma dica quando colocado o mouse em cima. A mensagem é This is label3 
      add(label3); // Este código adiciona o label ao Jframe
   } 
} // Finalisa o codigo


