package io.chiragbhatia94.jobportal.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "candidate_id", "job_id" }) })
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

    public JobApplication() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public LocalDateTime getAppliedOn() {
        return appliedOn;
    }

    public void setAppliedOn(LocalDateTime appliedOn) {
        this.appliedOn = appliedOn;
    }

    public LocalDateTime getLastEmployerAction() {
        return lastEmployerAction;
    }

    public void setLastEmployerAction(LocalDateTime lastEmployerAction) {
        this.lastEmployerAction = lastEmployerAction;
    }

    public ApplicationStatus getStatus() {
        return status;
    }

    public void setStatus(ApplicationStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobApplication that = (JobApplication) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(candidate, that.candidate) &&
                Objects.equals(job, that.job) &&
                Objects.equals(appliedOn, that.appliedOn) &&
                Objects.equals(lastEmployerAction, that.lastEmployerAction) &&
                status == that.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, candidate, job, appliedOn, lastEmployerAction, status);
    }

    @Override
    public String toString() {
        return "JobApplication{" +
                "id=" + id +
                ", candidate=" + candidate +
                ", job=" + job +
                ", appliedOn=" + appliedOn +
                ", lastEmployerAction=" + lastEmployerAction +
                ", status=" + status +
                '}';
    }
}
