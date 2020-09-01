package io.chiragbhatia94.jobportal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class User {
    private @Id
    @GeneratedValue
    Long id;
    private String name;
    @JsonIgnore
    private String password;
    @Column(columnDefinition = "varchar(32) default 'USER'")
    private Float gpa;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
