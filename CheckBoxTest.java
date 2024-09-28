// importando o componente Jframe do módulo Swing da bliblioteca Javax
import javax.swing.JFrame;
// Declaração da Classe CheckBoxtest
public class CheckBoxTest
// inicio do bloco de código da classe CheckBoxTest
{ 
   // Declaração do método main
   public static void main(String[] args)
   // inicio do bloco de código do método main
   { 
      //Declaração e atribuição de um novo da váriavel CheckBoxFrame 
      CheckBoxFrame checkBoxFrame = new CheckBoxFrame(); 
      // Inovocação do método SetDefaulcloseOperation
      checkBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // Inovocação do método setSize que define o tamanho da janela
      checkBoxFrame.setSize(275, 100); 
      // Inovocação do método Setvisible para que a janela fique visivel
      checkBoxFrame.setVisible(true); 
   } // FInal do bloco de código do método main
} // Final do bloco de código da classe CheckBoxTest

