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
public class Product extends DomainObject {
       private String nom_pro;
    private String descrip_pro;
    private ArrayList<Item>item;
    private Category category;

    public String getNom_pro() {
        return nom_pro;
    }

    public void setNom_pro(String nom_pro) {
        this.nom_pro = nom_pro;
    }

    public ArrayList<Item> getItem() {
        return item;
    }

    public void setItem(ArrayList<Item> item) {
        this.item = item;
    }

    public String getDescrip_pro() {
        return descrip_pro;
    }

    public void setDescrip_pro(String descrip_pro) {
        this.descrip_pro = descrip_pro;
    }
    public void addcategoria(Category c){
         this.category=new Category(c.getNombre_cat(),c.getDes_cat(),c.getId_domain());
    }

    public Product(String nom_pro, String descrip_pro, String id_domain) {
        super(id_domain);
        this.item=new ArrayList<>();
        this.nom_pro = nom_pro;
        this.descrip_pro = descrip_pro;
        Item item1 = new Item("MINI ",500.0,"A1");
        Item item2 = new Item("Grande " ,1500.0,"A2");
        Item item3 = new Item("Pollo " ,1000.0,"B1");
        Item item4 = new Item("Limon " ,1100.0,"B2");
        Item item5 = new Item("Cocacola 350 ",1500.0,"C1");
        Item item6 = new Item("Cocacola 225 " ,900.0,"C2");
        Item item7 = new Item("Trident", 200.0,"D1");
        Item item8 = new Item("tumix " ,100,"D2");
        
        this.item.add(item1);
        this.item.add(item2);
        this.item.add(item3);
        this.item.add(item4);
        this.item.add(item5);
        this.item.add(item6);
        this.item.add(item7);
        this.item.add(item8);
        
        
        
    }
 
}
