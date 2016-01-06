package four.Entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: brothersPer
 *
 **/

@Entity
public class Brother implements Serializable {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private long lngBrotherId;
	
	private static final long serialVersionUID = 1L;
	
	
	
	@ManyToOne 
	private Person peBroPers; 


	private enum enBrotherGender {
		MALE , FEMALE ;
	}
	
	private Integer inAge;
	@Column (nullable = false)
	private String name;
	@Column (nullable = false)
	private String stFamily_name;
	private String stMerryTo ;
	private String stSchool;
	private String stMehutanimCity;
	

	//   if the brother is in the list of shiduchim
	
	
	
	public Brother() {
		super();
	}
	
   
}

