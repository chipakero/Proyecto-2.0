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
public class DomainObject {

    public DomainObject(String id_domain) {
        this.id_domain = id_domain;
    }

    public String getId_domain() {
        return id_domain;
    }

    public void setId_domain(String id_domain) {
        this.id_domain = id_domain;
    }
    private String id_domain;
}
