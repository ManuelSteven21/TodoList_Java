package org.entdes.todolist;

public class Tasca {
    private boolean completada = false;
    private String descripcioTasca;

    public Tasca(String descripcio) {
        this.descripcioTasca = descripcio;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public String getDescripcioTasca() {
        return descripcioTasca;
    }

    @Override
    public String toString() {
        return descripcioTasca + ": " + (completada ? "Completada" : "Pendent");
    }
}