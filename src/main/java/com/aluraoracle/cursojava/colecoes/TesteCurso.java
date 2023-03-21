
package com.aluraoracle.cursojava.colecoes;

import java.util.List;

public class TesteCurso {
    
    public static void main(String[] args) {
        
       Curso curso = new Curso("Dominando as coleçøes do Java", "Paulo");
        
       List<Aula> aulas = curso.getAulas();
       aulas.add(new Aula("Trabalhando com ArrayList", 20));
       System.out.println(aulas);
        
    }
}
