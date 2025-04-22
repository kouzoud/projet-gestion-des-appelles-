package org.example.jpaap.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
public class Patiant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String name;
    private int age=22;
    private boolean score;
    @Temporal(TemporalType.DATE)
    private Date dateNessance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isScore() {
        return score;
    }

    public void setScore(boolean score) {
        this.score = score;
    }

    public Date getDateNessance() {
        return dateNessance;
    }

    public void setDateNessance(Date dateNessance) {
        this.dateNessance = dateNessance;
    }

    public Patiant(String name, int age, boolean score, Date dateNessance) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.dateNessance = dateNessance;

    }
    public Patiant() {}
}
