package punto6;
import java.util.*;




public class Veterinaria {
    private ArrayList<Mascota> Mascotas;
    
    public Veterinaria(){
        this.Mascotas = new ArrayList<>();
    }
        
    public void AgregarMascota(Mascota pet2){
        this.Mascotas.add(pet2);
    }
        
    public void Remover_Mascota(Mascota pet){
        int i=1;
        for(Mascota a: this.Mascotas){
            i++;
            if(a.equals(pet)){
              
            }
        }
        
        
    } 
    public void Mostrar_mascotas_tipo(String tipo){ 
         for(Mascota a: this.Mascotas){
            if(a instanceof Hamster && tipo.equals("Hamster")){
                System.out.println("Nombre Hamster " + a.getNombre_mas());
                System.out.println("Nombre Hamster " + a.getColor_pelo());
                System.out.println("Nombre Hamster " + a.sonido());
                
            }
            if(a instanceof Gato&& tipo.equals("Gato")){
                System.out.println("Nombre Gato " + a.getNombre_mas());
                System.out.println("Nombre Gato " + a.getColor_pelo());
                System.out.println("Nombre Gato " + a.sonido());
            }
             if(a instanceof Perro && tipo.equals("Perro")){
                System.out.println("Nombre Perro " + a.getNombre_mas());
                System.out.println("Nombre Perro " + a.getColor_pelo());
                System.out.println("Nombre Perro " + a.sonido());
            }
        }
        
    } 
    public void Mostrar_mascotas(){ 
            for(Mascota a: this.Mascotas){
                System.out.println("Nombre mascota " + a.getNombre_mas());
                System.out.println("Nombre mascota " + a.getColor_pelo());
                System.out.println("Nombre mascota " + a.sonido());
            }
    } 
    
}
