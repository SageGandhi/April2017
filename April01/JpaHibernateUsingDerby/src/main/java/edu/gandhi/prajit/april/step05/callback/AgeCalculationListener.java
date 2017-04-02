package edu.gandhi.prajit.april.step05.callback;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;

public class AgeCalculationListener {
	@PostLoad
	@PostPersist
	@PostUpdate
	/**Signature Changed When It Was Inside Entity*/
	private void SetAgeFromBirthDay(Author author) {
		if (author.getDateOfBirth()== null) {
			author.setAge(null);
			return;
		}
		Calendar birth = new GregorianCalendar();
		birth.setTime(author.getDateOfBirth());
		Calendar now = new GregorianCalendar();
		now.setTime(new Date());
		author.setAge(now.get(Calendar.YEAR) - birth.get(Calendar.YEAR)
				+ ((now.get(Calendar.DAY_OF_YEAR) - birth.get(Calendar.DAY_OF_YEAR) < 0) ? -1 : 0));
	}
}