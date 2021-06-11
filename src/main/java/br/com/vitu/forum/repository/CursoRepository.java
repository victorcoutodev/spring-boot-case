package br.com.vitu.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vitu.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

	Curso findByNome(String nome);

}
