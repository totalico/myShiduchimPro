package four.Add2db;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class persist2db {
	
	
	//TODO exception when the obj is not Serialzable =====>
	//boolean isSerializeble(object o){//}
		
	  public static EntityManagerFactory emf;
	  public static EntityManager em;
	  
	  // you can change unit name by using add2db stub.
	  public static String PERSISTENCE_UNIT_NAME="four";
	
	  
	  public static void add2db (Serializable Obj) {
		   
//	if(!em.isOpen())
		Open_em();
		  
		em.getTransaction().begin();
			
		em.persist(Obj);	
			
		em.getTransaction().commit();
		em.getTransaction().begin();
 		System.out.println("Transection to "+PERSISTENCE_UNIT_NAME+" done! ");

		}
	 
	 	public static void Open_em(){
	 		
	 		
	 		if (em == null ){
	 		System.out.println("Start persist "+PERSISTENCE_UNIT_NAME);
	 				emf=Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	 				 em = emf.createEntityManager();
	 		}else 
	 			if (em.isOpen())return;
	 			else {
	 				emf=Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	 				em = emf.createEntityManager();
				 }
	 		}
	 	

		 public static void closeConnection (){
				em.close();
		 		System.out.println("Close "+PERSISTENCE_UNIT_NAME);

		  }
		  
}
