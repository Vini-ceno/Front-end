// Na linha abaixo esta importando a biblioteca (pacote) javax, o módulo swing e o componente JOptinonPane
import javax.swing.JOptionPane; 
// Na linha abaixo esta sendo declarada a classe addtion
public class Addition 
// Na linha abaixo esta sendo aberto o bloco de códigos da classe addition
{
   // Na linha abaixo esta sendo declarado o método "main" que irá executar a aplicação
   public static void main(String[] args)
   {
      // As linhas abaixo obtem as informações digitadas pelo usuario apartir do JOptionPane 
      // Na primeira linha é declarado a variavel "firstNumber" sendo uma variavel string (Onde tem Operador de atribuição tem declaração de váriavel) 
      // Sendo atribuído o texto "Enter first integer"
      // Na segunda linha é utilizado showInputDialog um atributo do componente JOptinonPane que fará com que apareça escrito o texto definido dentro dos ()
      String firstNumber =
         JOptionPane.showInputDialog("Digite o primeiro número inteiro");
      //  Na primeira linha é declarado a variavel "secondNumber" sendo uma variavel string (Onde tem Operador de atribuição tem declaração de váriavel)    
      String secondNumber =
          JOptionPane.showInputDialog("Digite o segundo número inteiro");

      // As linhas abaixo converte o Sitring em números
      int number1 = Integer.parseInt(firstNumber); 
      int number2 = Integer.parseInt(secondNumber);

      int sum = number1 + number2; // inserção função da soma

      // Nestas linhas é mostrado o resultado usando JOptionPane mostrando uma caixa de diálogo conforme o texto em (), PLAIN_MESSAGE modelo de janela
      JOptionPane.showMessageDialog(null, "O resultado da soma é: " + sum, 
         "Soma de 2 números inteiros", JOptionPane.PLAIN_MESSAGE);
   } 
} // Finalizado o código

