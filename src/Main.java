import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import infrastructure.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> eventoSuprimento = new ArrayList<>();
		
		int qtdEventos = sc.nextInt();
		for(int i=0; i<qtdEventos; i++) {
			eventoSuprimento.add(sc.nextInt());
		}
		SuprimentosController controleRecursos = new SuprimentosController(eventoSuprimento);
		System.out.println("Recurso minimo: " + controleRecursos.processarEventos());
	}

}
