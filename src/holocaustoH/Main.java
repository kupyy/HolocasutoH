package holocaustoH;

public class Main {
    public static void main(String[] args){
    	Posicion posInicial = new Posicion();
    	//Initial player positioning
    	posInicial.setPosX(3);
    	posInicial.setPosY(0);
    	
        //Generación de objetos
        Habitacion hab1 = new Habitacion();
        Personaje player = new Personaje();
        player.setPos(posInicial);
        
        System.out.println(player.getPos());
    }
}
