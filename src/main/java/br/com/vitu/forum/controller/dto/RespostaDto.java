package br.com.vitu.forum.controller.dto;

import java.time.LocalDateTime;

import br.com.vitu.forum.modelo.Topico;
import lombok.Getter;

@Getter
public class RespostaDto {
	
	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
	private String nomeAutor;

	public RespostaDto(Topico topico) {
		this.id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();
		this.dataCriacao = topico.getDataCriacao();
		this.nomeAutor = topico.getAutor().getNome();
	}
}
