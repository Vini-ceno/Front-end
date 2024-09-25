// importação dos componente FlowLayout do módulo awt da blibioteca Javex 
import java.awt.FlowLayout;
// importação dos componentes (ultimas palavras) do módulo Swing da blibioteca Javex 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.SwingConstants; 
import javax.swing.Icon; 
import javax.swing.ImageIcon; 
//A linha abaixo está declarando a classe LabelFrame, o extends esta herdando o componente JFrame
public class LabelFrame extends JFrame 
{
   // As 3 linha abaixo está declarando as variáveis, o "private" não exporta a várivavel, "final" serve para declarar uma váriavel somente leitura, "JLabel" é o tipo, e o "label1,2,3" são as variaveis
   private final JLabel label1; 
   private final JLabel label2; 
   private final JLabel label3; 

  // Construtor, não pode ser "private" nem "static" nem "protegido" nem "void" e não precisa de "parâmetro", ele tem que ser flexivel e váriavel, ele tem que ter o mesmo nome da classe e do arquivo
   public LabelFrame()
   // inicio do bloco de códigos do construtor
   {
      // A linha abaixo está utilizando o método "super" defindindo o título da janela, estando o texto dentro de aspas duplas
      super("Testando JLabel");
      // ira definir o desenho da saida da camadas formando o quadro, neste caso não usou o "." pois foi herdado o Jframe, Flowlayout considera a ordem (o que vem primeiro) para rendeinizar
      setLayout(new FlowLayout()); 

      // O label 1 esta recebendo um novo objeto "jLabel" eviando como parâmetro(argumento) o texto "entre aspas"
      label1 = new JLabel("Label com texto");
      // é invocado o método "defindo um texto de dica" que sera reendenizado quando colocar o mouse em cima do elemento
      label1.setToolTipText("Esse é o label1");
      // "add" adicionar o label1, onde fará que seja reendenizado na saída de camada dentro do JFrame "(a janela como todo)"
      add(label1); 

      // Declaração de variavel "bug", do tipo "icon" onde esta sendo atribuido um novo objeto do tipo "ImageIcon", "getclass" ira coletar a classe e invocar "." o "getrecurse" pegar o recurso "bug.png" 
      Icon bug = new ImageIcon(getClass().getResource("bug1.png"));
      // Label2 esta recebendo um novo Jlabel enviando o texto e um outro parâmetro, onde a "," é o separador de parâmetros dentro da declaração de atribuição da váriavel, parametro1 (texto), parametro2 (variavel "bug"), parametro 3 ( defini o alinhamento "swingconstantes.left" onde contém informações sobre alinhamento)
      label2 = new JLabel("Label com texto e icone", bug, 
         SwingConstants.LEFT);
      // é invocado o método "defindo um texto de dica" que sera reendenizado quando colocar o mouse em cima do elemento "label 2"
      label2.setToolTipText("Esse é o label2");
      add(label2); 
      // esta sendo atribuído o objeto Jlabel porém sem texto, pois ele será defino a seguir
      label3 = new JLabel();
      // Define o texto que irá aparecer 
      label3.setText("Label com icone e texto abaixo");
      // Define o icone que irá aparecer
      label3.setIcon(bug);
      // Define o alinhamento na possição horizontal do texto, no caso usando o parâmetro "swingConstants" para o centro 
      label3.setHorizontalTextPosition(SwingConstants.CENTER);
      // Define o alinhamento na possição vertical do texto, no caso usando o parâmetro "swingConstants" para o baixo 
      label3.setVerticalTextPosition(SwingConstants.BOTTOM);
      // é invocado o método "defindo um texto de dica" que sera reendenizado quando colocar o mouse em cima do elemento "label 3"
      label3.setToolTipText("Esse é o label3");
      // Adiciona o label3
      add(label3); 
      // Finaliza o bloco de códigos do construtor
   } 
} // Finaliza o bloco class LabelFrame


