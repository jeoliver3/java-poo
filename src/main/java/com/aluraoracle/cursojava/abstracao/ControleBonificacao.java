
package com.aluraoracle.cursojava.abstracao;

// classe que controla a boificação de cada funcionário

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
