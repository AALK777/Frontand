
import javax.swing.*; // (*) importa todos os componentes da memoria

public class ComboBoxTest// exportando a classe, comboboxtest 
{
   public static void main(String[] args) // metodo executor do classe
   { 
      ComboBoxFrame comboBoxFrame = new ComboBoxFrame(); 
      comboBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      comboBoxFrame.setSize(350, 150); 
      comboBoxFrame.setVisible(true); 
   } 
} // end class ComboBoxTest

