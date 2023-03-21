
package com.aluraoracle.cursojava.colecoes;

// classe para relacionar listas e objetos

import java.util.LinkedList;
import java.util.List;

public class Curso {
    
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();// referencia aulas para ArrayList 

    public String getNome() {
        return nome;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }
    
    
   
}
