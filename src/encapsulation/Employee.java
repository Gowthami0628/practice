package encapsulation;

public class Employee {
	
	private int salary;
	private int bonus;
	
void calculateSalary(){
		
		int totalsalary = salary+bonus;
		System.out.println("TotalSalary: "+totalsalary);
	}

public void setSalary(int salary) {
	if(salary>0) {
	this.salary = salary;
}else {
	System.err.println("invalid salary");
}
}

public void setBonus(int bonus) {
	if(salary>0) {
	this.bonus = bonus;
	}else {
		System.err.println("invalid bonus");
	}
}

public int getSalary() {
	return salary;
}

public int getBonus() {
	return bonus;
}


}

