package br.com.alura.escola.academico.dominio.aluno;

import java.time.LocalDateTime;
import java.util.Map;

import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.shared.dominio.evento.Evento;
import br.com.alura.escola.shared.dominio.evento.TipoEvento;

public class AlunoMatriculado implements Evento {

	private final CPF cpfAluno;
	private final LocalDateTime momento;
	
	public AlunoMatriculado(CPF cpfAluno) {
		this.cpfAluno = cpfAluno;
		this.momento = LocalDateTime.now();
	}

	@Override
	public LocalDateTime momento() {
		return this.momento;
	}
	
	@Override
	public TipoEvento tipo() {
		return TipoEvento.ALUNO_MATRICULADO;
	}

	@Override
	public Map<String, Object> informacoes() {
		return Map.of("cpf", cpfAluno);
	}
	
	public CPF getCpfAluno() {
		return cpfAluno;
	}
}
