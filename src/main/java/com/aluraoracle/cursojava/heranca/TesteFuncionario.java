
package com.aluraoracle.cursojava.heranca;

public class TesteFuncionario {
    
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();
        Gerente gerente = new Gerente();
       
        funcionario.setNome("Carlos");
        funcionario.setCpf("288.345.567-22");
        funcionario.setSalario(2000);
        
        System.out.println("Funcionário " + funcionario.getNome() + " com cpf " +funcionario.getCpf()+ " e salario de " +funcionario.getSalario());
        System.out.println("Terá bonificação de: " +funcionario.getBonificacao());
        
        gerente.setNome("Ana");
        gerente.setSalario(3000);
        
        
        System.out.println("Gerente Ana recebe salariode: " +gerente.getSalario() + " e bonificação de: " +gerente.getBonificacao());
       
    }
    }