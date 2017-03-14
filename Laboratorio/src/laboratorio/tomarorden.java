
package laboratorio;


public class tomarorden{
    private int tamaño;
    private String ingrediente;
    private int precio;
    private String corteza;
    private String tipo_bebida;
    private String tam_bebida;

    public void setTam_bebida(String tam_bebida) {
        this.tam_bebida = tam_bebida;
    }
    

    public String getTipo_bebida() {
        return tipo_bebida;
    }

    public String getTam_bebida() {
        return tam_bebida;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
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

   
    public tomarorden(){
        this.corteza="";
        this.ingrediente="";
        this.precio=0;
        this.tamaño=0;
        this.tipo_bebida="";
        this.tam_bebida="";
     
    
}
    public tomarorden(String ingrediente, String corteza,int tamaño, String tipo_bebida, String tam_bebida,  int precio){
          this.corteza=corteza;
        this.ingrediente=ingrediente;
        this.precio=precio;
        this.tamaño=tamaño;
        this.tipo_bebida=tipo_bebida;
        this.tam_bebida=tam_bebida;
    }
  
      public String getCorteza() {
        return corteza;
    }
        public int getTamaño() {
        return tamaño;
    }
         public int getPrecio() {
        return precio;
    }
         public String getIngrediente(){
             return ingrediente;
         }
}
