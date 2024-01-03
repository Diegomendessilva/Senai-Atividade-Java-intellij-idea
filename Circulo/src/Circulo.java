public class Circulo {
    private double raio;
    private String cor;
    private String material;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double calcularArea(){
        return getRaio() * getRaio() * 3.14;
    }

    public double calcularPerimetro(){
        return 2 * getRaio() * 3.14;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", cor='" + cor + '\'' +
                ", material='" + material + '\'' +
                "area= " + calcularArea() +
                "perimetro= " + calcularPerimetro() +'}';
    }
}