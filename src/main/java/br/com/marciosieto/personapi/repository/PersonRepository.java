package br.com.marciosieto.personapi.repository;

import br.com.marciosieto.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}