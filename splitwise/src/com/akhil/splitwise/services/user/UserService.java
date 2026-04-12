package com.akhil.splitwise.services.user;

import com.akhil.splitwise.models.User;
import com.akhil.splitwise.repositories.UserRepository;

@Service
public class UserService {
	private UserRepository userRepository;

	@Autowired
	UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User registerUser(String phoneNumber, String password, String username) {
		User user = new User();
		user.setUsername(username);
		user.setPhoneNumber(phoneNumber);
		user.setHashedPassword(password);

		User user1 = userRepository.save(user);
		return user1;
	}

	public User updateProfile(Long userId, String newPassword) {
		User user = userRepository.findUserById(userId);
		user.setHashedPassword(newPassword);
		User savedUser = userRepository.save(user);
		return savedUser;
	}
}
