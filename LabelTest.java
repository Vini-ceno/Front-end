// A linha abaixo importara o componente JFrame do  módulo swing da blibioteca (pacote) javax
import javax.swing.JFrame;
//A linha abaixo está declarando a classe LabelTest
public class LabelTest
// A linha abaixo esta iniciando o bloco de códigos  
{
   // A linha abaixo esta declarando o método main
   public static void main(String[] args)
   { 
      // A linha abaixo esta declarando a váriavel LabelFrame (ela é do tipo LabelFrame) (enqunato labelFrame é uma váriavel e o LabelFrame é o tipo)
      LabelFrame labelFrame = new LabelFrame(); 
      // A linha abaixo esta Invocando o método (depois do "." (invocação) tem o (método) que inicia com letra minúscula) dentro dos parêntes existem os Parâmetro "EXIT_ON_CLOSE" sendo um número definido na interface deste componentes (definido por padrão), não altera-se Parâmetros SCREM_CASE
      labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // A linha abaixo esta definindo o tamanho em pixel
      labelFrame.setSize(260, 180); 
      // A linha abaixo esta defindo a visibilidade do "frame" como "verdadeiro"
      labelFrame.setVisible(true);
      // Fechamento do bloco de código do método Main
   } 
   // Fechamento do bloco de código da classe LabelTeste
} 


// métodos    ( )
// variaveis ( que recebe valores, e "varia os seus valores")
// tipo      ( no java sempre tem que definir o tipo da váriavel)
// classe    (a classe é definido antes de iniciar o código, após a importação da blibioteca)
// Parâmetros ( são o valores que as variaveis irão receber)
// componentes ( componente especifico de uma blibioteca)
// módulo     ( parte onde se encontra o componente)
// Bliboteca    ( pacote que sera importado)