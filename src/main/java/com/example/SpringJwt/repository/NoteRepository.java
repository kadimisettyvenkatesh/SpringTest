package com.example.SpringJwt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.SpringJwt.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
	
	@Query(
			  value = "SELECT * FROM notes where notes.content=:content \n-- #pageable\n",
			  countQuery = "SELECT count(*) FROM notes",
			  nativeQuery = true)
	public List<Note> findByContent(@Param("content") String content);

}
