package br.com.vitu.forum.controller.form;

import java.util.Optional;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.vitu.forum.modelo.Topico;
import br.com.vitu.forum.repository.TopicoRepository;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class AtualizarTopicoForm {
	
	@NotNull @NotEmpty @Length(min = 5)
	private String titulo;
	@NotNull @NotEmpty @Length(min = 10)
	private String mensagem;
	
	
	public Topico atualizar(Long id, TopicoRepository topicoRepository) {
		Optional<Topico> topicoById = topicoRepository.findById(id);
		Topico topico = topicoById.get();
		
		topico.setMensagem(this.mensagem);
		topico.setTitulo(this.titulo);
		
		return topico;		
	}
}
