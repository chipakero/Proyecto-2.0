
package laboratorio;


public class main2 {
    public static void main(String [] args){
        tomarorden orden1= new tomarorden("","",0,"","",0);
        tomarorden2 orden2= new tomarorden2(0,"",0,"","",0);
        System.out.println("Bievenidos");
        System.out.println("Presione 1 se desea una pizza Do it yourself");
        System.out.println("Presione 2 si desea una pizza prefabriacada");
        int x;
        java.util.Scanner leer = new java.util.Scanner(System.in);
        x=leer.nextInt();
        if(x==1){
            
        }else if(x==2){
            int a;
            System.out.println("¿Que conjunto de pizza quiere?(Todos los conjuntos tienen el mismo precio: $4000)");
            orden2.setConjunto(a=leer.nextInt());
            System.out.println("¿Que tipo de corteza  quiere?");
            orden2.setCorteza("");
             int b;
            System.out.println("¿De que tamañao desea la  pizza ?");
            orden2.setConjunto(b=leer.nextInt());
             System.out.println("¿Que tipo de bebida desea ?");
            orden2.setTipo_bebida("");
             System.out.println("¿De que tamaño desea la bebida?");
            orden2.setTam_bebida("");
            int c=4000+2000;
            orden2.setPrecio(c);
            System.out.println("La cuenta es: "+orden2.getPrecio());
            
        }else{
            System.out.println("error, vuelva a correr el programa");
        }
      
   
    }
    
}
