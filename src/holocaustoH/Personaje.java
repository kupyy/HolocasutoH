package holocaustoH;

public class Personaje {
	// player properties
	private String nombre;
	private Posicion pos;

	// Getters & setters
	public String getNombre() {
		return nombre;
	}

	public Posicion getPos() {
		return pos;
	}

	public void setPos(Posicion pos) {
		this.pos = pos;
	}
	
	public int getPosX() {
		return this.pos.getPosX();
	}
	
	public int getPosY() {
		return this.pos.getPosY();
	}

	// define player's positioning
	public boolean playerPos(Posicion player) {
		boolean isPlayer = false;

		if (player.compararPos(this.getPos())) {
			isPlayer = true;
		}

		return isPlayer;
	}
	
	//move player
	//move x
	public void moverY(int y) {
		this.pos.setPosY(this.pos.getPosY()+y);
	}
	//move y
	public void moverX(int x) {
		this.pos.setPosX(this.pos.getPosX()+x);
	}
	
	//check positioning
	public boolean posCorrecta(Posicion pEntrada, Posicion pSalida) {		
		return this.pos.compararPos(pSalida) && this.pos.compararPos(pSalida);
	}

	// Constructor
	public Personaje() {

	}
}
