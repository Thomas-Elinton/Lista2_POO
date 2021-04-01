
package Exercicio_1;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Main {

    public static void main (String[] args) {
        
        int opc = 0;
        int numero;
        int idade;
        String nome;
        char sexo;
        double valorAuto;
        Apolice apolice = null;
        ArrayList<Apolice> listApolice = new ArrayList<>();
        
        while(opc !=4){
           opc = Integer.parseInt( 
                   JOptionPane.showInputDialog("1 - Cria Apólice \n 2- Mostrar Todas Apólice \n "
                           + "3- Mostrar Apolice por Nº"+ "\n4- Sair"));
           switch(opc){
               case 1: 
                   numero = Integer.parseInt(JOptionPane.showInputDialog("Número"));
                   nome = JOptionPane.showInputDialog("Nome");
                   idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));   
                   sexo = JOptionPane.showInputDialog("Sexo").toUpperCase().charAt(0);  // .toUpperCase() deixa as letras maiuscula e o .charAt ira pegar a primeira letra
                   valorAuto = Double.parseDouble(JOptionPane.showInputDialog("Valor Automovel"));
                   apolice = new Apolice(numero, nome, idade, sexo, valorAuto); //construtor 
                   listApolice.add(apolice);
                   break;
               
               case 2:
                   if(listApolice.size() > 0){
                       String mens = "";
                       for (Apolice ap : listApolice){
                         mens += ap.imprimir() + "\n ---------\n";
                       }   
                        JOptionPane.showMessageDialog(null, mens);
           
                   }else {
                      JOptionPane.showMessageDialog(null, "Nenhuma Apólice cadastrada", "Atenção", 
                              JOptionPane.WARNING_MESSAGE);
                    } 
                   break;
               case 3:
                   numero = Integer.parseInt(JOptionPane.showInputDialog("Numero da Apólice"));
                   for(Apolice ap : listApolice){
                       if(ap.getNumero() == numero)
                           JOptionPane.showMessageDialog(null, ap.imprimir());
                   }
                   break;
               case 4:
                   break;
               default:
                   JOptionPane.showMessageDialog(null, "Opção Inválida", "Erro", JOptionPane.WARNING_MESSAGE);
                       break;
           }
           
            
            
        }
    }
}

    

