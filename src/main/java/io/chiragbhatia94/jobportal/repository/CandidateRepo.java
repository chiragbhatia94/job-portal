package io.chiragbhatia94.jobportal.repository;

import io.chiragbhatia94.jobportal.model.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepo extends JpaRepository<Candidate,Long> {
}
