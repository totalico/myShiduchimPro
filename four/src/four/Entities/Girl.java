package four.Entities;




import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: girls
 *
 */


@Entity
public class Girl extends Person implements Serializable {


	private static final long serialVersionUID = 1L;
	
	//@ManyToMany( mappedBy = "metWith")
	//private Set<Boy> metWith = new HashSet<Boy>();

	public Girl() {
		
		super();
	}


}
