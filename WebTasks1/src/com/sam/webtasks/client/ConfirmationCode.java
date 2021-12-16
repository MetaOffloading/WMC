package com.sam.webtasks.client;

import java.util.ArrayList;

import com.google.gwt.user.client.Random;

public class ConfirmationCode {
	public static String Get() {
		ArrayList<String> codes = new ArrayList<String>();
		
		codes.add("PMRUWPOKKX");
		codes.add("PMDNJNKDLQ");
		codes.add("PMLWIIJMJU");
		codes.add("PMGCWWOCZZ");
		codes.add("PMAULUWYWF");
		codes.add("PMAUPXARJP");
		codes.add("PMZWJXRDEF");
		codes.add("PMQTPVOEQL");
		codes.add("PMBRRQIGIQ");
		codes.add("PMYOXXTLRS");
		
		return(codes.get(Random.nextInt(codes.size())));
	}
}
