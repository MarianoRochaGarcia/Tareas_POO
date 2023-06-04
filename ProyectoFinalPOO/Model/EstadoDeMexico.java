package ProyectoFinalPOO.Model;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class EstadoDeMexico {
    private int id;
    private String nombre;
    private String url;
    private String comidaTipica;
    private double millonesHabitantes;
    private int numMunicipios;

    public EstadoDeMexico() {
    }

    public EstadoDeMexico(int id, String nombre, String url, String comidaTipica, double millonesHabitantes, int numMunicipios) {
        this.id = id;
        this.nombre = nombre;
        this.url = url;
        this.comidaTipica = comidaTipica;
        this.millonesHabitantes = millonesHabitantes;
        this.numMunicipios = numMunicipios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getComidaTipica() {
        return comidaTipica;
    }

    public void setComidaTipica(String comidaTipica) {
        this.comidaTipica = comidaTipica;
    }

    public double getMillonesHabitantes() {
        return millonesHabitantes;
    }

    public void setMillonesHabitantes(double millonesHabitantes) {
        this.millonesHabitantes = millonesHabitantes;
    }

    public int getNumMunicipios() {
        return numMunicipios;
    }

    public void setNumMunicipios(int numMunicipios) {
        this.numMunicipios = numMunicipios;
    }

    @Override
    public String toString() {
        return "EstadoDeMexico{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", url='" + url + '\'' +
                ", comidaTipica='" + comidaTipica + '\'' +
                ", millonesHabitantes=" + millonesHabitantes +
                ", numMunicipios=" + numMunicipios +
                '}';
    }

    public ImageIcon getImagen() throws MalformedURLException {

        URL urlImagen = new URL(this.url);
        return new ImageIcon(urlImagen);
    }
}
