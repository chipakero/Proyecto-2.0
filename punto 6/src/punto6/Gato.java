
package punto6;


public class Gato extends Mascota {
    private boolean cazador;

    public Gato(String nombre_mas, String color_pelo, int identificacion_mas) {
        super(nombre_mas, color_pelo, identificacion_mas);
    }

    public boolean isCazador() {
        return cazador;
    }

    public void setCazador(boolean cazador) {
        this.cazador = cazador;
    }

    @Override
    public String sonido() {
        return "miau";
    }
}
