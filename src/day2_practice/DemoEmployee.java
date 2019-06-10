package day2_practice;

public class DemoEmployee {
public static void main(String[] args) {
		
		  //Creating a reference of employee class
		  
		  Employee gowthami = new Employee(); 
		  gowthami.salary = 100000; 
		  gowthami.bonus= 10000;
		  gowthami.calculateSalary();
		  
		  //-------------------------------------
		  
		  Employee viswanad = new Employee();
		  viswanad.salary = 20000;
		  viswanad.bonus = 20000; 
		  viswanad.calculateSalary();
		  
		//-------------------------------------
		 

		Employee xyz = new Employee();
		xyz.salary = 30000;
		xyz.bonus = 30000;
		int xyzSalary = xyz.calculateSalary1();
		System.out.println("xyzSalary: " + xyzSalary);
		
		//-------------------------------------
		
		Employee Mohan = new Employee();
		int MohanSalary = Mohan.calculateSalary1(40000, 40000);
		System.out.println("Mohan Salary: " +MohanSalary);
		//-------------------------------------
		
		Employee Gowthami = new Employee();
		Gowthami.bonus = 60000;
		Gowthami.salary = 60000;
		
		int GowthamiSalary = Gowthami.calculateSalary2(50000, 50000);
		System.out.println("Gowthami Salary: " +GowthamiSalary);
		
		Employee Gowthami1 = new Employee();
		Gowthami1.bonus = 60000;
		Gowthami1.salary = 60000;
		
		int Gowthami1Salary = Gowthami1.calculateSalary3(50000, 50000);
		System.out.println("Gowthami Salary: " +Gowthami1Salary);
		
	}
}
