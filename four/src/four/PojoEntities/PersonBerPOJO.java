package four.PojoEntities;

import four.enums.RelationToPersonBer;

public class PersonBerPOJO {

	String nameNfamily;
	String phoneNum;
     RelationToPersonBer rtPb ;
	
    public PersonBerPOJO(String nameNfamily, String phoneNum,
			int relationToPersonBer) {
		super();
		this.nameNfamily = nameNfamily;
		this.phoneNum = phoneNum;
		this.rtPb = RelationToPersonBer.values()[relationToPersonBer];
	}
	
    
	
}
