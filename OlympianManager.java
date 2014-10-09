
public class OlympianManager {
	
		//initialize the OlympianManager class
		public OlympianManager(){}
	
		//Retrieve an array of the olympians in the system
		public Olympian[] getOlympians() {}
	
		public void olympians(String args[]){
			{	
			olympian[] olympians = new olympian[16];
			olympians[0] = new olympian("Tito", male, 18);
			olympians[1] = new olympian("Brandon", male, 19);
			olympians[2] = new olympian("Alyssa", female, 19);
			olympians[3] = new olympian("Duane", male, 19);
			olympians[4] = new olympian("Rachelle", female, 19);
			olympians[5] = new olympian("Jae", male, 18);
			olympians[6] = new olympian("Zack", male, 19);
			olympians[7] = new olympian("Jon", male, 19);
			olympians[8] = new olympian("Gab", female, 18);
			olympians[9] = new olympian("Talia", female, 20);
			olympians[10] = new olympian("Brian", male, 99);
			olympians[11] = new olympian("Ethan", male, 19);
			olympians[12] = new olympian("Max", male, 19);
			olympians[13] = new olympian("Will", male, 19);
			olympians[14] = new olympian("Nicholas", male, 19);
			olympians[15] = new olympian("Jack", male, 19);}
				
			
			for(int i=0; i<olympians.length; i++) {
				olympians[i] = new olympian(i+1);
			}
			}

		public void printOlympians() {
			
			for (int i=0; i<olympians.length; i++){
				System.out.println(olympians[i].getEventInfo());
			}
				
			}


}





