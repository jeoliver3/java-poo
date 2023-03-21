
package com.aluraoracle.cursojava.polimorfismo;


public class Diretor extends Funcionario {
    
    // regra da bonificacao é salario + 100 reais
    @Override
    public double getBonificacao()
    {
        System.out.println("Chamando o método de bonificação do Diretor");
        return super.getSalario() * 0.025;
    }
    
}
