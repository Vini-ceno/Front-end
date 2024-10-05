//import java.awt.FlowLayout;
//import java.awt.Font;
//import java.awt.event.ItemListener;
//import java.awt.event.ItemEvent;
//import javax.swing.JFrame;
//import javax.swing.JTextField;
//import javax.swing.JRadioButton;
//import javax.swing.ButtonGroup;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
//import java.awt.PageAttributes.ColorType;
// herda a classe Jframe, adicionando os dados na classe
public class RadioButtonFrame extends JFrame 
{
   // usando o private para restrigir o seu uso somente dentro da classe
   private JTextField textField; 
   private Font plainFont; 
   private Font boldFont; 
   private Font italicFont; 
   private Font boldItalicFont; 
   private Color blackColor; 
   private Color redColor; 
   private Color blueColor; 
   private Color yellowColor; 
   private JRadioButton plainJRadioButton; 
   private JRadioButton boldJRadioButton; 
   private JRadioButton italicJRadioButton; 
   private JRadioButton boldItalicJRadioButton; 
   private JRadioButton blackJRadioButton; 
   private JRadioButton redJRadioButton; 
   private JRadioButton blueRadioButton; 
   private JRadioButton yellowRadioButton; 
   private ButtonGroup radioGroup;
   private ButtonGroup colorRadioGroup;

   
   public RadioButtonFrame()
   {
      // o Super é o titulo superior da janela
      super("RadioButton Teste");
      // Define a sáida de camadas por fluxo
      setLayout(new FlowLayout()); 
      // declaração e atribuição de váriavel, o novo objeto JTextFiel 
      textField = new JTextField("Veja o estilo da fonte mudar", 25);
      //adiciona o textField na janela
      add(textField); 

      // Atribuição das variaveis com os objetos que serão selecionados na janela estando somente o primeiro selecionado
      plainJRadioButton = new JRadioButton("Normal", true);
      boldJRadioButton = new JRadioButton("Negrito", false);
      italicJRadioButton = new JRadioButton("Itálico", false);
      boldItalicJRadioButton = new JRadioButton("Negrito/Itálico", false);
      
      boldJRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
      italicJRadioButton.setFont(new Font("Arial", Font.ITALIC, 14));
      boldItalicJRadioButton.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 14));
      // Adicição das váriaveis na janela
      add(plainJRadioButton); 
      add(boldJRadioButton); 
      add(italicJRadioButton); 
      add(boldItalicJRadioButton);

      // Agrupando as váriaveis no RadioGroupo no qual foi atribuido um novo objeto Buttogroup, por serem do mesmo grupo só sera selecionado apenas 1
      radioGroup = new ButtonGroup();
      radioGroup.add(plainJRadioButton);
      radioGroup.add(boldJRadioButton); 
      radioGroup.add(italicJRadioButton); 
      radioGroup.add(boldItalicJRadioButton); 

      // atribuindo um novo objeto Font, onde tem os parâmetros que ira fazer a mudança do estilo da fonte
      plainFont = new Font("Serif", Font.PLAIN, 14);
      boldFont = new Font("Serif", Font.BOLD, 14);
      italicFont = new Font("Serif", Font.ITALIC, 14);
      boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
      
      textField.setFont(plainFont);

      
      plainJRadioButton.addItemListener(
         new RadioButtonHandler(plainFont));
      boldJRadioButton.addItemListener(
         new RadioButtonHandler(boldFont));
      italicJRadioButton.addItemListener(
         new RadioButtonHandler(italicFont));
      boldItalicJRadioButton.addItemListener(
         new RadioButtonHandler(boldItalicFont));

         blackJRadioButton = new JRadioButton("Preto", true);
         redJRadioButton = new JRadioButton("Vermelho", false);
         blueRadioButton = new JRadioButton("Azul", false);
         yellowRadioButton = new JRadioButton("Amaralo", false);
      
      boldJRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
      italicJRadioButton.setFont(new Font("Arial", Font.ITALIC, 14));
      boldItalicJRadioButton.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 14));

      add(blackJRadioButton); 
      add(redJRadioButton); 
      add(blueRadioButton); 
      add(yellowRadioButton);

      colorRadioGroup = new ButtonGroup();
      colorRadioGroup.add(blackJRadioButton);
      colorRadioGroup.add(redJRadioButton); 
      colorRadioGroup.add(blueRadioButton); 
      colorRadioGroup.add(yellowRadioButton); 

      blackColor = Color.BLACK;
      redColor = Color.RED;
      blueColor = Color.BLUE;
      yellowColor = Color.YELLOW; 
      
      textField.setForeground(blackColor);

      
      blackJRadioButton.addItemListener(
         new ColorRadioButtonHandler(blackColor));
      redJRadioButton.addItemListener(
         new ColorRadioButtonHandler(redColor));
      blueRadioButton.addItemListener(
         new ColorRadioButtonHandler(blueColor));
      yellowRadioButton.addItemListener(
         new ColorRadioButtonHandler(yellowColor));
   } 

   // polimofirmos da classe implementando o objeto itemListerner, passando a ser um construtor
   private class RadioButtonHandler implements ItemListener 
   { // Definindo a váriavel font do Tipo Font 
      private Font font; 
      // construtor radiobuttonhandler defindindo a fonf=f
      public RadioButtonHandler(Font f)
      {
         font = f; 
      } 
   
      
      @Override
      public void itemStateChanged(ItemEvent event)
      {
         textField.setFont(font); 
      } 
   } 
    // polimofirmos da classe implementando o objeto itemListerner, passando a ser um construtor
    private class ColorRadioButtonHandler implements ItemListener 
    { // Definindo a váriavel font do Tipo Font 
       private Color color; 
       // construtor radiobuttonhandler defindindo a fonf=f
       public ColorRadioButtonHandler(Color c)
       {
          color = c; 
       } 
    
       
       @Override
       public void itemStateChanged(ItemEvent event)
       {
          textField.setForeground(color); 
       } 
    } 
} 


