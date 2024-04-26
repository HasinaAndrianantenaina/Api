package com.permis.gestion_rendez_vous.Repository;

import com.permis.gestion_rendez_vous.Entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
