
public class Trainee {
	private String name ;
	private int id ;
	private double totalFees = 30000;
	private double paidFees= 0 ;
	private float grade ;
	
Trainee(String name, int id){
	this.name=name ;  this.id=id; 
}

public void addFees(double ammount) {
	this.paidFees+=ammount;
	TrainingManagement.addIncome(ammount);
}

public void addGrade(float grade) {
	this.grade=grade;
}

public double remainingFees() {
	return totalFees-paidFees;
}

public void displayTraineeDetails() {
	System.out.println("The name: "+name);
	System.out.println("The id: "+id);
	System.out.println("Total fees: "+totalFees);
	System.out.println("Fees paid: "+paidFees);
	System.out.println("Fees remaining: "+remainingFees());
	System.out.println("Grade: "+grade);
}


	public static void main(String[] args) {
		

	}


}
