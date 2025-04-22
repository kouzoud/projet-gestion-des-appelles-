package repository;

import entity.Customer;
import entity.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface OperationRepo extends JpaRepository<Customer, Long> {
}

