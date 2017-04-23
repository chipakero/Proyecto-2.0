
package punto6;

public class Persona {
    private String nombre_per;
    private int identifiacion;

    public String getNombre() {
        return nombre_per;
    }

    public void setNombre(String nombre) {
        this.nombre_per = nombre;
    }

    public int getIdentifiacion() {
        return identifiacion;
    }

    public void setIdentifiacion(int identifiacion) {
        this.identifiacion = identifiacion;
    }

    public Persona(String nombre_per, int identifiacion) {
        this.nombre_per = nombre_per;
        this.identifiacion = identifiacion;
    }
    
}
