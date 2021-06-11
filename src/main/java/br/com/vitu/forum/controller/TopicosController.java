package br.com.vitu.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import br.com.vitu.forum.controller.dto.TopicoDto;

@RestController
public class TopicosController {
	
	@RequestMapping("/topicos")
	public List<TopicoDto> lista(){
		Topico topico = new Topico("Duvida", "Duvida com spring", new Curso("Spring", "Programacao"));
		
		return TopicoDto.converter(Arrays.asList(topico, topico));
	}
}
