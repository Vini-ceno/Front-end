// esta importanto componente Jframe do módulo swing da blibioteca (pacote) Javax
import javax.swing.JFrame;
// Declaração da Classe TextFieldTeste que tem o mesmo nome do arquivo
public class TextFieldTest
// inicio do bloco de códigos da classe TextFieldTeste
{
  //Declaração do método main ( método executor )
   public static void main(String[] args)
   // inicio do bloco de códigos do método main
   { 
      // declaração da variavel textFieldFrame (camelcase), variavel do tipo TextFielFrame (pascalcase) e foi atribuído um novo objeto apartir do construtor
      TextFieldFrame textFieldFrame = new TextFieldFrame(); 
      // invocação do método setDefaultCloseOperation, invocando a variavel EXIT_ON_CLOSE
      textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //invocação do método setSize que ira definir o tamanho
      textFieldFrame.setSize(370, 100);
      // Invocação do método SetVisible como verdadeiro tornando visivel
      textFieldFrame.setVisible(true); 
   } // fim do bloco de códigos do método main
} // fim do bloco de código da classe

