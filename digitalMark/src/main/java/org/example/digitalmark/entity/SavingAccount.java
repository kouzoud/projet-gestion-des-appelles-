package entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("SAC")
public class SavingAccount extends BankAccount {
    private double interestRate;
}
