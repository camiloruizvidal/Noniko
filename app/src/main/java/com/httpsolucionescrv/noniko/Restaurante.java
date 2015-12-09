package com.httpsolucionescrv.noniko;

/**
 * Created by MILO on 08/12/2015.
 */
public class Restaurante
{
    protected String Nombre;
    protected String Direccion;
    protected double Longitud;
    protected double Latitud;
    protected String Telefono;

    public Restaurante(String Nombre,String Direccion,String Telefono,double Longitud,double Latitud)
    {
        this.Nombre=Nombre;
        this.Direccion=Direccion;
        this.Telefono=Telefono;
        this.Longitud=Longitud;
        this.Latitud=Latitud;

    }

    public String getNombre() {
        return Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public double getLatitud() {
        return Latitud;
    }

    public double getLongitud() {
        return Longitud;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public void setLatitud(double latitud) {
        Latitud = latitud;
    }

    public void setLongitud(double longitud) {
        Longitud = longitud;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }
}