package Application;

import entities.Grafo;


public class Program {

    public static void main(String[] args) {


        Grafo g = new Grafo();
        g.addVertice(2);
        g.addVertice(3);
        g.addVertice(4);
        g.addVertice(5);
        g.addVertice(9);
        /*
        g.addVertice(9);
        g.addVertice(7);
        g.addVertice(6);
        g.addVertice(11);
         */

        g.addAresta(2, 3);
        g.addAresta(2, 4);
        g.addAresta(2, 5);
        g.addAresta(4, 9);
        g.addAresta(3, 12);


        //g.imprimirGrafo();

        System.out.println(g.existeCaminho(3, 12));









        //g.imprimirVertices(); //imprime o rótulo dos vértices
        //g.imprimirArestas(3); //imprime as arestas do vértice informado

    }
}
