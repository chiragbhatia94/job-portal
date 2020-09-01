package io.chiragbhatia94.jobportal.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"candidate_id", "job_id"})})
@Data
public class JobApplication {
    private @Id
    @GeneratedValue
    Long id;

    @ManyToOne
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;

    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;

    @CreationTimestamp
    private LocalDateTime appliedOn;

    @UpdateTimestamp
    private LocalDateTime lastEmployerAction;

    private ApplicationStatus status;
}
