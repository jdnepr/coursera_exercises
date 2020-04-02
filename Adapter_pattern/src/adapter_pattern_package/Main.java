package adapter_pattern_package;

public class Main {
	public static void main(String[] args) {
		OldCoffeeMachine machine_old = new OldCoffeeMachine();
		//test output of an old coffee machine
		machine_old.SelectA();
		machine_old.SelectB();
		
		NewCoffeeMachine machine_new = new NewCoffeeMachine();
		//test output of an old coffee machine
		machine_new.chooseFirstSelection();
		machine_new.chooseSecondSelection();
		
		CoffeeTouchscreenAdapter adapter = new CoffeeTouchscreenAdapter(machine_old);
		//test output when using methods of the new coffee machine, but expecting to receive 
		//answer as from old coffee machine
		adapter.chooseFirstSelection();
		adapter.chooseSecondSelection();
	}

}
