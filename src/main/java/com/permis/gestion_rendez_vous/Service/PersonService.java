package com.permis.gestion_rendez_vous.Service;

import java.util.List;

import com.permis.gestion_rendez_vous.Dto.PersonDto;
import com.permis.gestion_rendez_vous.Entity.Person;

public interface PersonService {
    void add_person(PersonDto personDto);

	List<Person> get_person();
}
