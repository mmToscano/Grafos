package Application;

import entities.Aresta;
import entities.Grafo;
import entities.Pessoa;
import entities.Vertice;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {


        Grafo g = new Grafo();
        g.addVertice(2);
        g.addVertice(3);
        g.addVertice(4);
        g.addVertice(5);
        g.addVertice(9);


        g.addAresta(2, 3);
        g.addAresta(2, 4);
        g.addAresta(2, 5);
        //g.imprimirGrafo();
        //g.imprimirVertices();
        g.imprimirArestas(3);


    }
}
