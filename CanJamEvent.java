

public class CanJamEvent extends Events {	
		int frisbeeSize = 6;
		public CanJamEvent(String name, int playTo, boolean isPlayToExact, int playDistance){
			super(name, playTo, isPlayToExact, playDistance);
		}
		
		public CanJamEvent(){
			super("CanJam", 21, true, 50);
		}
		
	}

