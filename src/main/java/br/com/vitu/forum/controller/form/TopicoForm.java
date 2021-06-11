package br.com.vitu.forum.controller.form;

import br.com.vitu.forum.modelo.Curso;
import br.com.vitu.forum.modelo.Topico;
import br.com.vitu.forum.repository.CursoRepository;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TopicoForm {
	
	private String titulo;
	private String mensagem;
	private String nomeCurso;
	
	
	public Topico converter(CursoRepository cursoRepository) {
		Curso curso = cursoRepository.findByNome(nomeCurso);
		return new Topico(titulo, mensagem, curso);
	}

}
