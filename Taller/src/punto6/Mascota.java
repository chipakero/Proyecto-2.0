package punto6;


public abstract class Mascota {
    private String nombre_mas;
    private String color_pelo;
    private int identificacion_mas;

    public String getNombre_mas() {
        return nombre_mas;
    }

    public void setNombre_mas(String nombre_mas) {
        this.nombre_mas = nombre_mas;
    }

    public String getColor_pelo() {
        return color_pelo;
    }

    public void setColor_pelo(String color_pelo) {
        this.color_pelo = color_pelo;
    }

    public int getIdentificacion_mas() {
        return identificacion_mas;
    }

    public void setIdentificacion_mas(int identificacion_mas) {
        this.identificacion_mas = identificacion_mas;
    }

    public Mascota(String nombre_mas, String color_pelo, int identificacion_mas) {
        this.nombre_mas = nombre_mas;
        this.color_pelo = color_pelo;
        this.identificacion_mas = identificacion_mas;
    }
    
    public abstract String sonido();
}
