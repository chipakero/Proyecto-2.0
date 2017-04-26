package punto6;

import java.util.ArrayList;

public class main {
    
       public static void LeerMascotas(Veterinaria v){
           
       }
       public static void administrador(Veterinaria v, String n){
           ArrayList<Persona> Personas = new ArrayList<>();
           Persona p= new Persona(" Diego " , 1234);
           Persona p1= new Persona(" Andres " , 3456);
           Personas.add(p1);
           Personas.add(p);
           
           Hamster h= new Hamster(" Dogi ", " Verde ",763);
           Gato g= new Gato("Masmol ", " Gris ",908);
           Perro perro= new Perro(" Silver "," Plateado ",908);
           v.AgregarMascota(perro);
           v.AgregarMascota(g);
           v.AgregarMascota(h);
           v.Mostrar_mascotas_tipo(" Perro ");
           v.Mostrar_mascota();
           System.out.println(" Nombre Persona "  + Personas.get(1).getNombre());
           Personas.get(1).AgregarMascota(g);
           Personas.get(1).AgregarMascota(perro);
           Personas.get(1).Mostrar_mascotas();
           
       }

   
    public static void main(String[] args) {
       Veterinaria v= new Veterinaria();
       administrador(v,"n");
      v.Mostrar_mascotas_tipo("Perro");
      v.Mostrar_mascotas_tipo("Gato");
      v.Mostrar_mascotas_tipo("Hamster");
    }
    
}
