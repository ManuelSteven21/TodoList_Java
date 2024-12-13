package org.entdes.todolist;

import java.util.ArrayList;
import java.util.List;

public class GestorTasques {
    private List<Tasca> llista = new ArrayList<>();

    public void afegirTasca(String descripcio) {
        Tasca tasca = new Tasca(descripcio);
        llista.add(tasca);
    }

    public void eliminarTasca(String descripcio) {
        llista.removeIf(tasca -> tasca.getDescripcioTasca().equals(descripcio));
    }

    public void marcarCompletada(String descripcio) {
        for (Tasca tasca : llista) {
            if (tasca.getDescripcioTasca().equals(descripcio)) {
                tasca.setCompletada(true);
                break;
            }
        }
    }

    public List<Tasca> llistarTasques() {
        return llista;
    }
}