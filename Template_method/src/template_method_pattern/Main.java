package template_method_pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PastaDish my_spagetthi = new SpagetthiMeatballs();
		PastaDish my_penne = new PenneAlfredo();
		
		my_spagetthi.makeRecipe();
		my_penne.makeRecipe();
		
	}

}
