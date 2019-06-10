package day2_practice;

public class Employee {
	
	int salary;
	int bonus;
	
	Employee(){
		salary = 1500;
		bonus = 1500;
	}
	
	void calculateSalary(){
		
		int totalsalary = salary+bonus;
		System.out.println("TotalSalary: "+totalsalary);
	}
	
	 //method with  no arguments
    int calculateSalary1() {
    	int totalsalary;
    	totalsalary = salary+bonus;
    	return totalsalary;
    }
    //method with arguments
    int calculateSalary1(int sal , int bon) {
    	
    	int totalsalary = sal+bon;
    	return totalsalary;
    }
    // we have defined the arguments name same as variables defined at class level , in this case it will always take the values passed in arguments
    int calculateSalary2(int salary , int bonus) {
    	
    	int totalsalary ;
    	totalsalary = salary+bonus;
    	return totalsalary;
    }
    
 // if we need to have the variables at instance / class level then we have to use this keyword
    int calculateSalary3(int salary , int bonus) {
    	
    	int totalsalary ;
    	totalsalary = this.salary+this.bonus;
    	return totalsalary;
    }
	
		
	}

