package Tarea_7;

public class Libro {
    private String material;
    private String editorial;
    private int paginas;

    public void SigPagina(){
        System.out.println("Has cambiado a la siguiente pagina...");
    }
    public void AntPagina(){
        System.out.println("Has cambiadoa  la anterior pagina...");
    }

    public Libro() {
    }

    public Libro(String material, String editorial, int paginas) {
        this.material = material;
        this.editorial = editorial;
        this.paginas = paginas;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "material='" + material + '\'' +
                ", editorial='" + editorial + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
