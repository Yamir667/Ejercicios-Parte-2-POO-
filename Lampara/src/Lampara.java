public class Lampara {

    private boolean encendida;

    public Lampara(){
        this.encendida = false;

    }

    public void encender(){

        encendida = true;

    }

    public void apagar(){

        encendida = false;

    }

    public String estado(){
        if(encendida){
            return "La lampara esta encendida";
        } else {
            return "La lampara esta apagada";
        }

    }
}
