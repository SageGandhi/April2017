package edu.gandhi.prajit.april.appmain;

import java.text.MessageFormat;
import java.util.Date;

import org.hibernate.Session;

import edu.gandhi.prajit.april.chapter01.entity.Ver00.TimeTestVersion01;
import edu.gandhi.prajit.april.chapter01.entity.Ver00.TimeTestVersion02;
import edu.gandhi.prajit.april.chapter01.util.HibernateUtilForXml;

/** Learn About NamingStrategy */
public class TemporalTypeMainClass00 {
	public static void main(String[] args) {
		/** We Have Configured hibernate.cfg.xml File In ClassPath. */
		final Session session = HibernateUtilForXml.getSessionFactory().openSession();
		final Date nowDate = new Date();
		session.getTransaction().begin();
		final TimeTestVersion01 timeTest01 = new TimeTestVersion01(nowDate);
		session.save(timeTest01);
		session.getTransaction().commit();

		session.refresh(timeTest01);
		System.out.println(MessageFormat.format("TemporalTypes:{0}", timeTest01));
		/**
		 * TemporalTypes:TimeTest [timeTestId=3, datetimeColumn=2017-04-03
		 * 21:38:35.0, timestampColumn=2017-04-03 21:38:35.0,
		 * dateColumn=2017-04-03 00:00:00.0, timeColumn=1970-01-01 21:38:35.0,
		 * sqlDatetimeColumn=2017-04-03 21:38:35.0,
		 * sqlTimestampColumn=2017-04-03 21:38:35.0, sqlDateColumn=2017-04-03,
		 * sqlTimeColumn=21:38:34]
		 */
		session.getTransaction().begin();
		final TimeTestVersion02 timeTest02 = new TimeTestVersion02(nowDate);
		session.save(timeTest02);
		session.getTransaction().commit();

		session.refresh(timeTest02);
		System.out.println(MessageFormat.format("TemporalTypes:{0}", timeTest02));
		/**
		 * TemporalTypes:TimeTest [timeTestId=4, datetimeColumn=2017-04-03
		 * 21:38:35.0, timestampColumn=2017-04-03 21:38:35.0,
		 * dateColumn=2017-04-03, timeColumn=21:38:34,
		 * sqlDatetimeColumn=2017-04-03 21:38:35.0,
		 * sqlTimestampColumn=2017-04-03 21:38:35.0, sqlDateColumn=2017-04-03,
		 * sqlTimeColumn=21:38:34]
		 */

		session.close();
		HibernateUtilForXml.getSessionFactory().close();
	}
}