package com.permis.gestion_rendez_vous.Controller;

import com.permis.gestion_rendez_vous.Dto.AppointmentDto;
import com.permis.gestion_rendez_vous.Service.AppointmentService;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class AppointmentController {

    @Autowired
    AppointmentService appointmentService;

    @PostMapping ("/Appointment")
    String AddAppointment (@RequestBody AppointmentDto appointmentDto){
        appointmentService.add_appointment(appointmentDto);
        return "valeur insérer";
    }
   // fenoy @zay ary le url @ postman, tena tsisy valeur voray ilay izy an
    @GetMapping ("/test")
    ResponseEntity<Object> showAppointent() {
    	
    	Long id=appointmentService.get_appointmen().get(0).getId();
    	
		return ResponseEntity.status(HttpStatus.OK).body(Map.of(
				"key1",
				id,
				"fdd",
				"ee"
				));
    	
    }
    
    
    
}
