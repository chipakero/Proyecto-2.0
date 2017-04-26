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
              this.Mascotas.remove(pet);
            }
        }
        
        
    } 
    public void Mostrar_mascotas_tipo(String tipo){ 
         for(Mascota a: this.Mascotas){
            if(a instanceof Hamster && tipo.equals("Hamster")){
                System.out.println();
                System.out.println("Hamster");
                System.out.println("Nombre " + a.getNombre_mas());
                System.out.println("Color de pelo " + a.getColor_pelo());
                System.out.println("Sonido " + a.sonido());
                System.out.println();
                
            }
            if(a instanceof Gato&& tipo.equals("Gato")){
                System.out.println();
                System.out.println("Gato");
                System.out.println("Nombre  " + a.getNombre_mas());
                System.out.println("Color de pelo  " + a.getColor_pelo());
                System.out.println("Sonido " + a.sonido());
            }
             if(a instanceof Perro && tipo.equals("Perro")){
                 System.out.println();
                 System.out.println("Perro");
                System.out.println("Nombre  " + a.getNombre_mas());
                System.out.println("Color de pelo" + a.getColor_pelo());
                System.out.println("Sonido" + a.sonido());
            }
        }
        
    } 
    public void Mostrar_mascota(){ 
            for(Mascota a: this.Mascotas){
                System.out.println();
                System.out.println("Mostrar Mascota");
                System.out.println("Nombre  " + a.getNombre_mas());
                System.out.println("Color de pelo" + a.getColor_pelo());
                System.out.println("Sonido " + a.sonido());
            }
    } 
    
}
