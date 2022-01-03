package portifolio.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import portifolio.model.Estado;
import portifolio.model.Registro;

public class LeitorRemessas {
	
	private List<String> ler(String caminhoArquivo) {
		try {
			List<String> registros = Files.readAllLines(Paths.get(caminhoArquivo), StandardCharsets.UTF_8);
			return registros;
		}catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
    public List<Registro> converter (String caminhoArquivo) {
    	List<String> conteudos = ler(caminhoArquivo);
    	List<Registro> registros = new ArrayList<Registro>();
    	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		for(String linha:conteudos){
			String [] campos = linha.split(";");
				Registro t = new Registro();
				t.setProfissao(campos[0]);
				t.setNomeCompleto(campos[1]);
				t.setMinimoSalario(Double.valueOf(campos[2]));
				t.setMaximoSalario(Double.valueOf(campos[3]));				
				LocalDate dataFormatada = LocalDate.parse(campos[4], formato);
				t.setDataNascimento(dataFormatada);
				t.setCpf(campos[5]);
				t.setRg(campos[6]);
				t.setLogradouro(campos[7]);
				t.setNumeroCasa(Integer.parseInt(campos[8]));
				t.setBairro(campos[9]);
				t.setCidade(campos[10]);
				t.setUf(Estado.valueOf(campos[11].toUpperCase()));
				t.setCep(campos[12]);
				t.setTelefone(campos[13]);
				t.setCelular(campos[14]);
				t.setNaturalidade(campos[15]);
				t.setPais(campos[16]);
				t.setEmail(campos[17]);

			registros.add(t);
		}
		return registros;
}

}