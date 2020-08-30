package io.chiragbhatia94.jobportal.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
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

    public Job() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getPostedOn() {
        return postedOn;
    }

    public void setPostedOn(LocalDateTime postedOn) {
        this.postedOn = postedOn;
    }

    public LocalDateTime getUpdateOn() {
        return updateOn;
    }

    public void setUpdateOn(LocalDateTime updateOn) {
        this.updateOn = updateOn;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public Long getApplicationCount() {
        return applicationCount;
    }

    public void setApplicationCount(Long applicationCount) {
        this.applicationCount = applicationCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return isOpen == job.isOpen &&
                Objects.equals(id, job.id) &&
                Objects.equals(title, job.title) &&
                jobType == job.jobType &&
                Objects.equals(description, job.description) &&
                Objects.equals(postedOn, job.postedOn) &&
                Objects.equals(updateOn, job.updateOn) &&
                Objects.equals(applicationCount, job.applicationCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, jobType, description, postedOn, updateOn, isOpen, applicationCount);
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", jobType=" + jobType +
                ", description='" + description + '\'' +
                ", postedOn=" + postedOn +
                ", updateOn=" + updateOn +
                ", isOpen=" + isOpen +
                ", applicationCount=" + applicationCount +
                '}';
    }
}
