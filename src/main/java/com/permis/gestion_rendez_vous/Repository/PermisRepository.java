package com.permis.gestion_rendez_vous.Repository;

import com.permis.gestion_rendez_vous.Entity.Permis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermisRepository extends JpaRepository<Permis, Long> {
}
