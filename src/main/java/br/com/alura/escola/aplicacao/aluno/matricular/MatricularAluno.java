package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.escola.dominio.PublicadorEventos;
import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.AlunoMatriculado;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {
	
	private final RepositorioDeAlunos repositorio;
	private final PublicadorEventos publicadorEventos;
	
	public MatricularAluno(RepositorioDeAlunos repositorio, PublicadorEventos publicadorEventos) {
		this.repositorio = repositorio;
		this.publicadorEventos = publicadorEventos;
	}
	
	// COMMAND
	public void executa(MatricularAlunoDto dados) {
		Aluno novo = dados.criarAluno();
		repositorio.matricular(novo);
		AlunoMatriculado alunoMatriculado = new AlunoMatriculado(novo.getCpf());
		publicadorEventos.publicar(alunoMatriculado);
	}

}
