// esta importanto componentes do módulo swing e do módulo event da blibioteca (pacote) Javax

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
// Declaração da classe TextFieldFrame que esta herdando o componente JFrame
public class TextFieldFrame extends JFrame 
//Inicio do bloco de classe TextFieldFrame 
{
   // Estas 4 linhas são declarações de váriaveis, sendo a declaração e não a atribuição, sendo 3 textField e passoworField
   private final JTextField textField1; 
   private final JTextField textField2; 
   private final JTextField textField3; 
   private final JPasswordField passwordField; 

   // Construtor TextFieldFrame , sendo utilizado o public que serve como exportador 
   public TextFieldFrame()
   // inicio do bloco do construto TextFieldFrame
   {
      // O super é a definição do título da janela 
      super("Testando JTextField e JPasswordField");
      // definindo o tipo de reendenização no caso o FlowLayout que sera na ordem que segue
      setLayout(new FlowLayout());

      // Atribuindo um novo objeto JtexField, que isso da certo pois o Java não considera o objeto um valor, pois a váriavel é um final, sendo defindo a largura como 10
      textField1 = new JTextField(10); 
      // esta sendo adicionado na rendenização da janela 
      add(textField1); 
      //Esta sendo atribuido um novo objeto, porém desta vez é um texto, ao invés de numero, pois somente o número ele entende como coluna
      textField2 = new JTextField("Entre com o texto aqui");
      // esta sendo adicionado na rendenização da janela 
      add(textField2); 
      // Esta sendo atribuido um novo objeto, desta vez um texto e um outro parâmetro numeral (colunas)
      textField3 = new JTextField("Campo de texto não editável", 21);
      // Invoca o métdo que faz com que o campo não seja mais editavel 
      textField3.setEditable(false);
      // esta sendo adicionado na rendenização da janela 
       add(textField3); 
      // esta sendo atribuido um novo objeto que fará que o texto fique no formato de "bolinhas" ficando ilegivel para humanos
      passwordField = new JPasswordField("Texto escondido");
      // esta sendo adicionado na rendenização da janela 
      add(passwordField);
      //  Handler é um "manipulador" dos campos de texto, e esta sendo atribuido um novo objeto a váriavel
      TextFieldHandler handler = new TextFieldHandler();
      // Todos os TextField serão adicionados um "escutador de ação"  com a invocação do método addActionListener onde o parâmetro é o Handler, o Handler tem que ser um objeto
      textField1.addActionListener(handler);
      textField2.addActionListener(handler);
      textField3.addActionListener(handler);
      passwordField.addActionListener(handler);
   } //final do bloco de códigos do construtor

   // Declaração da classe privativa TextFieldHandler injetando o objeto ActionListener (como se fosse um new ActionListener)
   private class TextFieldHandler implements ActionListener 
   // inicio do bloco de códigos da classe TextFielHandler
   {
      // sobreescreve, o @ serve para ignorar menssagem do próprio java
      @Override
      //  void não tem retorno, public exporta, o método actionPerfomed ( ações que irão acontecer), tendo como pârametro o event do tipo Action Event 
      public void actionPerformed(ActionEvent event)
      // inicio do bloco de códigos do método actionperformed
      {
         // Atribuição do variavel string, do tipo String um texto vázio ""
         String string = ""; 
         // Algoritimo de validação, quando é utilizado == é um operador de comparação, comparando o lado esquerdo com o direito, esta invocando o getSource (pega a origem)
         if (event.getSource() == textField1)
            // caso verdadeiro a String que antes era vazia, ira receber o String.format que entrega o texto formatado, no primeiro parâmetro estou enviando um texto, % é um caracter coringa
            // o s depois da % sgnifica que ira retorar uma string, o segundo parâmetro event.getActionCommand, onde sera capturado o evento ( o que sera digitado), no caso este if
            // idenfica em quão campo ocorreu a ação, e então irar escrever a qual campo se refere
             string = String.format("Campo de texto 1: %s",
               event.getActionCommand());
            // caso seja falso ele ira testar as outras situações
         else if (event.getSource() == textField2)      
            string = String.format("Campo de texto 2: %s",            
               event.getActionCommand());
               
         else if (event.getSource() == textField3)         
            string = String.format("Campo de texto 3: %s",             
               event.getActionCommand());
               
         else if (event.getSource() == passwordField)         
            string = String.format("campo de senha: %s",            
               event.getActionCommand());
         // estou pedindo para exibir uma menssagem de dialogo, com  o método ShowMessageDialog que precisa de 2 parâmetros (componente pai , no caso esta nulo para aparecer em qualquer, defindo string )
         JOptionPane.showMessageDialog(null, string); 
      } // Fim do bloco de códigos do método acticonPerformed
   } // Fim do bloco de classe TextFieldHandler
} //Fim do bloco de classe TextField Frame 
