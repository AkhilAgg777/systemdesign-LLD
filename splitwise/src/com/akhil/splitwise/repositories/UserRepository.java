package com.akhil.splitwise.repositories;

import java.util.List;

import com.akhil.splitwise.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
//	List<User> findUsersByUsernameContainingAndPhoneNumberIs(String usernameContains, String phoneNumber);

	/**
	 * If user has an id that is already there in db,update that user with new value
	 * Else it will create a new user
	 * 
	 * @param user
	 * @return
	 */
	User save(User user);

	User findUserById(Long id);
}

//find users whose username starts with u
