package punto6;

import java.util.ArrayList;

public class Persona {
    private String nombre_per;
    private int identifiacion;
    private ArrayList<Mascota> Mascotas;

    public String getNombre() {
        return nombre_per;
    }
     public void AgregarMascota(Mascota pet2){
        this.Mascotas.add(pet2);
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
        this.Mascotas = new ArrayList<>();
        this.nombre_per = nombre_per;
        this.identifiacion = identifiacion;
    }
      public void Mostrar_mascotas(){ 
            for(Mascota a: this.Mascotas){
                System.out.println("Nombre mascota " + a.getNombre_mas());
                System.out.println("Nombre mascota " + a.getColor_pelo());
                System.out.println("Nombre mascota " + a.sonido());
            }
    } 
    
}
