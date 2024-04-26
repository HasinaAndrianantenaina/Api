package com.permis.gestion_rendez_vous.Repository;

import com.permis.gestion_rendez_vous.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
