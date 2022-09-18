package br.com.alura.escola.gamificacao.aplicacao;

import br.com.alura.escola.gamificacao.dominio.selo.RepositorioSelo;
import br.com.alura.escola.gamificacao.dominio.selo.Selo;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.shared.dominio.evento.Evento;
import br.com.alura.escola.shared.dominio.evento.Ouvinte;
import br.com.alura.escola.shared.dominio.evento.TipoEvento;

public class GeraSeloAlunoNovato extends Ouvinte {

	private final RepositorioSelo repositorioSelo;
	
	public GeraSeloAlunoNovato(RepositorioSelo repositorioSelo) {
		this.repositorioSelo = repositorioSelo;
	}

	@Override
	protected void reageAo(Evento evento) {
		CPF cpfAlunoNovato = (CPF) evento.informacoes().get("cpf");
		Selo selo = new Selo("Novato", cpfAlunoNovato);
		repositorioSelo.adicionar(selo);
	}

	@Override
	protected boolean deveProcessar(Evento evento) {
		return evento.tipo().equals(TipoEvento.ALUNO_MATRICULADO);
	}

}
