package co.simplon.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DecouverteDates {

	public DecouverteDates() {
		super();
	}

	public boolean estInferieurDateCourante(Date date) throws ParseException {
		return date.before(new Date());
	}

	public Date construireDate(String chaineFournie) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.parse(chaineFournie);
	}

	public Date augmenterDate(Date dateInitiale, int nombreJours,
			int nombreHeures, int nombreMinutes) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateInitiale);
		cal.add(Calendar.DATE, nombreJours);
		cal.add(Calendar.HOUR_OF_DAY, nombreHeures);
		cal.add(Calendar.MINUTE, nombreMinutes);
		
		return cal.getTime();
	}

	public String formaterUneDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy");
		return sdf.format(date);
	}

	public String formaterUneHeure(Date time) {
		SimpleDateFormat sdf = new SimpleDateFormat("HH'h'mm'min'ss'sec'");
		return sdf.format(time);
	}
	
	public String formaterDateEnFrancais(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE dd MMMM yyyy");
		return sdf.format(date);
	}
}
