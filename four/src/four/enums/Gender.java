package four.enums;

public enum Gender {

	MALE(0),
	FEMALE(1);
	
	private final Integer gen; 
	
	 Gender (int gen){	
		this.gen= gen;
	}

	public int getGen (){
		 return gen;
	 }
	
}
