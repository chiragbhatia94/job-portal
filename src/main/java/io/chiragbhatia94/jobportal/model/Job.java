package io.chiragbhatia94.jobportal.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
public class Job {
    private @Id
    @GeneratedValue
    Long id;
    private String title;
    private JobType jobType;
    private String description;

    @CreationTimestamp
    private LocalDateTime postedOn;

    @UpdateTimestamp
    private LocalDateTime updateOn;

    @Column(columnDefinition = "boolean default true")
    private boolean isOpen;

    private Long applicationCount;
}
