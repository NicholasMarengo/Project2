
public class OlympianManager {
	
		//initialize the OlympianManager class
		public OlympianManager(){}
	
		//Retrieve an array of the olympians in the system
		public Olympian[] getOlympians() {}
	
		public void olympians(String args[]){
			{	
			Olympian[] olympians = new Olympian[16];
			olympians[0] = new Olympian("Tito", Sex.MALE, 18);
			olympians[1] = new Olympian("Brandon", Sex.MALE, 19);
			olympians[2] = new Olympian("Alyssa", Sex.FEMALE, 19);
			olympians[3] = new Olympian("Duane", Sex.Male, 19);
			olympians[4] = new Olympian("Rachelle", Sex.FEMALE, 19);
			olympians[5] = new Olympian("Jae", Sex.MALE, 18);
			olympians[6] = new Olympian("Zack", Sex.MALE, 19);
			olympians[7] = new Olympian("Jon", Sex.MALE, 19);
			olympians[8] = new Olympian("Gab", Sex.FEMALE, 18);
			olympians[9] = new Olympian("Talia", Sex.FEMALE, 20);
			olympians[10] = new Olympian("Brian", Sex.MALE, 99);
			olympians[11] = new Olympian("Ethan", Sex.Male, 19);
			olympians[12] = new Olympian("Max", Sex.MALE, 19);
			olympians[13] = new Olympian("Will", Sex.MALE, 19);
			olympians[14] = new Olympian("Nicholas", Sex.MALE, 19);
			olympians[15] = new Olympian("Jack", Sex.MALE, 19);}
				
			
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
