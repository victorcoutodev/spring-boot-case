package br.com.vitu.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vitu.forum.controller.dto.TopicoDto;
import br.com.vitu.forum.modelo.Curso;
import br.com.vitu.forum.modelo.Topico;

@RestController
public class TopicosController {
	
	@RequestMapping("/topicos")
	public List<TopicoDto> lista(){
		Topico topico = new Topico("Duvida", "Duvida com spring", new Curso("Spring", "Programacao"));
		
		return TopicoDto.converter(Arrays.asList(topico, topico));
	}
}
