
package laboratorio;

public class Punto1 {
    java.util.Scanner Pedido= new java.util.Scanner(System.in);
    void Pedido(){
        System.out.println("Presione 1 si desea una pizza hecha por usted, de lo contrario presione cualquier otro numero");
        int r;
        r=Pedido.nextInt();
        if(r==1){
            System.out.println("Vamos a armar una pizza a tu gusto");
          System.out.println("Promedio de gramos por porcion 350gr");
          double a,a1,a2,b,b1,b2,c,c1,c2,d,d1,d2,e,e1,e2,f,f1,f2,g,g1,g2,t,total;
           System.out.println("¿Cuantos gramos de Salami desea?");
           a=Pedido.nextInt();
            a1=a*30;
           System.out.println("Levas "+a+"gr");
           
           System.out.println("¿Cuantos gramos de Maiz desea?");
           b=Pedido.nextInt();
            b1=b*20; 
            b2=a+b;
           System.out.println("Levas "+b2+"gr");
           
           System.out.println("¿Cuantos gramos de Salchicha desea?");
           c=Pedido.nextInt();
            c1=c*20;
            c2=b2+c;
           System.out.println("Levas "+c2+"gr");
           
           System.out.println("¿Cuantos gramos de Tomate desea?");
           d=Pedido.nextInt();
            d1=d*25;  
            d2=c2+d;
           System.out.println("Levas "+d2+"gr");
           
           System.out.println("¿Cuantos gramos de Champiñon desea?");
           e=Pedido.nextInt();
           e1=e*30;
           e2=d2+e;
           System.out.println("Levas "+e2+"gr");
           
           System.out.println("¿Cuantos gramos de Pollo desea?");
           f=Pedido.nextInt();
            f1=f*30;
           f2=e2+f;
           System.out.println("Levas "+f2+"gr");
           
           System.out.println("¿Cuantos gramos de Carne Molida desea?");
           g=Pedido.nextInt();
            g1=g*30;
            g2=f2+g;
           System.out.println("Levas "+g2+"gr");
     
           System.out.println("¿De que tamaño la deseas? (6, 9 ,12 puladas?)");
           t=Pedido.nextInt();
           total=(a1+b1+c1+d1+e1+f1+g1)*t;
           System.out.println("Valor pizza "+total+" pesos");          
        }else{}    
    
   
        System.out.println("Presione 1 si desea una pizza prefabricada, de lo contrario presione cualquier otro numero");
        int q;
        q=Pedido.nextInt();
        if(q==1){
            int t;
          System.out.println("¿De que tamaño desea la pizza? (6, 9 ,12 puladas?)");
          t=Pedido.nextInt();
           System.out.println("Presione:"); 
           System.out.println("1.Carnes:"); 
           System.out.println("2.Hawaiana:"); 
           System.out.println("3.Champiñones:");
           System.out.println("4.Mexicana:");
           System.out.println("5.Napolitana:");
           System.out.println("6.Criolla:");
           int k, total2;
           k=Pedido.nextInt();        
            switch (k) {
                case 1:
                    total2=t*4000;
                    System.out.println("Carnes de: "+total2+" pesos" );
                    break;
                case 2:
                    total2=t*4000;
                    System.out.println("Hawaiana de: "+total2+" pesos" );
                    break;
                case 3:
                    total2=t*4000;
                    System.out.println("Champiñones de: "+total2+" pesos" );
                    break;
                case 4:
                    total2=t*4000;
                    System.out.println("Mexicana de: "+total2+" pesos" );
                    break;
                case 5:
                    total2=t*4000;
                    System.out.println("Napolitana de: "+total2+" pesos" );
                    break;
                case 6:
                    total2=t*4000;
                    System.out.println("Criolla de: "+total2+" pesos" );
                    break;
                default:
                    break;
            }
        }
        System.out.println("Presione 1 si desea una Bebida, de lo contrario presione cualquier otro numero");
        int p;
        p=Pedido.nextInt();
        if(p==1){
         System.out.println("Presione 1 para CocaCola");
         System.out.println("Presione 2 para Limonada");
         int bebida;
         bebida=Pedido.nextInt();
         if(bebida==1){
             System.out.println("Presione  1 para bebida Grande");
             System.out.println("Presione  2 para bebida Pequeña");
             int x,Bebida;
             x=Pedido.nextInt();
             if(x==1){
                 Bebida= 6000;
                 System.out.println("CocaCola Grande "+Bebida);
                 
             }else if(x==2){
                 Bebida= 4000;
                 System.out.println("CocaCola Pequeña "+Bebida);
                 
             }
         }else if(bebida==2){
             System.out.println("Presione  1 para bebida Grande");
             System.out.println("Presione  2 para bebida Pequeña");
             int x,Bebida;
             x=Pedido.nextInt();
             if(x==1){
                 Bebida= 7000;
                 System.out.println("Limonada Grande "+Bebida);
                 
             }else if(x==2){
                 Bebida= 5000;
                 System.out.println("Limonada Pequeña "+Bebida);
                 
         }            
     }  
    }else{}
}
}