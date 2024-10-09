import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ListFrame extends JFrame 
{
   private final JList<String> colorJList; // a string por ser uma matriz é utilizada entre tag <>  e o colorJlist é a variavel
   // Matriz de texto, e seus veteores, sendo colorNames a váriavel que esta sendo atribuido os vetores da matriz
   private final JList<String> sizeJList;

   private static final String[] colorNames = {"Preto", "Azul", "Ciano", 
      "Cinza escuro", "Cinza", "Verde", "Cinza claro", "Magenta",
      "Laranja", "Rosa", "Vermelho", "Branco", "Amarelo"};
   // Matriz de cores e seus vetores, onde colors é a váriavel que esta sendo atribuído as cores   
   private static final Color[] colors = {Color.BLACK, Color.BLUE,
      Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, 
      Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, 
      Color.RED, Color.WHITE, Color.YELLOW};
      
      private static final String[] SizeNames = {"Pequeno", "Médio", "Grande"};
      
   // Declaração do construtor
   public ListFrame()
   {
      // Definção do título
      super("Lista de Teste");
      // Definindo a forma de rendenização
      setLayout(new FlowLayout()); 
      // Atribuição da váriavel com novo objeto, que esta recebendo a matriz de string colorNames
      colorJList = new JList<String>(colorNames); 
      // Definindo a quantidade de linhas que sera rendenizada
      colorJList.setVisibleRowCount(5); 
      
      // invocando o método setSeleticonmodel que define o modo de seleção
      colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

      // Adiciona um novo objeto para rendenização, sendo a lista vertical
      add(new JScrollPane(colorJList));
      // Adiciona o Listener (escutador) da lista de seleção, quando clicado, é "diparado" o novo objeto ListSelectionListener
      colorJList.addListSelectionListener(
         new ListSelectionListener() 
         {   
            //Sobrescrição 
            @Override
            // declaração do método que recebe o evento, "valor mudado"
            public void valueChanged(ListSelectionEvent event)
            {
               // Irá captura o conteúdo do painel, e irá invocar o método setBackground (definir o fundo), que tem como parâmetro a matriz colors, que esta definido para enviar
               // o número do vetor, que possui o método getSelectedIndex (que irá pegar o número do vetor selecionado)
               getContentPane().setBackground(
                  colors[colorJList.getSelectedIndex()]);
            } 
         } 
      );
      sizeJList = new JList<String>(SizeNames); 
      // Definindo a quantidade de linhas que sera rendenizada
      sizeJList.setVisibleRowCount(2); 
      
      // invocando o método setSeleticonmodel que define o modo de seleção
      sizeJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

      // Adiciona um novo objeto para rendenização, sendo a lista vertical
      add(new JScrollPane(sizeJList));
      // Adiciona o Listener (escutador) da lista de seleção, quando clicado, é "diparado" o novo objeto ListSelectionListener
      sizeJList.addListSelectionListener(
         new ListSelectionListener() 
         {   
            //Sobrescrição 
            @Override
            // declaração do método que recebe o evento, "valor mudado"
            public void valueChanged(ListSelectionEvent event)
            {
               switch (sizeJList.getSelectedIndex()) {
                  case 0:
                     setSize(350,150);
                     break;
                  
                  case 1:
                     setSize(550,350);
                     break;
                     
                  case 2:
                     setSize(750,550);
                     break;
               
                  default:
                     setSize(350,150);
                     break;
               }
            }
         }
      );             
   } 
} 
