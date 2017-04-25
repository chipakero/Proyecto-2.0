package punto6;

public class Hamster extends Mascota {
    private double peso;

    public Hamster(String nombre_mas, String color_pelo, int identificacion_mas) {
        super(nombre_mas, color_pelo, identificacion_mas);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String sonido() { 
        return "-Chillido-";
    }
}
