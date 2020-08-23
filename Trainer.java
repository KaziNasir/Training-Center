
public class Trainer {
	private  String name;
	private  int id;
	private  double salary;
	private  double receivedSalary;
	
Trainer(String name, int id, double salary){
	this.name=name;  this.id=id;  this.salary=salary;
}
	
public void giveSalary(double ammount) {
	this.receivedSalary+=ammount;
	TrainingManagement.addExpense(ammount);
}

public double salaryYetToReceive() {
	return salary-receivedSalary;
}

public void displayTrainerDetails() {
	System.out.println("The name is: "+name);
	System.out.println("The id is: "+id);
	System.out.println("The salary is: "+salary);
	System.out.println("Salary paid: "+receivedSalary);
	System.out.println("Salary to be Received is: "+salaryYetToReceive());
}

	public static void main(String[] args) {
		

	}

}
