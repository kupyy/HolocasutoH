package holocaustoH;

public class Hadron extends Personaje {
	//class properties
	private boolean visible = true;
	
	public boolean switchV(boolean visible) {
		if(this.visible) {
			this.visible= false;
		}else {
			this.visible = true;
		}
		
		return this.visible;
	}
	
	public Hadron() {
		
	}
}
