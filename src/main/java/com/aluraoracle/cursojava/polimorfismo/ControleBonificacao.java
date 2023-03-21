
package com.aluraoracle.cursojava.polimorfismo;

// classe que controla a boificação de cada funcionário

public class ControleBonificacao {
    
    
    private double soma;
    

    // método único que vai somar o salario + a bonificacao do gerente
    public void registrar(Funcionario f)
    {
        
        this.soma=f.getSalario()+ f.getBonificacao();
    }
    
    
    
    
      public double getSoma() {
        return soma;
    }

    

    
    
}
