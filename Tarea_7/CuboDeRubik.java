package Tarea_7;

public class CuboDeRubik {
    private double tamEnCentimetros;
    private String marca;
    private String material;

    public void GirarEnVertical(){
        System.out.println("La columna del cubo a gitado correctamente");
    }
    public void GirarEnHorizontal(){
        System.out.println("La fila del cubo a girado correctamente");
    }

    public CuboDeRubik() {
    }

    public CuboDeRubik(double tamEnCentimetros, String marca, String material) {
        this.tamEnCentimetros = tamEnCentimetros;
        this.marca = marca;
        this.material = material;
    }

    public double getTamEnCentimetros() {
        return tamEnCentimetros;
    }

    public void setTamEnCentimetros(double tamEnCentimetros) {
        this.tamEnCentimetros = tamEnCentimetros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "CuboDeRubik{" +
                "tamEnCentimetros=" + tamEnCentimetros +
                ", marca='" + marca + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
