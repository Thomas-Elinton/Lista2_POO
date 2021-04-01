
package Exercicio_2;


import javax.swing.JOptionPane;


public class Main {
    
    public static void main (String[] args) {
        
        int opc = 0;
        int codigo;
        String nome;
        double percentualComissao;
        double valorVenda , desconto;
        Vendedor vendedor = null;
        
        
        while (opc!=3){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1- Cadastrar Vendedor \n" + 
                    "2-Calcular Venda \n"+ "3 - Sair"));
            switch (opc){
                case 1:
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo Vendedor:"));
                    nome = JOptionPane.showInputDialog("Nome Vendedor:");
                    percentualComissao = Double.parseDouble(JOptionPane.showInputDialog("% Comissão:"));
                    
                    vendedor = new Vendedor (codigo, nome, percentualComissao);
                    break;
                    
                case 2:
                    valorVenda = Double.parseDouble(JOptionPane.showInputDialog("Valor da Venda:"));
                    desconto = Double.parseDouble(JOptionPane.showInputDialog("Valor desconto:"));
                  if(vendedor!= null){
                      JOptionPane.showMessageDialog(null, vendedor.imprimir(valorVenda, desconto));
                  }else{
                      JOptionPane.showMessageDialog(null, "Nenhuma Venda Realizada", "Atenção",
                              JOptionPane.WARNING_MESSAGE);
                              
                  }
                    
                    break;
                    
                case 3:
                    break;
                default:  
                    JOptionPane.showMessageDialog(null, "Opção Inválida", "Erro", JOptionPane.WARNING_MESSAGE);
                       break;
            }
        }
    }
    
}
