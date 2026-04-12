package com.akhil.splitwise.repositories;

import java.util.List;
import java.util.Optional;

import com.akhil.splitwise.models.Group;
import com.akhil.splitwise.models.User;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {
	Optional<Group> findById(Long id);
	// Optional<Group>

	List<Group> findAllByParticipantsContaining(List<User> users);
	// Select * from groups
	// where participants in ()
}
