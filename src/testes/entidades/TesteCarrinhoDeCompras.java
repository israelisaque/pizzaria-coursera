package testes.entidades;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import entidades.CarrinhoDeCompras;
import entidades.Pizza;

public class TesteCarrinhoDeCompras {

	@Test
	public void adicionaPizza() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("Frango");
		p.adicionaIngrediente("Mussarela");
		
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		c.adicionaPizza(p);
		
		assertEquals(c.getPizzas().contains(p), true);
	}
	
	@Test
	public void totalCarrinho() {
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Frango");
		p1.adicionaIngrediente("Mussarela");

		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("Frango");
		p2.adicionaIngrediente("Mussarela");
		
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		c.adicionaPizza(p1);
		c.adicionaPizza(p2);
		
		assertEquals(c.totalCarrinho(), Double.valueOf(30.0));
	}
}	
