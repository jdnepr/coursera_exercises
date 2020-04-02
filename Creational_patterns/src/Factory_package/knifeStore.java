package Factory_package;

public class knifeStore {

    public Knife orderKnife(String knifeType){
        if (knifeType == null){
            return null;
        }
        if (knifeType.equalsIgnoreCase("BUTCHERKNIFE")){
            return new butcherKnife();
        }
        if (knifeType.equalsIgnoreCase("BREADKNIFE")){
            return new breadKnife();
        }
        if (knifeType.equalsIgnoreCase("FISHKNIFE")){
            return new fishKnife();
        }
        return null;
    }
}
