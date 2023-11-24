package holocaustoH;

public class Personaje {
	//player properties
	private String nombre;
	Posicion pos;
	
	//Getters & setters
	public String getNombre() {
		return nombre;
	}

	public Posicion getPos() {
		return pos;
	}

	public void setPos(Posicion pos) {
		this.pos = pos;
	}

	//Constructor
	public Personaje(){
        
    }
}
