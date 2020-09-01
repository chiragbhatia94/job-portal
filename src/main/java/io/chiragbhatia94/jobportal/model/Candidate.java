package io.chiragbhatia94.jobportal.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Candidate {
    private @Id
    @GeneratedValue
    Long id;
    private String name;
    private String email;
    private Float gpa;
}
