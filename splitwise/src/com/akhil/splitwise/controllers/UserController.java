package com.akhil.splitwise.controllers;

import com.akhil.splitwise.models.User;
import com.akhil.splitwise.services.user.UserService;

import dtos.RegisterUserRequestDto;
import dtos.RegisterUserResponseDto;
import dtos.UpdateProfileRequestDto;
import dtos.UpdateProfileResponseDto;

@Controller
public class UserController {
	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	public RegisterUserResponseDto RegisterUser(RegisterUserRequestDto request) {
		User user = userService.registerUser(request.getPhoneNumber(), request.getPassword(), request.getPassword());
		RegisterUserResponseDto registerUserResponseDto = new RegisterUserResponseDto();
		registerUserResponseDto.setUser(user);
		return registerUserResponseDto;
	}

	public UpdateProfileResponseDto updateProfile(UpdateProfileRequestDto request) {
		User user = userService.updateProfile(request.getUserId(), request.getNewPassword());
		UpdateProfileResponseDto response = new UpdateProfileResponseDto();
		response.setUser(user);
		return response;
	}
}
