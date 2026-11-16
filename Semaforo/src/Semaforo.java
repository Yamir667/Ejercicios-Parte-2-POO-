public class Semaforo {
    
    private String color;

    public Semaforo() {
        this.color = "Rojo";
    }

    public void cambiarRojo() {

        color = "Rojo";

    }

    public void cambiarAmarillo() {

        color = "Amarillo";

    }

    public void cambiarVerde() {

        color = "Verde";

    }

    public String mostrarColor() {

        return color;

    }
}
