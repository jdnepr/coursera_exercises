package Factory_package;

public class butcherKnife extends Knife {

    public butcherKnife(){
        produceKnife();
    }

    @Override
    void produceKnife() {
        bladeLength = 3.2f;
        handleLength = 1.2f;
        handleMaterial = "Wood";
    }
}
