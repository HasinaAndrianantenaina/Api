package com.permis.gestion_rendez_vous.Service.ServiceImpl;

import com.permis.gestion_rendez_vous.Dto.PersonDto;
import com.permis.gestion_rendez_vous.Entity.Person;
import com.permis.gestion_rendez_vous.Repository.PersonRepository;
import com.permis.gestion_rendez_vous.Service.PersonService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
   @Autowired
    PersonRepository personRepository;
    @Override
    public void add_person(PersonDto personDto) {
        Person personEntity = new Person();
        personEntity.setCIN(personDto.getCIN());
        personEntity.setId(personDto.getId());
        personEntity.setAuto_ecole_name(personDto.getAuto_ecole_name());
        personEntity.setDeclaration_perte(personDto.getDeclaration_perte());
        personEntity.setCertificat_medical(personDto.getCertificat_medical());
        personRepository.save(personEntity);
    }
    
    @Override
    public List<Person> get_person(){
    	List<Person> dataPerson=personRepository.findAll();
    	return dataPerson;
    }
}
