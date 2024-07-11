package SD2.JPAMap1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("jpa");
    	EntityManager em=emf.createEntityManager();
    	em.getTransaction().begin();
    	
    	Employee e=new Employee();
    	e.setEname("chary");
    	e.setAddress("siddipet");
    	
    	Employee e1=new Employee();
    	e1.setEname("bhaskar");
    	e1.setAddress("hyderabad");
    	
    	Employee e2=new Employee();
    	e2.setEname("abhi");
    	e2.setAddress("nalgonda");
    	
    	em.persist(e);
    	em.persist(e1);
    	em.persist(e2);
    	
    	List <Employee> empl=new ArrayList<>();
    	
    	empl.add(e);
    	empl.add(e1);
    	empl.add(e2);
    	
    	
    	Department d=new Department();
    	d.setDname("JAVA DEVELOPER");
    	
        d.setEmplist(empl);
        
        
        em.persist(d);
        
        em.getTransaction().commit();
  	    em.close();
  	  emf.close();
        
    System.out.println( "successfully completed...!" );
    }
}
