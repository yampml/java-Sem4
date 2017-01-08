
public class Employee extends Person{

	
	private float salary;
	private float rate;
	
	public Employee(String name, int age, String address, float salary, float rate) {
		super(name, age, address);
		this.salary = salary;
		this.rate = rate;		
	}	
	
	public float totalSalary(){
		return rate*salary;
	}
	
	public void display(){
		super.display();
		System.out.println(" có tổng lương là " + totalSalary());
	}
}
