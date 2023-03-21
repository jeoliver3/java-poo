
package com.aluraoracle.cursojava.abstracao;

// Funcionario é uma classe abstrata, não pode ser instanciada, pois não é um
// objeto concreto.Diretor, gerente ... são classes concretas

public abstract class Funcionario {
    
    
    private String nome;
    private String cpf;
    private double salario; 
    
   
    // método abstrato signifuca que o método não tem um corpo. Nada deve ser
    // implementado, mas ele deve existir. A lógica do método deve ter nas classes filhas.
   public abstract double getBonificacao();
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}


