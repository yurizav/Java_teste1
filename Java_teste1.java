package Java_teste1;

import javax.swing.JOptionPane;
/*
@author yuri
 */
public class Java_teste1 {
  
    
    public static void main(String[] args) {
        
         //Declara variáveis 
    String nome,endereço, telefone;
    
    //Armazena valores nas variáveis
        nome = JOptionPane.showInputDialog("Qual é o seu nome ?");
        endereço = JOptionPane.showInputDialog("Qual é o seu endereço ?");
        telefone = JOptionPane.showInputDialog("Qual é o seu telefone ?");
                     
        System.out.println(nome);
        System.out.println(endereço);
        System.out.println(telefone);
       
    }
    
}
