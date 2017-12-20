package company_employee;

public class ManagerTest {
	public static void main(String[] args) {
	    
	   Employee boss = new Employee("Goutham", 80000, 2016, 12, 15);
	   Employee staff1 = new Employee("Rajeev", 50000, 2017, 10, 2);
	   Employee staff2 = new Employee("sidhu", 40000, 2017, 3, 15);
	    Employee staff3 = new Employee("satya", 60000, 2017, 3, 15);
	    Employee staff4 = new Employee("mounika", 70000, 2017, 3, 1);
	  
	    
	    
	    
	   /*** boss.setBonus(5000);
	    staff1.setBonus(5000);
	    staff2.setBonus(5000);
	    staff3.setBonus(5000);
	    staff4.setBonus(5000);**/
	    
	    
	   boss.raiseSalary(6);
	    staff1.raiseSalary(6);
	    staff2.raiseSalary(6);
	    staff3.raiseSalary(6);
	    staff4.raiseSalary(6);
	    
	    boss.setSecretary("john");

	    Employee[] staff = new Employee[5];

	

	   staff[0] = boss;
	   staff[1] =  staff1;
	   staff[2] = staff2;
	    staff[3] = staff3;
	   staff[4] = staff4;
	    
	    
	 /***  staff[0]=boss;
	    staff[1]=("Rajeev", 50000, 2017, 10, 2);
	    staff[2]=("sidhu", 40000, 2017, 3, 15);
	    staff[3]=("satya", 60000, 2017, 3, 15);
	    staff[4]=("mounika", 70000, 2017, 3, 1);***/
	    
	Employee es=new Employee();
	//es.raiseSalary(6);

	    
	    for (Employee e : staff)
	      System.out.println("name=" + e.getName() + ",salary=" + e.getSalary()+",hireDate ="+e.getHiredate());
	    
	    System.out.println("Manager's secretaryName=   "+boss.getSecretary());
	  }
	}