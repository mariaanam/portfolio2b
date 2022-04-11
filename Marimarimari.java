package marimarimari;

import javax.swing.JOptionPane;


public class Marimarimari {

    
    public static void main(String[]  args) {
     String nome = JOptionPane.showInputDialog ("Digite seu nome");
     JOptionPane.showMessageDialog(null,"Bem vindo, " +nome);
     String idade = JOptionPane.showInputDialog("Digite sua idade");
     String msg = "Que legal "+nome+", você tem "+idade+"anos.";
     JOptionPane.showMessageDialog(null,msg);
     String rl = JOptionPane.showInputDialog("Qual o contraro de papelada?");
     if(rl.equals("pavestida")){
         JOptionPane.showMessageDialog(null, "Acertou");
     }
     else{
         JOptionPane.showMessageDialog(null, "Errou!");
     }
     String livro = JOptionPane.showInputDialog("Qual sao as três reliquias da morte?");
     if(livro.equals("A varinha das varinhas,a pedra da ressurreição e a capa da invisibilidade")){
         JOptionPane.showMessageDialog(null, "Alohomora");
     }
     else{
         JOptionPane.showMessageDialog(null, "AVADA KEDAVRA!");
             
                 
                 }
     }
     
    }
  

