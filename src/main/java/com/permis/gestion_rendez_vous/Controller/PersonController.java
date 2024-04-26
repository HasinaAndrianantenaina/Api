package com.permis.gestion_rendez_vous.Controller;

import com.permis.gestion_rendez_vous.Dto.PersonDto;
import com.permis.gestion_rendez_vous.Service.PersonService;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class PersonController {

    @Autowired
    PersonService personCervice;

//url mila mamorona otran ty ao @ Appointement controller
    //ok andraso ataoko io ary fa io kay hadinoko
    //de mitohy any @ service sy service Impl de repository ilay code soratana fa tsy controller irery
    //ny service sy ny impl zao no nataoko ao de mety ve sa tokony ho ity controller ty no atao voalohany
    //mety fona izay anombohana azy ka, fa ny tsara aloha de atomboka controller, aleo jerevako kely ary le code efa vita
    @PostMapping("/AjouterPersonne")
    String AddPerson (@RequestBody PersonDto personDto){
        //miantso ilay methode hapesaiana anaty interface
        personCervice.add_person(personDto);
        return "";
    }

    @GetMapping("/get_person")
    ResponseEntity<Object> getPerson(){
    	System.out.println();
    	
    	return ResponseEntity.status(HttpStatus.OK).body(Map.of(
    			"category",
    			"valueCatery",
    			"persone",
    			personCervice.get_person()
			));
    }
    
    /* http.post('http://localhost:8080/Appointment',{'nom':'rakoto','prenom':'pp'},(response){
     * console.log(response)
	})*/
}
