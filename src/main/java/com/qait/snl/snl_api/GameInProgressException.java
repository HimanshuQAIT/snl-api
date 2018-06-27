package com.qait.snl.snl_api;



public class GameInProgressException extends Exception {

	public GameInProgressException(){
        super("New player cannot join since the game has started");
    }
}
