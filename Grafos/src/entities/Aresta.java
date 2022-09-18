package entities;

public class Aresta {

    public Vertice Origem;
    public Vertice Destino;


    public Aresta(){

    }

    public Aresta(Vertice origem, Vertice destino){
        Origem = origem;
        Destino = destino;
    }

    //dá para criar um método que cria as origens e os destinos ao contrário.

    public void add(Vertice origem, Vertice destino){
        Origem = origem;
        Destino = destino;
    }

    @Override
    public String toString() {
        return "Aresta{" +
                "Origem=" + Origem +
                ", Destino=" + Destino +
                '}';
    }
}
