
package com.aluraoracle.cursojava.exceptions;

// fazendo o tratamebto da exceção

public class Tratamento {
    public static void main(String[] args) {
        System.out.println("Início do main");
        metodo1();
        System.out.println("Fim do main");
        
        
    }
    
    
    public  static void metodo1()
    {
        System.out.println("Início do método1");
        metodo2();
        System.out.println("Fim do método 1");  
    }
    
    public static void metodo2()
    {
        System.out.println("Início do método2");
        for(int i =1; i<=5; i++)
        {
            System.out.println(i);
            // try - tente executar esse código / catch - capture a exceção e execute o try
            try{
                int a = i/0; 
            }
            // exceções também são objetos. ArithmeticException é uma classe, representa um tipo.
            //ex é uma referência.
            catch(ArithmeticException ex){
                // getMessage é um método que executa a mensagem da exceção
                String msg= ex.getMessage();
                //System.out.println("ArithmeticException" + msg);
            }
            
            
        }
        System.out.println("Fim do metodo2");
    
    }
}
