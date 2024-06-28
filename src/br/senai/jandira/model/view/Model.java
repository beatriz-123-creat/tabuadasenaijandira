package br.senai.jandira.model.view;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private int minimo;
    private int maximo;
    private int resultado;
    private int multiplicando;
    private int minimoMultiplicador;
    private int maximoMultiplicador;

    public String getStatus(){
        while (minimo >= maximo){
            resultado = minimo * maximo;
        }
        return getStatus();
    }

    public List getResultado(){
        while (minimo <= maximo){
            resultado = minimo * maximo;
            minimo++;
            addList(resultado);
        }
        return minhaLista;
    }
    List<Integer> minhaLista = new ArrayList<>();

    public void addList(int resultado){
       minhaLista.add(resultado);
    }

    //public int getResultado() {
        //while (minimo >= maximo){
            //resultado = minimo * maximo;
        //}
        //return resultado;
    //}

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    public int getMultiplicando() {
        return multiplicando;
    }

    public void setMultiplicando(int multiplicando) {
        this.multiplicando = multiplicando;
    }

    public int getMinimoMultiplicador() {
        return minimoMultiplicador;
    }

    public void setMinimoMultiplicador(int minimoMultiplicador) {
        this.minimoMultiplicador = minimoMultiplicador;
    }

    public int getMaximoMultiplicador() {
        return maximoMultiplicador;
    }

    public void setMaximoMultiplicador(int maximoMultiplicador) {
        this.maximoMultiplicador = maximoMultiplicador;
    }

    public List<String> calcularTabuada() {
        List<String> linhasTabuada = new ArrayList<>();
        for (int i = minimoMultiplicador; i <= maximoMultiplicador; i++) {

            int resultado = multiplicando * i;
            linhasTabuada.add(multiplicando + " x " + i + " = " + resultado);


        }
        return linhasTabuada;
    }

}
