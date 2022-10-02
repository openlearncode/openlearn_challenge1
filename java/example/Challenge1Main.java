public class Challenge1Main{
	public static void main(String [] args){
		String name = Prompter.prompt("What is your name:");
		String surname = Prompter.prompt("What is your surname:");
		String dob = Prompter.prompt("What is your date of birth (DD/MM/YYYY):");
		String distance = Prompter.prompt("How far is your favourite store from your home in KMs:");

		if(DateValidator.isValid(dob)){
			System.out.println("Date is invalid exiting.");
			return;
		}

		//Validate that distance is a number using the NumberValidator

		System.out.println("All values are valid proceeding to calculations.");


		int age = AgeCalculator.calculate(dob);

		//Calulate Distance in Miles

		//Move this code into the printer class
		System.out.println("You are "+age+" years old.");
		//Pront the miles converted from KMs
	}
}