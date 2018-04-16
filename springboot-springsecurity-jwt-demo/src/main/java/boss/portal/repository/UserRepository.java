package boss.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import boss.portal.entity.User;

/**
 * @author lb_chen
 */
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);

}
