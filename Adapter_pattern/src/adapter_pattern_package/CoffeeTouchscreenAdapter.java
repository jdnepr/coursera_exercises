package adapter_pattern_package;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface{
	
	private OldCoffeeMachine oldVendingMachine;
	
	public CoffeeTouchscreenAdapter(OldCoffeeMachine machine_old) {
		this.oldVendingMachine = machine_old;
	}
	
    public void chooseFirstSelection(){
        oldVendingMachine.SelectA();
    }
    public void chooseSecondSelection(){
        oldVendingMachine.SelectB();
    }

}
