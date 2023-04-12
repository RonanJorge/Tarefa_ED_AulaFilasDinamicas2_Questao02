package view;

import br.edu.fateczl.filaobj.Fila;
import model.Cliente;
import controller.OperacaoController;

public class Principal {
	public static void main(String[] args) throws Exception {
		Fila fila = new Fila();
		for(int i = 0; i < 20; i++) {
			Cliente c = new Cliente();
			c.Nome = "Cliente"+i;
			c.QuantidadePecas = (int)(Math.random()*31 + 20);
			c.ValorPecas = (int)(Math.random()*96 + 5);
			fila.insert(c);
		}
		OperacaoController op = new OperacaoController();
		op.caixa(fila);
	}
}
