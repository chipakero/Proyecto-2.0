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
public class Customer extends DomainObject {
     private String nombre_cus;
    private String apellido_cus;
    private String telefono;
    private String calle;
    private String carrera;
    private String ciudad;
    private String estado;
    private String cod_postal;
    private String pais;

    public String getNombre_cus() {
        return nombre_cus;
    }

    public void setNombre_cus(String nombre_cus) {
        this.nombre_cus = nombre_cus;
    }

    public String getApellido_cus() {
        return apellido_cus;
    }

    public void setApellido_cus(String apellido_cus) {
        this.apellido_cus = apellido_cus;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCod_postal() {
        return cod_postal;
    }

    public void setCod_postal(String cod_postal) {
        this.cod_postal = cod_postal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Customer(String nombre_cus, String apellido_cus, String telefono, String calle, String carrera, String ciudad, String estado, String cod_postal, String pais, String ide) {
        super(ide);
        this.nombre_cus = nombre_cus;
        this.apellido_cus = apellido_cus;
        this.telefono = telefono;
        this.calle = calle;
        this.carrera = carrera;
        this.ciudad = ciudad;
        this.estado = estado;
        this.cod_postal = cod_postal;
        this.pais = pais;
    }
   
}
