package com.akhil.splitwise.commands.registry;

import com.akhil.splitwise.commands.Command;

public interface CommandRegistry {
	void registerCommand(Command command);

	Command getCommand(String commandLine);

	void removeCommand(Command command);

	boolean executeCommandLine(String commandLine);

	String suggestCommandBasedOnPrefix(String commandPrefix);
}
