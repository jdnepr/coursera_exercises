package Factory_package;

public class fishKnife extends Knife {

    public fishKnife(){
        produceKnife();
    }

    @Override
    void produceKnife() {
        this.bladeLength = 4.0f;
        this.handleLength = 1.3f;
        this.handleMaterial = "Metal";
    }
}
