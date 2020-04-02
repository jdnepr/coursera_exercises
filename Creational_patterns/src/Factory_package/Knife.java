package Factory_package;

public abstract class Knife {
    protected float bladeLength;
    protected float handleLength;
    protected String handleMaterial;
    protected boolean sharp;
    protected String factoryLabel;

    public Knife(){
        putLabel();
        sharpenKnife();
    }

    abstract void produceKnife();

    public void putLabel(){
        this.factoryLabel = "McFire and Knives";
    }

    public void sharpenKnife(){
        this.sharp = true;
    }
}
