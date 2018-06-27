package com.qait.snl.snl_api;

public class PlayerExistsException extends Exception {

	public PlayerExistsException(String name) {
		super("Player '" + name + "' already exists on board");
	}

}
