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
public class Item extends DomainObject {
    private String nom_item;
    private Product producto;

    public Item(String nom_item, double costo_un, String iden) {
        super(iden);
        this.nom_item = nom_item;
        this.costo_un = costo_un;
        
    }
    public void addProducto(Product p){
        this.producto= new Product(p.getNom_pro(),p.getDescrip_pro(),p.getId_domain());
    }
    
    private double costo_un;
    public String getNom_item() {
        return nom_item;
    }

    public void setNom_item(String nom_item) {
        this.nom_item = nom_item;
    }

    public double getCosto_un() {
        return costo_un;
    }

    public void setCosto_un(double costo_un) {
        this.costo_un = costo_un;
    }
    
    
}
