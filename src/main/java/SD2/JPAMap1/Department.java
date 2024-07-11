package SD2.JPAMap1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Department_table")
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Did;
	private String Dname;
	
	@OneToMany(targetEntity=Employee.class)
	private List Emplist;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int did, String dname) {
		super();
		Did = did;
		Dname = dname;
	
	}

	public int getDid() {
		return Did;
	}

	public void setDid(int did) {
		Did = did;
	}

	public String getDname() {
		return Dname;
	}

	public void setDname(String dname) {
		Dname = dname;
	}

	public List getEmplist() {
		return Emplist;
	}

	public void setEmplist(List emplist) {
		Emplist = emplist;
	}

	@Override
	public String toString() {
		return "Department [Did=" + Did + ", Dname=" + Dname + "]";
	}

	

	
	
	

}
