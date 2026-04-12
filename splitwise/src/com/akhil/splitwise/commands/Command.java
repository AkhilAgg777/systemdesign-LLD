package com.akhil.splitwise.commands;

public interface Command {
	/**
	 * Returns true if the commandLine input is relevant for current command. Else
	 * return false
	 * 
	 * @param commandLine
	 * @return
	 * 
	 * 
	 */
	boolean parse(String commandLine);

	void execute(String commandLine);
}
