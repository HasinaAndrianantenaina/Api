package com.permis.gestion_rendez_vous.Service;

import java.util.List;

import com.permis.gestion_rendez_vous.Dto.AppointmentDto;
import com.permis.gestion_rendez_vous.Entity.Appointment;
import com.permis.gestion_rendez_vous.Entity.Person;

public interface AppointmentService  {
    void add_appointment(AppointmentDto appointmentDto);

	List<Appointment> get_appointmen();

	List<Person> get_person();
}
