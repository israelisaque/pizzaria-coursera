package aplicacao;

import entidades.CarrinhoDeCompras;
import entidades.Pizza;

public class Principal {

	public static void main(String[] args) {
		
		Pizza pizza1 = new Pizza();
		pizza1.adicionaIngrediente("Catupiry");
		pizza1.adicionaIngrediente("Frango");
		pizza1.adicionaIngrediente("Marguerita");		
		pizza1.adicionaIngrediente("Pimentão");		
		pizza1.adicionaIngrediente("Salsa");				
		
		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngrediente("Frango");
		pizza2.adicionaIngrediente("Tomate");
		pizza2.adicionaIngrediente("Alho");
		pizza2.adicionaIngrediente("Cebolinha");
		
		Pizza pizza3 = new Pizza();
		pizza3.adicionaIngrediente("Frango");
		pizza3.adicionaIngrediente("Manjericão");
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaPizza(pizza1);
		carrinho.adicionaPizza(pizza2);
		carrinho.adicionaPizza(pizza3);
		
		System.out.printf("O total do carrinho é: R$%.2f\n\n", carrinho.totalCarrinho());
		
		System.out.println("Quantidade utilizada de ingredientes: ");
		Pizza.ingredientesTotal.entrySet().forEach(ingrediente -> {
			System.out.println(ingrediente.getKey() + " - " + ingrediente.getValue());
		});
				
	}
}
