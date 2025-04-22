package org.example.jpaap.repository;

import org.example.jpaap.entity.Patiant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.function.Consumer;

public interface PatiantRepository extends JpaRepository<Patiant, Long> {
     List<Patiant> findByScore(boolean score);
     Page<Patiant> findByScore( boolean score ,Pageable pageable);
     @Query("SELECT p FROM Patiant p WHERE p.age between :x1 and :x2")
     List<Patiant> chercher(@Param("x1") int age1, @Param("x2")int age2);
}
