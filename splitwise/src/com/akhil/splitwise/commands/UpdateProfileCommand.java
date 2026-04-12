package com.akhil.splitwise.commands;

import java.util.Arrays;
import java.util.List;

import com.akhil.splitwise.controllers.UserController;

import dtos.UpdateProfileRequestDto;

@Service
public class UpdateProfileCommand implements Command {

	private UserController userController;

	@Autowired
	public UpdateProfileCommand(UserController userController) {
		this.userController = userController;
	}

	@Override
	public boolean parse(String commandLine) {
		// TODO Auto-generated method stub
		List<String> commandTokens=Arrays.stream(commandLine.split(regex:" ")).toList();
		if(commandTokens.size()!=3) {
			System.out.println("This is not a UpdateProfile command");
			return false;
		}
		
		if(!commandTokens.get(1).equalsIgnoreCase(CommandKeywords.UPDATE_PROFILE_COMMAND)) {
			System.out.println("This is not a UpdateProfile command");
			return false;
		}
		System.out.println("This is a UpdateProfile command");
		return true;
	}

	@Override
	public void execute(String commandLine) {
		List<String> commandTokens=Arrays.stream(commandLine.split(regex:" ")).toList();
		Long userId=Long.parseLong(commandTokens.get(0));
		String newPassword=commandTokens.get(2);
		
		UpdateProfileRequestDto request=new UpdateProfileRequestDto();
		request.setNewPassword(newPassword);
		request.setUserId(userId);
		UpdateProfileResponseDto response=userController.updateProfile(request);
		System.out.println(response.getUser());

	}

}
