package com.surendiran.EMS.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "T_EMPLOYEE")
public class Employee {

    public Employee() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "S_EMPLOYEE_ID")
    private String id;

    @Column(name = "S_FIRST_NAME")
    private String firstName;

    @Column(name = "S_LAST_NAME")
    private String lastName;

    @Column(name = "S_GENDER")
    private Character gender;

    @Column(name = "D_DOB")
    private LocalDate dob;

    @Column(name = "S_RESUME")
    private String resume;

    @Column(name = "D_DOJ")
    private LocalDate doj;

    @Column(name = "S_SUPERVISOR")
    private String supervisor;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "S_GRADE_ID")
    private Grades grade;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public Grades getGrade() {
        return grade;
    }

    public void setGrade(Grades grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id.equals(employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", dob=" + dob +
                ", resume='" + resume + '\'' +
                ", doj=" + doj +
                ", supervisor='" + supervisor + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
