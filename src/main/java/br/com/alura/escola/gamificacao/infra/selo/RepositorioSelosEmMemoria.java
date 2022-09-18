package br.com.alura.escola.gamificacao.infra.selo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.escola.academico.dominio.aluno.CPF;
import br.com.alura.escola.gamificacao.dominio.selo.RepositorioSelo;
import br.com.alura.escola.gamificacao.dominio.selo.Selo;

public class RepositorioSelosEmMemoria implements RepositorioSelo {

	private List<Selo> selos = new ArrayList<>();
	
	@Override
	public void adicionar(Selo selo) {
		selos.add(selo);
	}

	@Override
	public List<Selo> selosAlunoCpf(CPF cpf) {
		return this.selos.stream().filter(selo -> selo.getCpf().equals(cpf)).collect(Collectors.toList());
	}
}
