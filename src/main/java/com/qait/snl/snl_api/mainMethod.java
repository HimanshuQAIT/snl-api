package com.qait.snl.snl_api;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.UUID;

import org.json.JSONArray;
import org.json.JSONObject;

public class mainMethod {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException, PlayerExistsException, GameInProgressException, MaxPlayersReachedExeption, InvalidTurnException {
		Board board = new Board();
		JSONArray player1 = board.registerPlayer("Kishor");
		System.out.println(player1.get(0).toString());
		
		JSONArray player2 = board.registerPlayer("Arijit");
		System.out.println(player2.get(1).toString());
		
		JSONArray player3 = board.registerPlayer("Alka");
		System.out.println(player3.get(2).toString());
		
		JSONArray player4 = board.registerPlayer("Atif");
		System.out.println(player4.get(3).toString());
		
		
		JSONObject jsonObj = new JSONObject(player1.get(0).toString());
        String name = jsonObj.getString("name");
        System.out.println("Name of Player:: "+name);
        
        String uuid = jsonObj.getString("uuid");
        System.out.println("Uuid of Player:: "+uuid);

//----------------------------------------------------------------------------------
        UUID myUuid =UUID.fromString(uuid);
        //UUID myUuid =uuid;
        JSONObject rollJSONObject= board.rollDice(myUuid);
        System.out.println(rollJSONObject.get("message"));

	}


}
