package com.qa.qacommunity;
import java.util.ArrayList;
import java.util.List;

public class Arrays_List {
	

	    public static void main(String[] args){
	        List<String> chelseaPlayers = new ArrayList<>();
	        
	        chelseaPlayers.add("Werner");
		    chelseaPlayers.add("Mount");
		    chelseaPlayers.add("Kante");
		    chelseaPlayers.add("Mendy");
		    chelseaPlayers.add("Silva");
		    chelseaPlayers.add("Havertz");

		    System.out.println(chelseaPlayers);
		    
		    System.out.println(chelseaPlayers.get(0));
		    System.out.println(chelseaPlayers.get(1));
	        
	    }
	    
	   
	
}