package io.chiragbhatia94.jobportal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Candidate {
    private @Id
    @GeneratedValue
    Long id;
    private String name;
    private String email;
    private Float gpa;

    public Candidate() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getGpa() {
        return gpa;
    }

    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidate candidate = (Candidate) o;
        return Objects.equals(id, candidate.id) &&
                Objects.equals(name, candidate.name) &&
                Objects.equals(email, candidate.email) &&
                Objects.equals(gpa, candidate.gpa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, gpa);
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
