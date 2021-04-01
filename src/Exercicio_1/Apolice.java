
package Exercicio_1;


public class Apolice {
    
    private int numero;
    private String nome;
    private int idade;
    private char sexo;
    private double valorAuto;

    public Apolice() {
    }

    public Apolice(int numero, String nome, int idade, char sexo, double valorAuto) {
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.valorAuto = valorAuto;
    }
    
    public double calcularValor (){
        if(sexo =='M' && idade <=25)
            return valorAuto *10 / 100;
        else if (sexo == 'M' && idade >25)
            return valorAuto *5 / 100;
        else 
            return valorAuto *2 /100;
    }
    public String imprimir (){
        return "Numero:" + numero + "\n"
                + "Nome:" + nome + "\n"
                + "Idade:" + idade + "\n"
                + "Sexo:" + sexo + "\n"
                + "Valor Auto.:" + valorAuto + "\n"
                + "Valor Apólice:" + calcularValor();        
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getValorAuto() {
        return valorAuto;
    }

    public void setValorAuto(double valorAuto) {
        this.valorAuto = valorAuto;
    }
    
}
