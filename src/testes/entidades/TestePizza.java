package testes.entidades;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import entidades.Pizza;

public class TestePizza {
	
	@Test
	public void adicionaIngrediente() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("Frango");
				
		assertEquals("Frango", p.getIngredientes().get(0));
	}
	
	@Test
	public void getPreco() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("Frango");
		p.adicionaIngrediente("Catupiry");
		p.adicionaIngrediente("Queijo");
		
		assertEquals(p.getPreco(), Double.valueOf(20.0));
	}
	
	@Test
	public void contabilizaIngrediente() {
		Pizza p = new Pizza();
		
		p.adicionaIngrediente("Mussarela");
		p.adicionaIngrediente("Mussarela");
		
		assertEquals(Pizza.ingredientesTotal.get("Mussarela"), Integer.valueOf(2));
	}
}
