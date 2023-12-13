package holocaustoH;
import java.util.concurrent.ThreadLocalRandom;

public class Juego {
	
	final static int LANZAR_DADO = 1;
	final static int SALIR = 0;

	public Juego() {
		
	}
	
	/*
	 * i -> recorre el alto(filas)
	 * j -> recorre el ancho(columnas)
	 * */
	public static void dibujaHabitacion(Habitacion h, Personaje p) {		
		for(int i = -1; i < Habitacion.ALTO; i++) {
			for(int j = 0; j <= Habitacion.ANCHO; j++ ) {
				Posicion posicionActual = new Posicion(j,i);
				
				if(p.playerPos(posicionActual)) {
					System.out.print("J");
				}else if (i == -1 && j != Habitacion.ANCHO) {
					System.out.print(j);//numerador de columnas
				}else if (j == Habitacion.ANCHO && i!=-1) {
					System.out.print(i);//numerador de filas
				}else if (h.esPuerta(posicionActual)) {
					System.out.print(" ");//puerta
				}else if (j == 0 || j == Habitacion.ANCHO-1) {
					System.out.print("|");//pared derecha e izquierda
				}else if (i == 0 || i == Habitacion.ALTO-1) {
					System.out.print("=");//pared superior e inferior
				}else {
					System.out.print(" ");//espacio vacío en la habitación
				}
			}
			System.out.println();
		}
	}
	
	public static void dibujarMenu() {
		System.out.println("========== Holocausto H [Hadrón] ==========");
		System.out.println("[ 1 ]  LANZAR DADO");
		System.out.println("[ 0 ]  SALIR");
		System.out.println("===========================");
	}
	
	public static int LanzarDado() {
		int dado = ThreadLocalRandom.current().nextInt(1, 7);
		return dado;
	}

}

