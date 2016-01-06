package four.Entities;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import four.enums.Gender;

/**
 * Entity implementation class for Entity: person
 *
 */

@Entity
public class Person implements Serializable {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private long PersonId; // primaryKey  PK
	
	@OneToMany (mappedBy = "pers" , targetEntity = personBer.class )
	private List<personBer> personBers = new ArrayList<personBer>() ;

//	@OneToMany ( mappedBy = "peBroPers" , targetEntity = Brother.class)
//    private ArrayList <Brother> brothers = new ArrayList <Brother>();
	
	private static long serialVersionUID = 1L;
	
	
		@Enumerated (EnumType.STRING)
		protected Gender gender;
		
		
		@Column (nullable = false)
		protected String name;
		
		@Column (nullable = false)
		protected String family_name;
		
		protected String Fathers_name;
		protected String Father_work;
		protected String Mothers_name;
		protected String Mother_family_name;
		protected String Mother_work;
		protected String School_name;
		protected int brothers_num;
	    protected String Fathers_origin;
	    protected String Mothers_origin;
	    protected int High;
	

	    protected String city;
	    protected String street;
	    protected String neghiborhood;
	    protected int numPhone ;
	
	    
/*  here the subject to calculate machine : ------> */

	    protected int age;
	    protected int Ortodox_lev_candidate;
	    protected int Ortodox_lev_family;
	    protected boolean as_sf;  //Sefardi or Ashkenzzi ----> yemans not included! TODO
	    protected int beuty_lev;
	    protected int IQ_lev;
	    protected boolean diseases;
	    protected int scoure;
	    	
	    Person (){
	    	super();
	    }
        
	    
	    /* -------------------------*/
	    /*GETTERS & SETTERS*/

		public long getPersonId() {
			return PersonId;
		}

	
		public List<personBer> getPersonBers() {
			return personBers;
		}
		

		public static long getSerialVersionUID() {
			return serialVersionUID;
		}

		public static void setSerialVersionUID(long serialVersionUID) {
			Person.serialVersionUID = serialVersionUID;
		}


		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getFamily_name() {
			return family_name;
		}

		public void setFamily_name(String family_name) {
			this.family_name = family_name;
		}

		public String getFathers_name() {
			return Fathers_name;
		}

		public void setFathers_name(String fathers_name) {
			Fathers_name = fathers_name;
		}

		public String getFather_work() {
			return Father_work;
		}

		public void setFather_work(String father_work) {
			Father_work = father_work;
		}

		public String getMothers_name() {
			return Mothers_name;
		}

		public void setMothers_name(String mothers_name) {
			Mothers_name = mothers_name;
		}

		public String getMother_family_name() {
			return Mother_family_name;
		}

		public void setMother_family_name(String mother_family_name) {
			Mother_family_name = mother_family_name;
		}

		public String getMother_work() {
			return Mother_work;
		}

		public void setMother_work(String mother_work) {
			Mother_work = mother_work;
		}

		public String getSchool_name() {
			return School_name;
		}

		public void setSchool_name(String school_name) {
			School_name = school_name;
		}

		public int getBrothers_num() {
			return brothers_num;
		}

		public void setBrothers_num(int brothers_num) {
			this.brothers_num = brothers_num;
		}

		public String getFathers_origin() {
			return Fathers_origin;
		}

		public void setFathers_origin(String fathers_origin) {
			Fathers_origin = fathers_origin;
		}

		public String getMothers_origin() {
			return Mothers_origin;
		}

		public void setMothers_origin(String mothers_origin) {
			Mothers_origin = mothers_origin;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getNeghiborhood() {
			return neghiborhood;
		}

		public void setNeghiborhood(String neghiborhood) {
			this.neghiborhood = neghiborhood;
		}

		public int getNumPhone() {
			return numPhone;
		}

		public void setNumPhone(int numPhone) {
			this.numPhone = numPhone;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getOrtodox_lev_candidate() {
			return Ortodox_lev_candidate;
		}

		public void setOrtodox_lev_candidate(int ortodox_lev_candidate) {
			Ortodox_lev_candidate = ortodox_lev_candidate;
		}

		public int getOrtodox_lev_family() {
			return Ortodox_lev_family;
		}

		public void setOrtodox_lev_family(int ortodox_lev_family) {
			Ortodox_lev_family = ortodox_lev_family;
		}

		public boolean isAs_sf() {
			return as_sf;
		}

		public void setAs_sf(boolean as_sf) {
			this.as_sf = as_sf;
		}

		public int getBeuty_lev() {
			return beuty_lev;
		}

		public void setBeuty_lev(int beuty_lev) {
			this.beuty_lev = beuty_lev;
		}

		public int getIQ_lev() {
			return IQ_lev;
		}

		public void setIQ_lev(int iQ_lev) {
			IQ_lev = iQ_lev;
		}

		public boolean isDiseases() {
			return diseases;
		}

		public void setDiseases(boolean diseases) {
			this.diseases = diseases;
		}

		public int getScoure() {
			return scoure;
		}

		public void setScoure(int scoure) {
			this.scoure = scoure;
		}

		public int getHigh() {
			return High;
		}

		public void setHigh(int high) {
			High = high;
		}
	    
}