import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuFrame extends JFrame 
{
   private final Color[] colorValues = 
      {Color.BLACK, Color.BLUE, Color.RED, Color.GREEN};   // Vetores da Matriz colorValues
   private final JRadioButtonMenuItem[] colorItems; // color menu items
   private final JRadioButtonMenuItem[] fonts; // font menu items
   private final JCheckBoxMenuItem[] styleItems; // font style menu items
   private final JLabel displayJLabel; // displays sample text
   private final ButtonGroup fontButtonGroup; // manages font menu items
   private final ButtonGroup colorButtonGroup; // manages color menu items
   private int style; // used to create style for font
   private final int[] fontSizes={12, 24, 48, 72};
   private final JRadioButtonMenuItem[] sizes;
   private final ButtonGroup sizeButtonGroup;

   // Construtor MenuFrame pois o método tem o mesmo nome da classe e o nome do arquivo
   public MenuFrame()
   {
      super("Usando JMenus");     

      JMenu fileMenu = new JMenu("Arquivo"); 
      fileMenu.setMnemonic('A'); 

      // c
      JMenuItem aboutItem = new JMenuItem("Sobre...");
      aboutItem.setMnemonic('S'); // o método setMnemonic define o atalho para executar as ações na janela
      fileMenu.add(aboutItem); //Adicionando o aboutitem ( o mnemonic) no filme Menu
      aboutItem.addActionListener(
         new ActionListener() 
         {  
            // 
            @Override
            public void actionPerformed(ActionEvent event)
            {
               JOptionPane.showMessageDialog(MenuFrame.this, // invoca o Painel de opções e invoca o método que mostra a menssagem de diálogo, o primeiro método tem que ser declarado o objeto onde ira aparecer
                  "Esse é o melhor elemento químico\n  da tabela periódica",
                  "Sobre", JOptionPane.INFORMATION_MESSAGE);
            } 
         } 
      ); 
 
      JMenuItem exitItem = new JMenuItem("Sair"); 
      exitItem.setMnemonic('r'); // para o mnmonic funcionar tem que ser a uma letra do texto e deve estar idêntico
      fileMenu.add(exitItem); // Adicionando no fileMenu
      exitItem.addActionListener(
         new ActionListener() 
         {  
            // 
            @Override
            public void actionPerformed(ActionEvent event)
            {
               System.exit(0); 
            } 
         }
      ); 

      JMenuBar bar = new JMenuBar();  // Declarando e atribuindo a barra de menu
      setJMenuBar(bar); // como foi herdado o Jframe, esta sendo utilizado sem necessitar declarar o tipo Jframe antes
      bar.add(fileMenu); // Adicionando o fileMenu na barra de menu

      JMenu formatMenu = new JMenu("Formato"); // Declarando e atribuindo o menu "formato" 
      formatMenu.setMnemonic('F'); 

      // 
      String[] colors = {"Preto", "Azul", "Vermelho", "Verde"};

      JMenu colorMenu = new JMenu("Cores"); // Declarando e atribuindo o submenu "Cores"
      colorMenu.setMnemonic('C'); 

      //
      colorItems = new JRadioButtonMenuItem[colors.length];// definindo a quatnidade de vetores
      colorButtonGroup = new ButtonGroup();  // criação do novo objeto ButtonGroup
      ItemHandler itemHandler = new ItemHandler(); // Declaração da Váriavel ItemHandler

      //
      for (int count = 0; count < colors.length; count++) // estrutura de repetição, pré definida que depende de uma ação, dentro do for, tem que ser teclarado 3 ações, 1. declarando a 
      // variavel do tipo inteiro, 2. enquanto o count for menor que o tamanho da matriz "length" (comprimento, quantidade de vetores), 3. Faz com que a varíavel some +1 (++)
      {
         colorItems[count] = // color item 0 ira receber um novo objeto Jradibutuon, que ira receber o count e o vetor 0 color
            new JRadioButtonMenuItem(colors[count]); 
         colorMenu.add(colorItems[count]);  // adicionando o item de cores que foi declarado dentro do menu de cor
         colorButtonGroup.add(colorItems[count]); // adicionando no colorbuttonGroup que o menu de lista de cores a ser selecionado
         colorItems[count].addActionListener(itemHandler);
      }

      colorItems[0].setSelected(true); // define como selecionado o vetor 0 do coloritens

      formatMenu.add(colorMenu); // adiciona o menu de cor dentro do FormatMenu
      formatMenu.addSeparator(); // invoca o método que rendeiza uma linha no menu para separar

      // criando o menu fontes
      String[] fontNames = {"Serif", "Monospaced", "SansSerif","Verdana", "BrushScript", "Papyrus" };
      JMenu fontMenu = new JMenu("Fontes"); // Declara e atribuiu para criar o menu e seu nome
      fontMenu.setMnemonic('n'); // Atalho para abrir o menu

      //  Atribui o novo objeto  JrRadioButtonMenuItem, sendo um item, e define o tamanho da matriz 
      fonts = new JRadioButtonMenuItem[fontNames.length];
      fontButtonGroup = new ButtonGroup(); // ButtonGroup para quando selecionar um outro valor, ele automaticametno desseleciona 

      
      for (int count = 0; count < fonts.length; count++) 
      {
         fonts[count] = new JRadioButtonMenuItem(fontNames[count]);
         fontMenu.add(fonts[count]); 
         fontButtonGroup.add(fonts[count]); 
         fonts[count].addActionListener(itemHandler); 
      } 

      fonts[0].setSelected(true); // defune como selecionado o vetor 0 no caso o Serif
      fontMenu.addSeparator(); 

      String[] styleNames = {"Negrito", "Itálico"}; 
      styleItems = new JCheckBoxMenuItem[styleNames.length];
      StyleHandler styleHandler = new StyleHandler(); // por ser de outra classe, tem que utilizar outro "tipo" de Handler
     
      for (int count = 0; count < styleNames.length; count++) 
      {
         styleItems[count] = 
            new JCheckBoxMenuItem(styleNames[count]); 
         fontMenu.add(styleItems[count]); 
         styleItems[count].addItemListener(styleHandler); 
      }

      fontMenu.addSeparator(); 

       
      sizes = new JRadioButtonMenuItem[fontSizes.length];
      sizeButtonGroup = new ButtonGroup();
           
      for (int count = 0; count < fontSizes.length; count++) 
      {
         sizes[count] = 
            new JRadioButtonMenuItem(String.valueOf(fontSizes[count])); 
         fontMenu.add(sizes[count]);
         sizeButtonGroup.add(sizes[count]); 
         sizes[count].addActionListener(itemHandler); 
      }
      sizes[3].setSelected(true);
      

      formatMenu.add(fontMenu);  //adiciona o fontmenu dentro do FormatMenu
      bar.add(formatMenu); // adicona o FormatMenu na Barra
      
     
      //  Mostra a escrita na tela, e seu alinhamento
      displayJLabel = new JLabel("Molibidênio (Mb)", SwingConstants.CENTER);
      displayJLabel.setForeground(colorValues[0]); // definição da cor do texto, sendo o primeiro vetoro da matriz colorValues
      displayJLabel.setFont(new Font("Serif", Font.PLAIN, 72));

      getContentPane().setBackground(Color.CYAN); // método abstrato pois como ele foi hedado nao é necessario definir o tipo
      add(displayJLabel, BorderLayout.CENTER);
      setSize(750, 220); //estava no arquivo MenuTest.java
      setVisible(true); //estava no arquivo MenuTest.java 
   } 

   // Classe ItemHandler esta sendo injetando  o objeto ActionListener (polimorfismo) por ser um objeto ele vira o construtor da classe
   private class ItemHandler implements ActionListener 
   {
      // 
      @Override
      public void actionPerformed(ActionEvent event) //Parâmetro que ira capturar os eventos
      {
         
         for (int count = 0; count < colorItems.length; count++)
         {
            if (colorItems[count].isSelected()) 
            {
               displayJLabel.setForeground(colorValues[count]); // Caso selecionado ira colocar a cor na fonte, da respecitivo valor da matriz
               break; // utilizado para o programo sair do laço
            } 
         } 

        
         for (int count = 0; count < fonts.length; count++)
         {
            if (event.getSource() == fonts[count]) // ira coletar a origem das fontes
            {
               displayJLabel.setFont(
                  new Font(fonts[count].getText(), style, 72)); // Busca os vetores, e o texto, definindo a fonte e o tamanho da fonte
            }
         }

         for (int count = 0; count < fontSizes.length; count++)
         {
            if (sizes[count].isSelected()) 
            {
               displayJLabel.setFont(
                  new Font(displayJLabel.getFont().getName() ,style, fontSizes[count]));
            } 
         } 

         repaint(); // Rerendenizando 
      } 
   } 

   //Classe que ira definir os esilos 
   private class StyleHandler implements ItemListener 
   {
      
      @Override
      public void itemStateChanged(ItemEvent e) //Sobreescrevendo o método itemSateChanged
      {
         String name = displayJLabel.getFont().getName(); 
         Font font; 

         
         if (styleItems[0].isSelected() && // se os 2 estão selicionados && = e
              styleItems[1].isSelected())
            font = new Font(name, Font.BOLD + Font.ITALIC, displayJLabel.getFont().getSize());
         else if (styleItems[0].isSelected())
            font = new Font(name, Font.BOLD, displayJLabel.getFont().getSize());
         else if (styleItems[1].isSelected())
            font = new Font(name, Font.ITALIC, displayJLabel.getFont().getSize());
         else
            font = new Font(name, Font.PLAIN, displayJLabel.getFont().getSize());

         displayJLabel.setFont(font);
         repaint(); 
      } 
   } 
} 



