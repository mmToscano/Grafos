package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vertice {

    Scanner sc = new Scanner(System.in);

    public int Rotulo;
    public List<Aresta> Arestas;

    public Vertice(){
        Rotulo = 0;
        Arestas = new ArrayList<>();
    }

    public Vertice (int v){
        Rotulo = v;
        Arestas = new ArrayList<>();
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
        return "Rotulo=" + Rotulo +
                " --- Arestas=" + Arestas;
    }

    public boolean EhAdjacente(Vertice destino){

        boolean retorno = false;

        for(Aresta item: Arestas){
            if(item.Destino.Rotulo == destino.Rotulo){
                retorno = true;
            }
        }

        return retorno;
    }

    public boolean existeCaminho(Vertice destino){

        boolean retorno = false;

            if(this.EhAdjacente(destino)){
                retorno = true;
            }else{
                for (Aresta item : Arestas) {
                   if(item.Destino.existeCaminho(destino)){
                       retorno = true;
                        break;
                }
            }

        }

        return retorno;

    }
}
