// impotando o componente Jframe do módulo Swing da blibioteca Javax
import javax.swing.JFrame;
// Declarando a classe ButtoTeste que é o mesmo nome do arquivo
public class ButtonTest 
// Inicio do bloco de código da classe
{
   // Declaração do método executor main 
   public static void main(String[] args)
   //Inicio do bloco de código do método
   { 
      // Declaração da varíavel buttonFrame do tipo ButtonFrame com atribuição de um novo objeto, sendo o construtor do outro arquivo
      ButtonFrame buttonFrame = new ButtonFrame(); 
      // invocando o método de fechamento padrão
      buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // invocando o método que define o tamanho
      buttonFrame.setSize(275, 150); 
      // invocando o método que define a visibilidade
      buttonFrame.setVisible(true);
      // Fim do bloco de código do método 
   } 
   //Fim do bloco de código da classe
} 


