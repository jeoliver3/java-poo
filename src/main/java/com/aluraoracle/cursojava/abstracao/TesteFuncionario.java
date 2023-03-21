
package com.aluraoracle.cursojava.abstracao;


public class TesteFuncionario {
    
    public static void main(String[] args) {
        
        
        Gerente gerente = new Gerente();
       
        Diretor dr = new Diretor();
        
        gerente.setNome("Ana");
        gerente.setSalario(3000);
        
        dr.setNome("Daniel é o diretor");
        
        
        System.out.println("Gerente Ana recebe salario de: " +gerente.getSalario() + " e bonificação de: " +gerente.getBonificacao());
        System.out.println(dr.getNome());
        
    }
    }