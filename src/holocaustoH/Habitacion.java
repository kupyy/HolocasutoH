package holocaustoH;

public class Habitacion {
	
	//Room size
	public static final int ANCHO=10;
	public static final int ALTO=10;
	
	//Properties
	Posicion pos;
	
	//room doors
	private Posicion entryDoor;
	private Posicion exitDoor;
	
	//player copy
	private Personaje j;
	
	//setters && getters
	public Posicion getPos() {
		return pos;
	}

	public void setPos(Posicion pos) {
		this.pos = pos;
	}
	
	//doors
	public void setEntry(Posicion entryDoor) {
		this.entryDoor = entryDoor;
	}
	
	public Posicion getEntry() {
		return entryDoor;
	}

	public void setexit(Posicion exitDoor) {
		this.exitDoor = exitDoor;
	}
	
	//set player positioning
	public void setPlayer(Jugador j) {
		this.j=j;
	}
	
	public void setPersonaje(Personaje p) {
		
	}
	
	public Posicion getExit() {
		return exitDoor;
	}
	
	//define if there's a door
	public boolean esPuerta(Posicion door){
		boolean isDoor = false;
		if(door.compararPos(entryDoor) || door.compararPos(exitDoor)) {
			isDoor = true;
		}
		
		return isDoor;
	}
	


	//constructor
    public Habitacion(){
        
    }
}
