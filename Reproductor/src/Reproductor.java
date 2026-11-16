public class Reproductor {
    private String cancion;
    private boolean reproduciendo;

    public Reproductor(){

        this.cancion = "";
        this.reproduciendo = false;

    }

    public void reproducir(String cancion){

        this.cancion = cancion;
        this.reproduciendo = true;

    }

    public void pausar(){

        this.reproduciendo = false;

    }   

    public String estado(){

        if(reproduciendo){
            return "Reproduciendo: " + cancion;
        } else {
            return "Pausado";
        }

    }
}
