// importação dos componentes do módulo awt e swing da blibioteca Java e Javax
import java.awt.FlowLayout; // rendeniza as camadas de acordo com o fluxo
import java.awt.event.ActionListener; // é o escutador da ação do usuario
import java.awt.event.ActionEvent; // trabalha com as ações de evento, trazendo as ações após a ação do usuario
import javax.swing.JFrame; // fornece a estrutura pronta da janela
import javax.swing.JButton; // são os botões em si
import javax.swing.Icon; // responsável fornece a estutura do botão bonitão
import javax.swing.ImageIcon; // responsável pela imagem do icone
import javax.swing.JOptionPane; // responsável pela abertura de janelas após o evento
// Declaração da classe ButtonFrame que herdando Jframe
public class ButtonFrame extends JFrame 
// Inicio do bloco de códigos da classe ButtonFrame
{
   // Declaração da variavel PlainJButoon sendo uma variavel privada e final do tipo JButton
   private final JButton plainJButton; 
   // Declaração da variavel fancyButoon sendo uma variavel privada (uso exclusivo da classe, não exporta) e final (somente leitura) do tipo JButton
   private final JButton fancyJButton; 
   //Declaração do construtor
         public ButtonFrame()
   // Inicio do bloco de códigos do construtor       
   {
      // método super (que define o titulo) com o titulo "testando botões"
      super("Testando botões");
      // é um método que define o Layout, que é a saída das camadas, sendo enviado um novo objeto FlowLayout (que rendeniza na ordem que aparece)
      setLayout(new FlowLayout()); 
      // Atribuindo um novo objeto para a variavel 
      plainJButton = new JButton("Botão simples");
      // Adiciona o PlainButton na rendenização
      add(plainJButton); 
      //  Declaração de variavel onde Atribui um novo objeto a variavel bug 1 do tipo Icon, dentro do Imageicon tem os parâmetros GetClass (pegar classe) invocando o (pegando recurso)
      // no caso o nome do arquivo
      Icon bug1 = new ImageIcon(getClass().getResource("bug1.gif"));
      //  Declaração de variavel onde Atribui um novo objeto a variavel bug 2 do tipo Icon, dentro do Imageicon tem os parâmetros GetClass (pegar classe) invocando o (pegando recurso)
      // no caso o nome do arquivo
      Icon bug2 = new ImageIcon(getClass().getResource("bug2.gif"));
      //  FancyJButton ja foi declrado, agora Atribui-se um novo objeto a variavel fancyJButton, com os parâmetros de texto e imagem 
      fancyJButton = new JButton("Botão Bonitão", bug2); 
      // invocação do método SetRollovericon ( que faz o efeito de mudança de imagem quando o mouse "rola" por cima)
      fancyJButton.setRolloverIcon(bug1); 
      // Adiciona na rendenização
      add(fancyJButton); 

      // Declaração da variavel handler, do tipo ButtonHandler, que esta sendo atribuido um novo objeto
      ButtonHandler handler = new ButtonHandler();
      // invocação do método addActionListerner (escutador de ação) tendo o Parâmetro Handler
      fancyJButton.addActionListener(handler);
      // invocação do método addActionListerner (escutador de ação)
      plainJButton.addActionListener(handler);
      // Final do bloco de código do construtor
   }

   // Declaração da classe privativa ButtonHandler onde esta sendo injetado o Action Listener
   private class ButtonHandler implements ActionListener 
   // Inicio do bloco do código da classe ButtonHandler
   {
      // Para conseguir inserir ações em um método que ja existe é necessário Sobreescrever
      @Override
      // Declaração do método ActionPerformed, com os parâmetro ActicoEvente (importado no começo)
      public void actionPerformed(ActionEvent event)
      //inicio do bloco de código da método ActionPerformed
      {
         // Invocação do método ShowMessageDialog (onde sera enviado uma menssagem) com os parâmetros (ButtonFrame.this) defindo o objeto "pai" que se for null sera utilziado de
         // qualquer lugar, o segundo parâmetro é a String Formatada, onde esta o texto que sera rendenizado na janela, com o %S para que seja mostrado um texto. e o proximo parâmetro
         // coletara o comando da ação, pegando o texto também
         JOptionPane.showMessageDialog(ButtonFrame.this, String.format(
            "Você pressionou: %s", event.getActionCommand()));
      } // Final do Bloco de códigos do método ActionPerfomed
   } // final do bloco de código da classe ButtonHandler
} // Final do bloco de código da classe ButtonFrame 


