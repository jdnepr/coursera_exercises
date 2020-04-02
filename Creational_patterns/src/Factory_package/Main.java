package Factory_package;
import Singleton_package.Singleton;

public class Main {
    public static void main(String[] args) {

        knifeStore ExpensiveKnifeStore = new knifeStore();
        //ExpensiveKnifeStore.orderKnife("BREADKNIFE");

        Knife orderedBredKnife = ExpensiveKnifeStore.orderKnife("BREADKNIFE");
        System.out.println("...Produced bread knife...");
        System.out.println("Blade length: " + orderedBredKnife.bladeLength);
        System.out.println("Handle length: " + orderedBredKnife.handleLength);
        System.out.println("Handle material: " + orderedBredKnife.handleMaterial);
        System.out.println("Factory label: " + orderedBredKnife.factoryLabel);

        //ExpensiveKnifeStore.orderKnife("FISHKNIFE");
        Knife orderedfishKnife = ExpensiveKnifeStore.orderKnife("FISHKNIFE");
        System.out.println("...Produced fish knife...");
        System.out.println("Blade length: " + orderedfishKnife.bladeLength);
        System.out.println("Handle length: " + orderedfishKnife.handleLength);
        System.out.println("Handle material: " + orderedfishKnife.handleMaterial);
        System.out.println("Factory label: " + orderedfishKnife.factoryLabel);

        //ExpensiveKnifeStore.orderKnife("FISHKNIFE");
        Knife orderedbutcherKnife = ExpensiveKnifeStore.orderKnife("BUTCHERKNIFE");
        System.out.println("...Produced butcher knife...");
        System.out.println("Blade length: " + orderedbutcherKnife.bladeLength);
        System.out.println("Handle length: " + orderedbutcherKnife.handleLength);
        System.out.println("Handle material: " + orderedbutcherKnife.handleMaterial);
        System.out.println("Factory label: " + orderedbutcherKnife.factoryLabel);


    }
}
