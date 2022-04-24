package com.sam.webtasks.client;

import java.util.ArrayList;

import com.google.gwt.user.client.Random;

public class ConfirmationCode {
	public static String Get() {
		ArrayList<String> codes = new ArrayList<String>();
		
		codes.add("PMRA");
		codes.add("PMDB");
		codes.add("PMLC");
		codes.add("PMGD");
		codes.add("PMAE");
		codes.add("PMAF");
		codes.add("PMZG");
		codes.add("PMQH");
		codes.add("PMBJ");
		codes.add("PMYK");
		
		return(codes.get(Random.nextInt(codes.size())));
	}
}
