
public class TrainingManagement {
	private static double totalIncome;
	private static double totalExpense;
	
	
public static double getTotalProfit() {
	return totalIncome-totalExpense;
}

public double getTotalIncome() {
	return totalIncome;
}

public double getTotalExpense() {
	return totalExpense;
}

public static void addIncome(double ammount) {
	totalIncome+=ammount;
}
public static void addExpense(double ammount) {
	totalExpense+=ammount;
}

public static void showDetails() {
	System.out.println("Total earn of Training center: "+totalIncome);
	System.out.println("Total spending of Training center: "+totalExpense);
	System.out.println("Total Profit of Training center: "+getTotalProfit());
	System.out.println("*********************************************");
}

	public static void main(String[] args) {
		showDetails();		
		Trainee trainee1 = new Trainee("Akash",101);
		trainee1.addFees(5000); trainee1.addGrade(4); 
		trainee1.displayTraineeDetails(); System.out.println();
		showDetails();		
		Trainee trainee2 = new Trainee("Akash",101);
		trainee2.addFees(6000); trainee2.addGrade(4);
		trainee2.displayTraineeDetails();	System.out.println();
		showDetails();		
		Trainer trainer1 = new Trainer("Anis",501,40000.0);
		trainer1.giveSalary(3000);
		trainer1.displayTrainerDetails();
		System.out.println();showDetails();
		
		
		

	}

}
