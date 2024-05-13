package br.com.rhuanjava.repository;

import br.com.rhuanjava.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {}