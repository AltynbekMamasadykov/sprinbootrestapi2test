package peaksoft.sprinbootrestapi2test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.sprinbootrestapi2test.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
