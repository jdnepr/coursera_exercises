package Factory_package;

public class breadKnife extends Knife {

    public breadKnife(){
        produceKnife();
    }

    @Override
    void produceKnife(){
        bladeLength = 4.7f;
        handleLength = 1.5f;
        handleMaterial = "Plastic";
    }
}
