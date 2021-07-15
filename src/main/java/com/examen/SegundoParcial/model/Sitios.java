package com.examen.SegundoParcial.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Sitios")
public class Sitios {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    
    @Column(name="descripcion",length = 255)
    private String descripcion;
    @Column(name="latitud",length = 255)
    private double latitud;
    @Column(name="longitud",length = 255)
    private double  longitud;
    @Column(name="fotografia")
    private byte[] fotografia;
   

  
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getLatitud() {
        return latitud;
    }
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }
    public double getLongitud() {
        return longitud;
    }
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    public byte[] getFotografia() {
        return fotografia;
    }
    public void setFotografia(byte[] fotografia) {
        this.fotografia = fotografia;
    }
    public Sitios(int id, String descripcion,double latitud,double longitud,byte[] fotografia) {
        this.id = id;
        this.descripcion = descripcion;
        this.latitud = latitud;
        this.longitud=longitud;
        this.fotografia=fotografia;
       
    }
    public Sitios() {
    }
    

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}