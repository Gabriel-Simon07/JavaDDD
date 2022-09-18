package br.com.alura.escola.gamificacao.dominio.selo;

import java.util.List;

import br.com.alura.escola.academico.dominio.aluno.CPF;

public interface RepositorioSelo {

	void adicionar(Selo selo);
	List<Selo> selosAlunoCpf(CPF cpf);
}
