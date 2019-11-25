package com.buratti;

import java.util.UUID;
import java.io.Serializable;    

public class Soul implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private UUID uuid;
	
	public Soul() {
		uuid = UUID.randomUUID();		
	}

	@Override
	public String toString() {
		return uuid.toString();
	}	
}


