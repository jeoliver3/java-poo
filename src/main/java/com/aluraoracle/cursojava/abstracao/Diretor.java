
package com.aluraoracle.cursojava.abstracao;



public class Diretor extends Funcionario {
    
    // regra da bonificacao é salario + 100 reais
    
    public double getBonificacao()
    {
        System.out.println("Chamando o método de bonificação do Diretor");
        return 400;
    }
    
}
