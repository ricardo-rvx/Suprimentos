package infrastructure;

import java.util.List;

public class SuprimentosController{
	
	private final List<Integer> eventos;
	
	public SuprimentosController(List<Integer> eventos) {
		this.eventos = eventos;
	}
	
	public int processarEventos() {
		
		int saldoAtual=0;
		int menorValor=0;
		
		for(Integer i : eventos) {
			saldoAtual+=i;
			
			if(saldoAtual<menorValor) {
				menorValor=saldoAtual;
			}
		}
		return menorValor * -1;
	}
}
