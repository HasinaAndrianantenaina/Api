package com.permis.gestion_rendez_vous.Service.ServiceImpl;

import com.permis.gestion_rendez_vous.Dto.AppointmentDto;
import com.permis.gestion_rendez_vous.Entity.Appointment;
import com.permis.gestion_rendez_vous.Entity.Category;
import com.permis.gestion_rendez_vous.Entity.Permis;
import com.permis.gestion_rendez_vous.Entity.Person;
import com.permis.gestion_rendez_vous.Repository.AppointmentRepository;
import com.permis.gestion_rendez_vous.Repository.CategoryRepository;
import com.permis.gestion_rendez_vous.Repository.PermisRepository;
import com.permis.gestion_rendez_vous.Repository.PersonRepository;
import com.permis.gestion_rendez_vous.Service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentServiceImpl implements AppointmentService {
    @Autowired
    AppointmentRepository appointmentRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    PersonRepository personRepository;

    @Autowired
    PermisRepository permisRepository;

    @Override
    public void add_appointment(AppointmentDto appointmentDto){
        Appointment appointmentEntity = new Appointment();
        Optional<Category> category = categoryRepository.findById(appointmentDto.getCategory());
        Optional<Person> person = personRepository.findById((appointmentDto.getPerson()));
        Optional<Permis> permis = permisRepository.findById((appointmentDto.getPermis()));

        appointmentEntity.setCategory(category.get());
        appointmentEntity.setPerson(person.get());
        appointmentEntity.setPermis(permis.get());
        appointmentEntity.setDate(appointmentDto.getDate());
        appointmentEntity.setTime(appointmentDto.getHeure());
        appointmentRepository.save(appointmentEntity);
        // le manao ajout an ilay izy anaty base de données sao sisahadino ato an
        //aiza no tokony hisy an'izay
        //jerevo tsara aloha le  service impl @ person de appitovina @iny,okok
        //ary ny any @ service, efa mety le ao ka, andraso jereko ary we
        //de ilay controller koa tonga de ataovy avy eo, ok
    }
    
    @Override
    public List<Appointment> get_appointmen() {
    	List<Appointment> app=appointmentRepository.findAll();
    	return app;
    }

	@Override
	public List<Person> get_person() {
		// TODO Auto-generated method stub
		return null;
	}
    
    
}
