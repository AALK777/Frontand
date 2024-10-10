// Fig. 12.25: MultipleSelectionFrame.java
// JList that allows multiple selections.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MultipleSelectionFrame extends JFrame 
{
   private final JList<String> colorJList; // list to hold color names
   private final JList<String> copyJList; // list to hold copied names
   private JButton copyJButton; // button to copy selected names
   private static final String[] colorNames = {"Black", "Blue", "Cyan",
      "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange", 
      "Pink", "Red", "White", "Yellow"};

   private final JList<String> fruitsJList; // list to hold fruit names
   private final JList<String> copyFruitsJList; // list to hold copied fruit names
   private JButton copyFruitsJButton; // button to copy selected fruits
   private static final String[] fruitsNames = {"Banana", "Maça", "Para",
      "Goiaba", "Abacaxi", "Abacate", "Laranja", "Melancia", "Pecego", 
      "Uva", "Coco", "Cana", "Limao"};

   // MultipleSelectionFrame constructor
   public MultipleSelectionFrame()
   {
      super("Multiple Selection Lists");
      setLayout(new FlowLayout());

      colorJList = new JList<>(colorNames); // list of color names
      colorJList.setVisibleRowCount(5); // show five rows
      colorJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
      add(new JScrollPane(colorJList)); // add list with scrollpane

      fruitsJList = new JList<>(fruitsNames); // list of fruit names
      fruitsJList.setVisibleRowCount(5); // show five rows
      fruitsJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
      add(new JScrollPane(fruitsJList)); // add list with scrollpane

      copyJButton = new JButton("Copy Colors >>>"); 
      copyJButton.addActionListener(new ActionListener() // anonymous inner class 
      {  
         @Override
         public void actionPerformed(ActionEvent event)
         {
            // place selected values in copyJList
            copyJList.setListData(colorJList.getSelectedValuesList().toArray(new String[0]));
         }
      }); 
      add(copyJButton); // add copy button to JFrame

      copyJList = new JList<>(); // list to hold copied color names
      copyJList.setVisibleRowCount(5); // show 5 rows
      copyJList.setFixedCellWidth(100); // set width
      copyJList.setFixedCellHeight(15); // set height
      copyJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
      add(new JScrollPane(copyJList)); // add list with scrollpane

      copyFruitsJButton = new JButton("Copy Fruits >>>");
      copyFruitsJButton.addActionListener(new ActionListener() // anonymous inner class 
      {  
         @Override
         public void actionPerformed(ActionEvent event)
         {
            // place selected values in copyFruitsJList
            copyFruitsJList.setListData(fruitsJList.getSelectedValuesList().toArray(new String[0]));
         }
      }); 
      add(copyFruitsJButton); // add copy button to JFrame

      copyFruitsJList = new JList<>(); // list to hold copied fruit names
      copyFruitsJList.setVisibleRowCount(5); // show 5 rows
      copyFruitsJList.setFixedCellWidth(100); // set width
      copyFruitsJList.setFixedCellHeight(15); // set height
      copyFruitsJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
      add(new JScrollPane(copyFruitsJList)); // add list with scrollpane
   } 

   public static void main(String[] args) 
   {
      MultipleSelectionFrame frame = new MultipleSelectionFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(300, 300);
      frame.setVisible(true);
   }
} // end class MultipleSelectionFrame
