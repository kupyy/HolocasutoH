package holocaustoH;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	
    	int gameAction = -1;
    	
    	//Posicionamiento inicial del jugador
    	Posicion posInicial = new Posicion(0,3);
    	
        //Creación de la habitación
        Habitacion habitacionInicial = new Habitacion();
        
        //posicionamiento de puertas de entrada y salida
        Posicion entrada = new Posicion(0,3);
        habitacionInicial.setEntry(entrada);
        Posicion salida = new Posicion(5, Habitacion.ALTO-1);
        habitacionInicial.setexit(salida);
        
        //crear y posicionar jugador
        Jugador player = new Jugador();
        player.setPos(posInicial);
        

        while (gameAction != Juego.SALIR) {
        	Juego.dibujaHabitacion(habitacionInicial, player);
			Juego.dibujarMenu();
			gameAction = sc.nextInt();
		
			
			switch (gameAction) {
				case Juego.LANZAR_DADO:
					int numMovimientos = Juego.LanzarDado();
					boolean movValido = true;
					//objeto auxiliar para comprobar que el movimiento realizado es válido
					Posicion posProvisional = new Posicion();
					
					System.out.println("Introduce las columnas que quieras moverte (Movimientos restantes:" + numMovimientos + ")");
					int numC = sc.nextInt();
					
					
					//controla que no se introduzca una cantidad de movimientos mayor a la disponible
					if(Math.abs(numC) <= numMovimientos) {
						posProvisional.setPosX(player.getPosX() + numC);
						numMovimientos-=Math.abs(numC);						
					}else {
						System.out.println("El movimiento no es válido y no se realizará");
						posProvisional.setPosX(player.getPosX());
					}
					
					
					
					System.out.println("Introduce las filas que quieras moverte (Movimientos restantes:" + numMovimientos + ")");
					int numF = sc.nextInt();
					
					//controla que no se introduzca una cantidad de movimientos mayor a la disponible
					if(Math.abs(numF) <= numMovimientos) {
						posProvisional.setPosY(numF+player.getPosY());						
					}else {
						System.out.println("El movimiento no es válido y no se realizará");
						posProvisional.setPosY(player.getPosY());
					}
					
					//comprobar que el movimiento realizado no coincide con una pared
					//primero busca que la posicion del jugador esté en una posición donde chocaría con una pared
					if( (posProvisional.getPosX() == 0 || posProvisional.getPosX() == 9) || (posProvisional.getPosY() == 0 || posProvisional.getPosY() == 9) ) {
						
						//si es así, comprueba que su posición coincida con una puerta
						if( !(posProvisional.compararPos(salida) || posProvisional.compararPos(entrada)) ){
							//si no es una puerta, notificará al usuario y omitirá el movimiento
							System.err.println("Hay una pared, el movimiento no se realizará");
							movValido = false;
						}
					}else if(posProvisional.getPosX() < 0 || posProvisional.getPosY() < 0) {//comprueba que el usuario no salga de la habitación
						System.err.println("¡No puedes salir de la habitación!");
						movValido = false;
					}

					
					if(movValido) {
						player.moverX(numC);
						player.moverY(numF);
					}
					
				break;
			}
		}
    }
}
