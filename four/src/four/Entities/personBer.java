package four.Entities;
import java.io.Serializable;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

import four.enums.RelationToPersonBer;
import static javax.persistence.FetchType.EAGER;
import static javax.persistence.CascadeType.ALL;

/************************************************************
 * Entity implementation class for Entity: PersonBer		*
 *															*
 ************************************************************/
@Entity
public class personBer implements Serializable {

	
	@Id
	@Column (nullable = false)
	@GeneratedValue (strategy = GenerationType.AUTO)
	private long PersonBerId;
	
	private static final long serialVersionUID = 1L;

	
	@ManyToOne 
	private Person pers;
	
	
	@Column (nullable = false)
	protected String nameAndFamilyName;
    @Column (nullable = false)
    protected int numPhone ;
    @Column (nullable = false)
	protected RelationToPersonBer relationToPer;
    
     public Person getPerson (){ 	
    return pers;
    }

	public long getPersonBerId() {
		return PersonBerId;
	}

	public String getName () {
		return nameAndFamilyName;
	}

	public RelationToPersonBer getRelationToPer() {
		return relationToPer;
	}

	public void setRelationToPer(RelationToPersonBer relationToPer) {
		this.relationToPer = relationToPer;
	}

	public void setName(String name) {
		this.nameAndFamilyName = name;
	}


	public int getNumPhone() {
		return numPhone;
	}

	public void setNumPhone(int numPhone) {
		this.numPhone = numPhone;
	}

	public personBer (){
		
		super();
		
		
	}
	
   public personBer (String name, String numPhone, int relation){

	   super();
	   setName(name);
	   setNumPhone(Integer.parseInt(numPhone));
	   
	   
   }
}
