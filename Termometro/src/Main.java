public class Main {
    public static void main(String[] args) {
        Termometro termometro = new Termometro();

        termometro.subir(27.0);
        System.out.println("Temperatura después de subir: "+termometro.getTemperatura()+" Grados celcius");
        termometro.bajar(5.0);
        System.out.println("Temperatura después de bajar: "+termometro.getTemperatura()+" Grados celcius");
    }
}
