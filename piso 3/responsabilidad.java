package rpg.servicio;

import rpg.modelo.Personaje;


// >>> SALA 3.1
public class ReporteCombate {
    public String resumir(Personaje p) {
        return p.getNombre() + ": " + p.getVida() + " PV";
    }
    public void imprimir(Personaje p) {
        System.out.println(resumir(p));
    }
}
// <<< FIN SALA 3.1