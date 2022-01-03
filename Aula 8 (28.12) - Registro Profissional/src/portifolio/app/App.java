package portifolio.app;

import java.util.List;

import portifolio.model.Registro;
import portifolio.util.LeitorRemessas;
import portifolio.util.RegistrosPrint;

public class App {

	public static void main(String[] args) {
		LeitorRemessas leitor = new LeitorRemessas();
		
		String caminho = "C:\\Users\\lbuga\\OneDrive\\Ambiente de Trabalho\\Java\\Teste.csv";
		List<Registro> registros = leitor.converter(caminho);
		
		RegistrosPrint printer = new RegistrosPrint();
		printer.imprimir(registros.get(0));

	}

}