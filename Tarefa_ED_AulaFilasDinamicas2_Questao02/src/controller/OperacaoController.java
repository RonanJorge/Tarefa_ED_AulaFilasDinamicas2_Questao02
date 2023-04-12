package controller;

import br.edu.fateczl.filaobj.Fila;
import model.Cliente;

public class OperacaoController {
	public OperacaoController() {
		// TODO Auto-generated constructor stub
	}
	
	public void caixa(Fila fila) throws Exception {
		for(int i = 0; i < 20; i++) {
			Cliente aux = new Cliente();
			aux = (Cliente) fila.remove();
			float valorTotal = aux.QuantidadePecas * aux.ValorPecas;
			System.out.println("Cliente "+ aux.Nome + " Valor Total " + valorTotal);
		}
	}
}
