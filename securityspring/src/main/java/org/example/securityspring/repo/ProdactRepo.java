package org.example.securityspring.repo;

import org.example.securityspring.model.Prodact;
import org.example.securityspring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdactRepo extends JpaRepository<Prodact, Long> {

}
