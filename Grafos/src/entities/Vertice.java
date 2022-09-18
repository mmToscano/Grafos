package entities;

import java.util.ArrayList;
import java.util.List;

public class Vertice {

    public int Rotulo;
    public List<Aresta> Arestas;

    public Vertice(){
        Rotulo = 0;
        Arestas = new ArrayList<>();
    }

    public Vertice (int v){
        Rotulo = v;
    }

    public void addAresta(Aresta a){
        Arestas.add(a);
    }

    public void addAresta(Vertice destino){
        Arestas.add(new Aresta(this, destino));
        //new Aresta(this, destino);
    }


    public List<Aresta> imprimirArestas(){
        return Arestas;
    }

    @Override
    public String toString() {
        return "Vertice{" +
                "Rotulo=" + Rotulo +
                ", Arestas=" + Arestas +
                '}';
    }
}
