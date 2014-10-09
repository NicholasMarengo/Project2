
public class HorseShoesEvent {
	int numHorseshoes;
	public HorseShoesEvent(String name, int playTo, boolean isPlayToExact, int playDistance){
		super(name, playTo, isPlayToExact, playDistance);
	}
	public HorseShoesEvent(){
		super("HorseShoes", 11, false, 40);
	}
	
}
