
package com.aluraoracle.cursojava.polimorfismo;

/*
Polimorfismo - muitas formas de fazer a mesma coisa.
Na classe ControleBonificacao, temnos um único método (registrar)que faz o controle da
bonificacao dos funcionários. Com um único método passando como parâmetro o tipo
Funcionario e na classe teste setando nesse mesmo método (registrar) os objetos
que desejamos que execute o método. Então dessa forma, fazemos o polimorfismo.
podemos ter 1000 funcionários registrados e todos eles se utilizando de um único
metodo onde há a lógica (regra de negócio). Porque também no polimorfismo temos
Herança. Quando setamos o objeto, vamos chamar o método prórpio de cada oj=bjeto/classe
Mas tb temos a herança, dessa forma no output teremos o método da classe ControleBonificacao
sendo executado, mas tb método com a lógica do objeto setado.
*/
public class TesteBonificacao {
    public static void main(String[] args) {
        
        Funcionario g = new Gerente();
        
        g.setSalario(2000);
        
        
        Funcionario dir = new Diretor();
        dir.setSalario(4000);
        
        
        Funcionario f = new Funcionario();
        f.setSalario(1000);
        
        
         ControleBonificacao cb = new ControleBonificacao();
         
        // registrando o gerente chamando método registrar
        cb.registrar(g);
        System.out.println(cb.getSoma());
        //registrando um novo funcionário 
        cb.registrar(f);
        System.out.println(cb.getSoma());
        // registrando o diretor chamando método registrar
        cb.registrar(dir);
        System.out.println(cb.getSoma());
        
        
        
        
    }
}
