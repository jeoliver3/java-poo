
package com.aluraoracle.cursojava.heranca;

public class Gerente extends Funcionario {
 
    
    
    @Override
    public double getBonificacao()
    {
     return super.getSalario() * 0.4;   // super indica que esse atributo - salario - vem da super classe
       
       
    }

    
}
