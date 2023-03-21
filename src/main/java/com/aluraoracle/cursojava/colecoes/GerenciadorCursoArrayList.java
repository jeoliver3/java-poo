
package com.aluraoracle.cursojava.colecoes;

import java.util.ArrayList;
import jdk.nashorn.internal.objects.NativeArray;


public class GerenciadorCursoArrayList {
 
    public static void main(String[] args) {
        
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe aula";
        String aula3 = "Trabalhando com cursos e Sets";
        
        ArrayList<String> aulas = new  ArrayList<>();
        
        // add variáveis
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        
        System.out.println(aulas);
        
        //removendo variável na posição 0
        aulas.remove(0);
        
        System.out.println(aulas);
        
        // foreach - para cada aula dentro de aulas, faça o seguinte ...
        // usando foreach para que a saída fique sem o toString do ArrayList
        for(String aula : aulas)
        {
            System.out.println(aula);
        }
        
        //obtendo lista com get
        System.out.println("A segunda aula é: " + aulas.get(1));
        
        for(int i=0; i< aulas.size(); i++)// em coleções usa-se size para obter tamamho de array
        {
            System.out.println(aulas.get(i));
        }
        System.out.println(aulas.size());// traz o numero de elementos da lista(tamanho)
        
        // com lambda, melhor maneira de fazer um for dentro de um ArrayList
        // metodo foreach, que passa uma action. Para cada aula dentro de aulas , faça, {}
        aulas.forEach(aula -> {
            System.out.println("percorrendo: " +aula);
        });
        
    }
}
