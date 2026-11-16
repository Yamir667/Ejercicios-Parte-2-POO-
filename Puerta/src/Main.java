public class Main {
	public static void main(String[] args) {

        Puerta puerta = new Puerta();

        System.out.println(puerta.estado());
        puerta.abrir();
        System.out.println(puerta.estado()); 
        puerta.cerrar();
        System.out.println(puerta.estado()); 

	}
}
