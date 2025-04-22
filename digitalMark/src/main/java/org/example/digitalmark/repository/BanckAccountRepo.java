package repository;

import entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BanckAccountRepo  extends JpaRepository<BankAccount,String> {
}
