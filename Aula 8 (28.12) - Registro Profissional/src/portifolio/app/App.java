package portifolio.app;

import java.util.List;

import portifolio.model.Registro;
import portifolio.util.LeitorRemessas;

public class App {

	public static void main(String[] args) {
		LeitorRemessas leitor = new LeitorRemessas();
		
		String caminho = "C:\\Users\\lbuga\\OneDrive\\Ambiente de Trabalho\\Java\\Teste.csv";
		List<Registro> registros = leitor.converter(caminho);

		System.out.println(registros); 
	}

}
