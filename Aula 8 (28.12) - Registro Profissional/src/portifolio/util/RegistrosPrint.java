package portifolio.util;

import portifolio.model.Registro;

public class RegistrosPrint {
	
	public void imprimir(Registro registro) {
		StringBuilder fichaProfissional = new StringBuilder();
		fichaProfissional.append("\n                  FICHA PROFISSIONAL");
		fichaProfissional.append("\n\n PROFISSÃO: " + registro.getProfissao());
		fichaProfissional.append("\n Nome: " + registro.getNomeCompleto());
		fichaProfissional.append("\n Salário Minimo Requerido: Minimo R$ " + registro.getMinimoSalario() + "   Máximo R$ " + registro.getMaximoSalario());
		fichaProfissional.append("\n Data de Nasc: " + registro.getDataNascimento() + " CPF: " + registro.getCpf() + " RG: " + registro.getRg());
		fichaProfissional.append("\n Endereço: " + registro.getLogradouro());
		fichaProfissional.append("\n N°: " + registro.getNumeroCasa() + "    Bairro: " + registro.getBairro() + "    Municipio: " + registro.getCidade() + "    UF: " + registro.getUf());
		fichaProfissional.append("\n Cep: " + registro.getCep() + "    Naturalidade: " + registro.getNaturalidade() + "    País: " + registro.getPais());
		fichaProfissional.append("\n Telefone: " + registro.getTelefone() + "     Celular: " + registro.getCelular());
		fichaProfissional.append("\n Email: " + registro.getEmail());		
		fichaProfissional.append("\n\n ------------------------------------------------------------- \n\n");
		
		System.out.println(fichaProfissional);
	}

}
