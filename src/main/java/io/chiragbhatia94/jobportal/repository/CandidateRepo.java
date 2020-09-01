package io.chiragbhatia94.jobportal.repository;

import io.chiragbhatia94.jobportal.model.Candidate;
import io.swagger.annotations.Api;
import org.springframework.data.jpa.repository.JpaRepository;

@Api(tags = "Candidate Entity")
public interface CandidateRepo extends JpaRepository<Candidate,Long> {
}
