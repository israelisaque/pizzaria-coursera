package entidades;

import java.util.ArrayList;
import java.util.HashMap;

public class Pizza {
	
	public static HashMap<String, Integer> ingredientesTotal = new HashMap<>();
	private ArrayList<String> ingredientes = new ArrayList<>();
	
	public void adicionaIngrediente(String ingrediente) {
		ingredientes.add(ingrediente);
		contabilizaIngrediente(ingrediente);
	}
	
	public Double getPreco() {
		if (ingredientes.size() <= 2) {
			return 15.00;
		} else if (ingredientes.size() <= 5) {
			return 20.00;
		} else {
			return 23.00;
		}
	}
	
	public static void contabilizaIngrediente(String ingrediente) {
		if (ingredientesTotal.containsKey(ingrediente)) {
			ingredientesTotal.put(ingrediente, ingredientesTotal.get(ingrediente) + 1);
		} else {
			ingredientesTotal.put(ingrediente, 1);
		}
	}
	
	public ArrayList<String> getIngredientes() {
		return ingredientes;
	}
}
