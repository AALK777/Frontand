// A linha abaixo importará o componente Jframe do módolo swing da biblioteca (oacote) Javax

// A linha abaixo está declarando a classe LabelTest 
import javax.swing.JFrame;

public class LabelTest 
{
   public static void main(String[] args)
  {
      LabelFrame labelFrame = new LabelFrame(); // Essa linha de codigo está declarando a LabelFrame. 
      labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // aqui o LabelFrame esta invocando . seTDefaltCloseOperation = definindo o padral de fechamento da operação. A definição que está sendo invocada é fechar ao sair (jFrame.EXIT_ON_CLOSE)
      labelFrame.setSize(260, 180); // Esta linha está definindo o tamanho. (setando) Definido largura:260 e altura:180 pixels 
     labelFrame.setVisible(true);//esta linha está definindo visualização
  }
}
// encerra o codigo


