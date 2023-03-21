
package com.aluraoracle.cursojava.polimorfismo;



    public class Gerente extends Funcionario {
 
    
    @Override
    public double getBonificacao()
    {
        System.out.println("Chamando o método de bonificação do Gerente ");
        return super.getSalario() * 0.4;   // super indica que esse atributo - salario - vem da super classe
       
       
    }

    
}


