
package laboratorio;


public class tomarorden2 {

    public int getTamaño() {
        return tamaño;
    }

    public int getPrecio() {
        return precio;
    }

    public String getCorteza() {
        return corteza;
    }

    public String getTipo_bebida() {
        return tipo_bebida;
    }

    public int getConjunto() {
        return conjunto;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCorteza(String corteza) {
        this.corteza = corteza;
    }

    public void setTipo_bebida(String tipo_bebida) {
        this.tipo_bebida = tipo_bebida;
    }

    public void setConjunto(int conjunto) {
        this.conjunto = conjunto;
    }
    private int tamaño;
    private int precio;
    private String corteza;
    private String tipo_bebida;
    private int conjunto;
private String tam_bebida;
    public String getTam_bebida() {
        return tam_bebida;
    }

    public void setTam_bebida(String tam_bebida) {
        this.tam_bebida = tam_bebida;
    }
    
     public tomarorden2(){
        this.corteza="";
        this.conjunto=0;
        this.precio=0;
        this.tamaño=0;
        this.tipo_bebida="";
        this.tam_bebida="";
     
    
}
     public tomarorden2(int conjunto, String corteza,int tamaño, String tipo_bebida, String tam_bebida ,  int precio){
        this.corteza=corteza;
        this.conjunto=conjunto;
        this.precio=precio;
        this.tamaño=tamaño;
        this.tipo_bebida=tipo_bebida;
        this.tam_bebida=tam_bebida;
    }
  
}
