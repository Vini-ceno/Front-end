import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MultipleSelectionFrame extends JFrame 
{
   private final JList<String> colorJList; 
   private final JList<String> copyJList; 
   private JButton copyJButton; 
   private final JList<String> FrutaJList; 
   private final JList<String> copyyJList; 
   private JButton copyyJButton; 


   // atribuição dos vetores na varialvel color names
   private static final String[] colorNames = {"Preto", "Azul", "Ciano", 
      "Cinza escuro", "cinza", "verde", "Cinza claro", "Magenta", "Laranja", 
      "Rosa", "Vermelho", "Branco", "Amarelo"};
      private static final String[] frutaNames = {"Abacaxi","Amora", "Banana", "Caju", 
      "Goiaba", "Laranja", "Maça", "Melância" , "Morango", "Uva"};
   
   
   public MultipleSelectionFrame()
   {
      super("Lista de seleção múltipla");
      setLayout(new FlowLayout());

      colorJList = new JList<String>(colorNames); 
      colorJList.setVisibleRowCount(5);
      colorJList.setSelectionMode(
         ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
      add(new JScrollPane(colorJList)); // o jscroolPane e JList são compativeis e esta sendo adicionada

      copyJButton = new JButton("Copiar >>"); 
      copyJButton.addActionListener(
         new ActionListener()  
         {  
            
            @Override
            public void actionPerformed(ActionEvent event) // Recebe o evento da ação acontecida, para ser sobrescrito o método não pode ser "static" , no caso esta sendo o ActionPerf.
            {
               
               copyJList.setListData( // invoca o método que define os dados da lista
                  // Coleta os valores selicionadas da lista (colorJList) e transforma em uma matriz de string "to array"= Transformar em matriz que esta iniciando em 0
                  colorJList.getSelectedValuesList().toArray( 
                     new String[0]));
            }
         } 
      ); 
      
      FrutaJList = new JList<String>(frutaNames); 
      FrutaJList.setVisibleRowCount(5);
      FrutaJList.setSelectionMode(
         ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
       // o jscroolPane e JList são compativeis e esta sendo adicionada

      copyyJButton = new JButton("Copiar >>"); 
      copyyJButton.addActionListener(
         new ActionListener()  
         {  
            
            @Override
            public void actionPerformed(ActionEvent event) // Recebe o evento da ação acontecida, para ser sobrescrito o método não pode ser "static" , no caso esta sendo o ActionPerf.
            {
               
               copyyJList.setListData( // invoca o método que define os dados da lista
                  // Coleta os valores selicionadas da lista (colorJList) e transforma em uma matriz de string "to array"= Transformar em matriz que esta iniciando em 0
                  FrutaJList.getSelectedValuesList().toArray( 
                     new String[0]));
            }
         } 
      );
      
      add(copyJButton); // Adiciona o copyJbutton na rendenização

      copyJList = new JList<String>(); // String é o tipo de vetores, Jlist é uma matriz, e entre as Tag é definido os tipos de vetores
      copyJList.setVisibleRowCount(5); // define quantidade de linhas
      copyJList.setFixedCellWidth(100); // define a largura
      copyJList.setFixedCellHeight(15); // Define a altura 
      copyJList.setSelectionMode(
         ListSelectionModel.SINGLE_INTERVAL_SELECTION); // modelo de seleção de lista
      
      add(new JScrollPane(copyJList)); 
      add(new JScrollPane(FrutaJList));
      add(copyyJButton); // Adiciona o copyJbutton na rendenização

      copyyJList = new JList<String>(); // String é o tipo de vetores, Jlist é uma matriz, e entre as Tag é definido os tipos de vetores
      copyyJList.setVisibleRowCount(5); // define quantidade de linhas
      copyyJList.setFixedCellWidth(100); // define a largura
      copyyJList.setFixedCellHeight(15); // Define a altura 
      copyyJList.setSelectionMode(
         ListSelectionModel.SINGLE_INTERVAL_SELECTION); // modelo de seleção de lista
       add(new JScrollPane(copyyJList)); 
      } 
      
   } 


//Atividade, dobrar o tamanho da tela, e adiconar outra lista de Frutas, outro botão de copia e outra lista vazia 

