import Main.Sex;


public class Olympian {
	
	public enum Sex {
		MALE, FEMALE
		}
	
		public String name;
		public Sex sex;
		public int age;
		
		public void olympian(String name, Sex sex, int age){
			this.name = name;
			this.sex = sex;
			this.age = age;
		}
		
}
