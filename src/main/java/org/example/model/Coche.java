package org.example.model;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "coche")
public class Coche {
    private String marca;
    private String modelo;
    private String matricula;
    private int anyo;
    private  String fechaventa;

    public Coche() {
        // Constructor por defecto necesario para JAXB
    }

    public Coche(String marca, String modelo, String matricula, int anyo, String fechaventa){
this.marca=marca;
this.modelo=modelo;
this.matricula=matricula;
this.anyo=anyo;
this.fechaventa=fechaventa;

    }

    @XmlElement
    public String getMarca() {return marca;}

    public void setMarca(String marca) {this.marca=marca;}

    @XmlElement
    public String getModelo() {return modelo;}

    public void setModelo(String modelo) {this.modelo=modelo;}

    @XmlElement
    public String getMatricula() {return matricula;}

    public void setMatricula(String matricula) {this.matricula=matricula;}


    @XmlElement
    public int getAnyo() {return anyo;}

    public void setAnyo(int anyo) {this.anyo=anyo;}


    @XmlElement
    public String getFechaventa() {return fechaventa;}

    public void setFechaventa(String fechaventa) {this.fechaventa=fechaventa;}

    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Matrícula: " + matricula +
                ", Año: " + anyo + ", Fecha de Venta: " + fechaventa;
    }





}
