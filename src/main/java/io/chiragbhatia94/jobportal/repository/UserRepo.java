package io.chiragbhatia94.jobportal.repository;

import io.chiragbhatia94.jobportal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
