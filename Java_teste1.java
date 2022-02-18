package Java_teste1;

import javax.swing.JOptionPane;
/*
@author yuri
 */
public class Java_teste1 {
  
    
    public static void main(String[] args) {
        
    //Declara variáveis 
    String nome,endereço, telefone;
    
    //Recebe e Armazena valores nas variáveis
        nome = JOptionPane.showInputDialog("Qual é o seu nome ?");
        endereço = JOptionPane.showInputDialog("Qual é o seu endereço ?");
        telefone = JOptionPane.showInputDialog("Qual é o seu telefone ?");
        
    //Cria uma caixa de diálogo para devolver os dados recebidos pelo showInputDialog!
                     
        JOptionPane.showMessageDialog(null,"Seu nome é " + nome + "!");
        JOptionPane.showMessageDialog(null, "Você mora em "+ endereço + "!");
        JOptionPane.showMessageDialog(null, "Seu telefone é " + telefone + "!");
       
    }
    
}
