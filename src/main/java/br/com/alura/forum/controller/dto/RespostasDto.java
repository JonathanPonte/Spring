package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;

import br.com.alura.forum.modelo.Resposta;

public class RespostasDto {

	private long id;
	private String mensagem;
	private LocalDateTime dataCriação;
	private String nomeAutor;
	
	public RespostasDto(Resposta resposta) {
		this.id = resposta.getId();
		this.mensagem = resposta.getMensagem();
		this.dataCriação = resposta.getDataCriacao();
		this.nomeAutor = resposta.getAutor().getNome();
	}

	public long getId() {
		return id;
	}

	public String getMensagem() {
		return mensagem;
	}

	public LocalDateTime getDataCriação() {
		return dataCriação;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}
	
	
	
	
	
	
}
