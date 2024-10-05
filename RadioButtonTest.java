// Relizando importações genéricas, quando conseguimos importar todas as classes de um módulo especifico de uma blibioteca (pacote) especifico, utlizando o *, porém isso necessita de
//um maior processamento de dados, os beneficio de importação genérica, da menor erro na hora da compilação, hoje devido o alto nivel de processamento não é um problema realizar desta forma
import javax.swing.*;
// declaração da classe RadioButtonTeste , sendo exportavel
public class RadioButtonTest  
{ // abetura do bloco de códigos
   //Declaração do método principal, sendo o método executor. sendo do tipo "void" , defindo o tipo do retorno, [] é uma matriz de string
   public static void main(String[] args)  
   { // abertura do bloco de códigos do método
      //Declaração da variavel atribuindo um novo objeto, apesar do mesmo nome é utilizado padrão de nomenclatura, Pascal e camelCase. 
      RadioButtonFrame radioButtonFrame = new RadioButtonFrame();
      // invocação do método que finaliza o processo ao fechar
      radioButtonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // invocação do método que define o tamanho da janela
      radioButtonFrame.setSize(370, 200); 
      // invocação do método que define a visibilidade como verdadeira (. invoca somente método, que ira ter seus parâmetros)
      radioButtonFrame.setVisible(true); 
   } // final do bloco de códigos do método 
} // Final de bloco de códigos da classe

