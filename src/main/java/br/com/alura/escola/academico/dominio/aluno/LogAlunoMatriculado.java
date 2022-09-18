package br.com.alura.escola.academico.dominio.aluno;

import java.time.format.DateTimeFormatter;

import br.com.alura.escola.academico.dominio.Evento;
import br.com.alura.escola.academico.dominio.Ouvinte;

public class LogAlunoMatriculado extends Ouvinte {

	public void reageAo(Evento evento) {
		String dataFormatada = evento.momento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm"));
		System.out.println(String.format("Aluno com CPF %s matrículao em: s%", 
				((AlunoMatriculado) evento).getCpfAluno().getNumero(), 
				dataFormatada));
	}

	@Override
	protected boolean deveProcessar(Evento evento) {
		return evento instanceof AlunoMatriculado;
	}
}
