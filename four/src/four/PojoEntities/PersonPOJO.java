package four.PojoEntities;

import java.util.ArrayList;
import java.util.List;

public class PersonPOJO {

		String name;			//Mandatory
		String familyName;		//Mandatory
		String city;			//Mandatory
		String adress;			//Mandatory
		String emploeeOrLernPlace;//Mandatory
		String phoneNum;		//Mandatory
		Integer age;			//Mandatory
		String desaes;
		String notes;
		Integer monyBring;
		Integer high;
		
		boolean isMale;
		boolean isDesaes;
		boolean isSmoking;
	
	List<BrothersPOJO> brothers = new ArrayList<BrothersPOJO>();
	List<PersonBerPOJO> Persons = new ArrayList<PersonBerPOJO>();

	
}
