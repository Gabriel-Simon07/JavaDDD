package br.com.alura.escola.academico.aplicacao.aluno.matricular;

import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.academico.dominio.aluno.AlunoMatriculado;
import br.com.alura.escola.academico.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.shared.dominio.evento.PublicadorEventos;

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
