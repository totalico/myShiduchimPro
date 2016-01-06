package four.Entities;

import java.io.Serializable;
import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;


/* * 
 * 
 * Entity implementation class for Entity: boys
 *
 * */


@Entity
//@Inheritance(strategy = JOINED)
public class Boy extends Person implements Serializable  {

	private static final long serialVersionUID = 1L;
		
	public Boy() {
		super();
	}

   
}
