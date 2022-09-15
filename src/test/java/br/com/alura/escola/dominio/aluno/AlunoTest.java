package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlunoTest {
	
	Aluno aluno;
	
	@BeforeEach
	void beforeEach() {
		this.aluno = new Aluno(
				new CPF("222.222.222-22"), 
				"Gabriel", 
				new Email("teste@gmail.com"));
	}
	
	@Test
	void naoDeveCadastrar3Telefones() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.aluno.adicionarTelefone("33", "333333333");
			this.aluno.adicionarTelefone("33", "333333333");
			this.aluno.adicionarTelefone("33", "333333333");
		});
	}
}
