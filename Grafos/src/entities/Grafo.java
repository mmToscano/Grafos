package entities;

import java.util.ArrayList;
import java.util.List;

public class Grafo {

    public List<Vertice> Vertices = new ArrayList<>();

    public Grafo(){
        Vertices = new ArrayList<>();
    }

    public void addVertice(int vertice){
        Vertice v = new Vertice(vertice);
        Vertices.add(v);
    }

    public void addVertice(Vertice v){
        Vertices.add(v);
    }

    public void addAresta(int origem, int destino){
        Vertice origemAux = null;
        Vertice destinoAux = null;

        for(Vertice item: Vertices){
            if (item.Rotulo == origem){
                origemAux =item;
                //quando é feita essa atribuição, o origemAux se torna um Vertice lá dentro da lista de Vertices. Tudo o que você fizer
                //neste origemAux, é feito lá na lista Vertice.
            }
            if (item.Rotulo == destino){
                destinoAux = item;
            }
        }

        if(destinoAux != null && origemAux != null) {

            origemAux.addAresta(destinoAux);
            destinoAux.addAresta(origemAux);

        }


        //para adicionar uma aresta, é preciso passar o rótulo dos vértices. Precisa passar pela lista verificando quais valores estão dentro dos vértices.


    }

    public void imprimirVertices(){
        for(Vertice item: Vertices){
            System.out.println("Rótulo: " + item.Rotulo);
        }
    }

    public void imprimirArestas(int rotulo){
        Vertice verticeAux = null;

        for(Vertice item: Vertices){
            if(item.Rotulo == rotulo){
                verticeAux = item;
                break;
            }
        }

        if(verticeAux != null){
            System.out.println(verticeAux.imprimirArestas());
        }else{
            System.out.println("Vértice inexistente");
        }
    }

    public void imprimirGrafo(){
        int count = 0;
        for(Vertice item: Vertices){
            System.out.println("Vértice " + count + ": " + item + "\n");
            count++;
        }
    }

}
