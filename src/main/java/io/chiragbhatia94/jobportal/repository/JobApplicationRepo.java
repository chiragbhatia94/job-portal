package io.chiragbhatia94.jobportal.repository;

import io.chiragbhatia94.jobportal.model.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobApplicationRepo extends JpaRepository<JobApplication, Long> {
}
