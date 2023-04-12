package model;

public class Cliente extends Object{
	
	public String Nome;
	public int QuantidadePecas;
	public float ValorPecas;
	
	@Override
	public String toString() {
		String ret = Nome + " - " + QuantidadePecas + " - " + ValorPecas;
		return ret;
	}
}
