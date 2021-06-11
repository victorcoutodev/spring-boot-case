package br.com.vitu.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.modelo.Topico;
import lombok.Getter;

@Getter
public class TopicoDto {
	
	private Long id;
	private String mensagem;
	private String titulo;
	private LocalDateTime dataCriacao;
	
	public TopicoDto(Topico topico) {
		this.id = topico.getId();
		this.mensagem = topico.getMensagem();
		this.titulo = topico.getTitulo();
		this.dataCriacao = topico.getDataCriacao();
	}

	public static List<TopicoDto> converter(List<Topico> topicos) {
		return topicos.stream().map(TopicoDto::new).collect(Collectors.toList());
	}
}
