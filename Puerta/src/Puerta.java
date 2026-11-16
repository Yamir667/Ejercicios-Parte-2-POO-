public class Puerta {
    private boolean abierta;

    public Puerta() {
        this.abierta = false;
    }

    public void abrir() {
        this.abierta = true;
    }

    public void cerrar() {
        this.abierta = false;
    }

    public String estado() {
       if(this.abierta) {
           return "La puerta está abierta.";
       } else {
           return "La puerta está cerrada.";
       }
    }
}
