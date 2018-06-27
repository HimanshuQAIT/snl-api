package com.qait.snl.snl_api;

public class NoUserWithSuchUUIDException extends Exception {
	
	public NoUserWithSuchUUIDException(String uuid){
        super("No Player with uuid '"+uuid+"' on board");
    }

}
