package br.com.alura.escola.gamificacao.dominio.selo;

import br.com.alura.escola.shared.dominio.CPF;

public class Selo {

	private String nome;
	private CPF cpf;

	public Selo(String nome, CPF cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public CPF getCpf() {
		return cpf;
	}
}
