/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5;

/**
 *
 * @author Diego
 */
import java.util.*;
public class Category extends DomainObject {

    public Category(String nombre_cat, String des_cat, String id) {
        super(id);
        this.products=new ArrayList<>();
        this.nombre_cat = nombre_cat;
        this.des_cat = des_cat;
        
        Product products1=new Product("Chocorramo","ponque","A");
        Product products2=new Product("Papas","snack","B");
        Product products3=new Product("Gaseosa","bebida","c");
        Product products4=new Product("Chicles","Goma","d");
        this.products.add(products1);
        this.products.add(products2);
        this.products.add(products3);
        this.products.add(products4);
    }

    public String getNombre_cat() {
        return nombre_cat;
    }

    public void setNombre_cat(String nombre_cat) {
        this.nombre_cat = nombre_cat;
    }

    public String getDes_cat() {
        return des_cat;
    }

    public void setDes_cat(String des_cat) {
        this.des_cat = des_cat;
    }
    private String nombre_cat;
    private String des_cat;
    private ArrayList<Product>products;
    public void listar(){
        int j=0;
        for(Product p : this.products){
            j++;
            System.out.println("Nombre " + p.getNom_pro());
            System.out.println("Descripcion " + p.getDescrip_pro());
            System.out.println("Id " + p.getId_domain());
            
            int i=0;
            
            while(i<p.getItem().size() && j==this.products.size()){
            System.out.println("Tamaño " + p.getItem().get(i).getNom_item());
            System.out.println("Costo unitario " + p.getItem().get(i).getCosto_un());
            System.out.println("Id nom " + p.getItem().get(i).getId_domain());
            i++;
            }
        }
    }
}
