
package com.aluraoracle.cursojava.exceptions;

// tratando exceções
public class Excecoes {
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
            
            int a = i/0;
            // erro em tempo de execução, pois não é possível dividir por 0
            // ArithmeticException
        }
        System.out.println("Fim do metodo2");
    
    }
}
