// importando o componentes do módulo Awt da blibotec Java e do módulo Swing da blibioteca Javax 
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.font.*;
import java.util.*;
// Declaração da classe Checkboxframe que esta herdando o Jframe
public class CheckBoxFrame extends JFrame 
// inicio do bloco de código da classe CheckBoxFrame
{
   // Declaração das váriaveis do tipo JtexField e JcheckBox
   private final JTextField textField; 
   private final JCheckBox boldJCheckBox; 
   private final JCheckBox italicJCheckBox; 
   private final JCheckBox subCheckBox;

   // Declaração do construtor utilizando o public para a exportação
   public CheckBoxFrame()
   // inicio do bloco de códigos do construtor
   { 
      // Método de Definição do título da janela
      super("JCheckBox Teste");
      // Definição da dispoisção da rendinização do caso FlowLayout
      setLayout(new FlowLayout());

      // Atribuição da variavel textfield utilizando um novo objeto que ira adicionar o texto que ja irá aparecer e no outro parâmetro o tamanho do campo
      textField = new JTextField(" Observe a mundança no estilo da fonte", 22);
      // Invocação do método setFont onde esta sendo criado um novo objeto com os parâmetros de nome fonte , tipo da fonte, e tamanho da fonte
      textField.setFont(new Font("Arial", Font.PLAIN, 12));
      // Adicionando o textField na rendenização 
      add(textField); 
      // Atribuição da várivel utilizando um novo objeto que seria a caixa de seleção e definindo o texto que irá aparecer
      boldJCheckBox = new JCheckBox("Negrito"); 
      boldJCheckBox.setFont(new Font("Arial", Font.BOLD, 13));
      // Atribuição da várivel utilizando um novo objeto que seria a caixa de seleção e definindo o texto que irá aparecer
      italicJCheckBox = new JCheckBox("Itálico");
      italicJCheckBox.setFont(new Font("Arial", Font.ITALIC, 13)); 
      // Adicionando o textField na rendenização 
      add(boldJCheckBox); 
      // Adicionando o textField na rendenização 
      add(italicJCheckBox); 

      subCheckBox = new JCheckBox("Sublinhado");
      subCheckBox.setFont(new Font("Arial", Font.PLAIN, 13)); 
      add(subCheckBox);

      //Declaração e atribuição da váriavel handler do tipo CheckBoxHandler utilizando um novo objeto
      CheckBoxHandler handler = new CheckBoxHandler();
      // invocação do método addItemListener e utilizando o handler como parâmetro 
      boldJCheckBox.addItemListener(handler);
      italicJCheckBox.addItemListener(handler);
      subCheckBox.addItemListener(handler);
   } // Final do bloco de código do constutor

   // Injentando o objeto ItemListener, fazendo com que a classe também seja um objeto 
   private class CheckBoxHandler implements ItemListener 
   { // Inicio do bloco de código da classe CheckBoxHandler
      //Sobreescrevendo
      @Override
      //  (método externo sem retorno) Declaração do método itemStateChanged, quando o úsuario "trocou" no checkbox para "selecionado" ele ira indenficar através do event, 
      //obtendo a informação do elemento
      public void itemStateChanged(ItemEvent event)
      { // inicio do bloco de código do método 
         // Declaração e atribuição da variavel fonte como vazia, pois a váriavel tem que ter uma "valor" para ser usada no if
         Font font = null; 

         // Utilização do algoritimo de validação onde && é o "E" ou seja as 2 informações devem serem verdadeiras para validar o evento, e o método isselected ( quando selecionado)
         if (boldJCheckBox.isSelected() && italicJCheckBox.isSelected())
         // Caso verdadeiro ira alterar o texto com estes seguintes parâmetros
            font = new Font("Arial", Font.BOLD + Font.ITALIC, 12);
            // Caso falso ira testar as outras situações e utilizar os parâmetrso
         else if (boldJCheckBox.isSelected())
            font = new Font("Arial", Font.BOLD, 12);
         else if (italicJCheckBox.isSelected())
            font = new Font("Arial", Font.ITALIC, 12);
         else
            font = new Font("Arial", Font.PLAIN, 12);
         // invocação do método Setfont definindo a fonte, que ira aparecer no field
         textField.setFont(font); 
         // Mapeando a fonte sublinhado  e depois injetar na variavel font
         if (subCheckBox.isSelected()) {
            font= textField.getFont();
            Map atributtes = font.getAttributes();
            atributtes.put(TextAttribute.UNDERLINE,TextAttribute.UNDERLINE_ON); 
            textField.setFont(font.deriveFont(atributtes));
            font = new Font(atributtes);

         }    
       } // Final do bloco de códigos do método 
   } // Final do bloco de códigos da classe CheckBoxHandler
} // Final do bloco de códigos da classe da CheckBoxFrame




