package entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("CUA")
public class CurrentAccount extends BankAccount {
    private double overdraft;
}
