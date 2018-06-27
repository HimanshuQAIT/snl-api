package com.qait.snl.snl_api;

public class MaxPlayersReachedExeption extends Exception {

	 public MaxPlayersReachedExeption(Integer players){
	        super("The board already has maximum allowed Player: " + players);
	    }
}
