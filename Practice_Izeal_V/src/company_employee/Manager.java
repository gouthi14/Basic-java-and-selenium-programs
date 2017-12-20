package company_employee;

public class Manager extends Employee {

	  private double bonus;
	 private String secretaryName;
	
	/** public double getSalary() {
	    double baseSalary = super.getSalary();
	    return baseSalary + bonus;
	  }**/

	  public void setBonus(double b) {
	    bonus = b;
	  }
	  public String getSecretaryName() {
			return secretaryName;
		}
	  
	  //add ½% bonus for every year of service.
	  
	  public void mraiseSalary(double byPercent) {
		    double raise = getSalary() *(1+ byPercent/2 / 100);
		    setSalary(raise);
		  }
		
	
	}

		
	
