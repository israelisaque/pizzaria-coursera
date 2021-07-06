package entidades;

import java.util.ArrayList;

public class CarrinhoDeCompras {
	
	private ArrayList<Pizza> pizzas = new ArrayList<>();
	
	public void adicionaPizza(Pizza pizza) {
		if (!pizza.getIngredientes().isEmpty()) {
			pizzas.add(pizza);
		}
	}
	
	public Double totalCarrinho() {
		Double total = 0.0;
		for (Pizza pizza : pizzas) {
			total += pizza.getPreco();
		}
		return total;
	}
	
	public ArrayList<Pizza> getPizzas() {
		return pizzas;
	}
}
