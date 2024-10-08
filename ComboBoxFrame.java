//import java.awt.FlowLayout; //import java.awt.event.ItemListener; //import java.awt.event.ItemEvent; //import javax.swing.JFrame;//import javax.swing.JLabel;//import javax.swing.JComboBox;//import javax.swing.Icon;//import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBoxFrame extends JFrame 
{
   //declaração das váriaveis, sendo uma delas uma matriz de string , "final" = somente leiteura de uso exclusivo da classe = "priveite"
   private final JComboBox<String> imagesJComboBox; 
   private final JLabel label; 
   //declaração da váriavel com os nomes dos arquivos, sendo uma matriz de string
   private static final String[] names = 
      {"bug1.gif", "bug2.gif",  "travelbug.gif", "buganim.gif"};
   // Varíavel do tipo matriz de icones, usando a chave "{" para declaração dos vetotes, que são separados utilizando a "," , onde cada vetor esta recebendo um novo objeto
   // imageIcon sendo compatáviel com a matriz de icone, dentro dos parâmetros temos 2 métodos, o getClass irá fazer a leitura da classe, e o getResource que vai coletar o recurso
   // do parâmetro names   
   private final Icon[] icons = { 
      new ImageIcon(getClass().getResource(names[0])),
      new ImageIcon(getClass().getResource(names[1])), 
      new ImageIcon(getClass().getResource(names[2])),
      new ImageIcon(getClass().getResource(names[3]))};
      // Construtor ComboBoxFrame () tendo o mesmo nome da classe e o mesmo nome do arquivo   
   public ComboBoxFrame()
   {
      // Altera o titulo da parte superior
      super("Testing JComboBox"); 
      // Define a maneira de rendenização do quadro
      setLayout(new FlowLayout());      
      // Declaração da váriavel e atribuição com um novo objeto sendo uma Matriz de String com a tag, que tem como parâmetros os nomes            
      imagesJComboBox = new JComboBox<String>(names);
      // Invocação do método que define o número de linhas que serão exibidas 
      imagesJComboBox.setMaximumRowCount(3); 
      // Método addItemListener que ira receber o evento, sendo definido um novo objeto 
      imagesJComboBox.addItemListener(
         new ItemListener() 
         {
            //Sobrescrição do método ItemStateChanged 
            @Override
            public void itemStateChanged(ItemEvent event)
            {
               // validação onde verifica , quando o método coleta o estado do item, se o evento tiver o estado "selected", irá definir o icone na label  
               if (event.getStateChange() == ItemEvent.SELECTED)
                  label.setIcon(icons[
                     // irá coletar o número que foi selecionado no ImagesJcomboBox, enviando para dentro do parâmetro Icons
                     imagesJComboBox.getSelectedIndex()]);
            } 
         } 
      ); 
      //adciona para rendenização   
      add(imagesJComboBox); 
      // define o primeiro icone, ao iniciar o código
      label = new JLabel(icons[0]);
      // adciona para rendenização  
      add(label); 
   }
} 

