package company_employee;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {

	

		private String name;
		private double salary;
		private Date hiredate;
		private String secretary;
		
		public Employee(){
			
		}
		
		public Employee(String n,double s,int year, int month, int day){
			name=n;
			salary=s;
			
			 GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
			    hiredate = calendar.getTime();
			
		}

		public String getSecretary() {
			return secretary;
		}

		public void setSecretary(String secretary) {
			this.secretary = secretary;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public Date getHiredate() {
			return hiredate;
		}

		public void setHiredate(Date hiredate) {
			this.hiredate = hiredate;
		}
		
		public void print(){
			System.out.println("name=" + getName() + ",salary=" + getSalary());
		}
		
		public void raiseSalary(double byPercent) {
		    double raise = salary *(1+ byPercent / 100);
		    salary= raise;
		  }
		

}