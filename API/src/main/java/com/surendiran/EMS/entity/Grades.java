package com.surendiran.EMS.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "T_GRADES")
public class Grades {

    public Grades() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "S_GRADE_ID")
    private String id;

    @Column(name = "S_POSITION")
    private String position;

    @OneToOne(mappedBy = "grade")
    private Employee employee;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grades grades = (Grades) o;
        return id.equals(grades.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Grades{" +
                "id='" + id + '\'' +
                ", position='" + position + '\'' +
                ", employee=" + employee +
                '}';
    }
}