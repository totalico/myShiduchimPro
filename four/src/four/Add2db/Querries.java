package four.Add2db;

 import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import four.Entities.User;


public class Querries {
/**
 * @param return user by find and serching in custom cuolmn
 */
	static public List<User> getUseryBy (String clmn, String value){
	
		persist2db.Open_em();
		Query query=persist2db.em.createQuery("SELECT a FROM User a WHERE a."+clmn+" LIKE '"+value+"'");

//		persist2db.em.close();

		@SuppressWarnings("unchecked")
		List<User> result =(List<User>)query.getResultList();
		return result;
	}
}

/*
 * 
 * 
 * 
 * 
 * //Between
      Query query = entitymanager.createQuery( "Select e " + "from Employee e " + "ORDER BY e.ename ASC" );

      List<Employee> list = (List<Employee>)query.getResultList( );

      for( Employee e:list ) {
         System.out.print("Employee ID :" + e.getEid( ));
         System.out.println("\t Employee Name :" + e.getEname( ));
      }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * mport java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.tutorialspoint.eclipselink.entity.Employee;

public class BetweenAndLikeFunctions {
   public static void main( String[ ] args ) {
   
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Eclipselink_JPA" );
      EntityManager entitymanager = emfactory.createEntityManager();
      
      //Between
      Query query = entitymanager.createQuery( "Select e " + "from Employee e " + "where e.salary " + "Between 30000 and 40000" );
      
      List<Employee> list=(List<Employee>)query.getResultList( );

      for( Employee e:list ){
         System.out.print("Employee ID :" + e.getEid( ));
         System.out.println("\t Employee salary :" + e.getSalary( ));
      }

      //Like
      Query query1 = entitymanager.createQuery("Select e " + "from Employee e " + "where e.ename LIKE 'M%'");
      
      List<Employee> list1=(List<Employee>)query1.getResultList( );
      
      for( Employee e:list1 ) {
         System.out.print("Employee ID :"+e.getEid( ));
         System.out.println("\t Employee name :"+e.getEname( ));
      }
   }
}
 * 
 */ 
