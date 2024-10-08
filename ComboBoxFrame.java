
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBoxFrame extends JFrame 
{
   private final JComboBox<String> imagesJComboBox; //variavel da classe, matris de string 
   private final JLabel label; 
   private static final String[] names = // variavel names, matris de string, matris de icones [] signica matris
      {"bug1.gif", "bug2.gif",  "travelbug.gif", "buganim.gif"}; // 
   private final Icon[] icons = { // final : significa leitura
      new ImageIcon(getClass().getResource(names[0])), // essas linhas de codigo sao vetores, compativeis com Icon
      new ImageIcon(getClass().getResource(names[1])), 
      new ImageIcon(getClass().getResource(names[2])),
      new ImageIcon(getClass().getResource(names[3]))};

   
   public ComboBoxFrame() // construtor
   { // inicio de bloco de codigos do construtor
      super("Testing JComboBox");// titulo superior   
      setLayout(new FlowLayout());    // 

      imagesJComboBox = new JComboBox<String>(names); //
      imagesJComboBox.setMaximumRowCount(3); // definindo o maximo de lihas 03 no flow layout, janela

      imagesJComboBox.addItemListener(// promove a ação o evento, o click, nas opições na janela
         new ItemListener() //adicionando um novo objeto
         {
            
            @Override
            public void itemStateChanged(ItemEvent event)// 
            {
               
               if (event.getStateChange() == ItemEvent.SELECTED)// if verifica o evento, colota do objeto 
                  label.setIcon(icons[// 
                     imagesJComboBox.getSelectedIndex()]);
            } 
         }
      ); 

      add(imagesJComboBox); 
      label = new JLabel(icons[0]); 
      add(label); 
   }
} // end class ComboBoxFrame

