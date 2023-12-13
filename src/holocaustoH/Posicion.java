package holocaustoH;

public class Posicion {
	//properties
	private int posX;
	private int posY;
	
	//setters && getters
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	//class constructor
	public Posicion() {
		
	}
	
	public Posicion(int x, int y) {
		posX = x;
		posY = y;
	}
	
	public boolean compararPos(Posicion p) {
		boolean posEquals = false;
		if(p.posX == this.posX && p.posY == this.posY) {
			posEquals = true;
		}
		return posEquals;			
	}
	
}
