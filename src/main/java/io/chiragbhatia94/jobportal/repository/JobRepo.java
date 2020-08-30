package io.chiragbhatia94.jobportal.repository;

import io.chiragbhatia94.jobportal.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepo extends JpaRepository<Job, Long> {
}
