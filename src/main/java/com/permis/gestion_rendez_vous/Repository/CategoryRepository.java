package com.permis.gestion_rendez_vous.Repository;

import com.permis.gestion_rendez_vous.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
