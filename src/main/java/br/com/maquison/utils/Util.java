package br.com.maquison.utils;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public interface Util {
	
	static Calendar getNascimento(String data) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
		try {
			cal.setTime(sdf.parse(data));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return cal;
	}
	
	static String formatDate(Date date) {
		Format formatter = new SimpleDateFormat("dd/MM/yyyy");
		String dateFormated = formatter.format(date);
		return dateFormated;
	}
}
