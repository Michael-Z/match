package com.roy.football.match.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MatchUtil {
	public final static String simple_date_format = "yyMMdd";

	public static String getMatchDay () {
		DateFormat df = new SimpleDateFormat(simple_date_format);
		
		return df.format(new Date());
	}
	
	public static Date parseFromOFHString (String dtStr) {
		if (dtStr == null || dtStr.isEmpty()) {
			return null;
		}
		return new Date(Long.parseLong(dtStr)*1000);
	}
}
