public class Termometro {

    private double temperatura;

    public void termometro() {
        this.temperatura = 0.0;
    }

    public void subir(double grados) {
        this.temperatura += grados;
    }

    public void bajar(double grados) {
        this.temperatura -= grados;
    }

    public double getTemperatura() {
        return temperatura;
    }
    
}
