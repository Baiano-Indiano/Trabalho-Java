package Salario;
public class Empregado {
    String nome;
    String sobrenome;
    double salarioMensal;

    public Empregado(String nome, String Sobrenome, double salarioMensal){

        this.nome = nome;
        this.salarioMensal = salarioMensal;
        this.sobrenome = Sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public double getSalarioMensal() {
        return salarioMensal;
    }
    
    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    
    public double calSalarioAno() {
        return salarioMensal * 12;
    }


    public double calSalarioTotalComAumento() {
        double salarioComAumento = salarioMensal * 1.10; 
        return salarioComAumento * 12;
    }


}