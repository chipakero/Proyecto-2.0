
package punto6;

public class Perro extends Mascota {
    private String raza;

    public Perro(String nombre_mas, String color_pelo, int identificacion_mas) {
        super(nombre_mas, color_pelo, identificacion_mas);
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String sonido() {
        return "wow";
    }
}
