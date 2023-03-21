
package com.aluraoracle.cursojava.colecoes;


public class Aula {
    
    private String titulo;
    private int tempo;

    public String getTitulo() {
        return titulo;
    }

    

    public int getTempo() {
        return tempo;
    }

   

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }
    
    @Override
    public String toString()
    
    {
        return "Aula: "+this.titulo + ", " +this.tempo + "minutos ";
    }
    
    
}
