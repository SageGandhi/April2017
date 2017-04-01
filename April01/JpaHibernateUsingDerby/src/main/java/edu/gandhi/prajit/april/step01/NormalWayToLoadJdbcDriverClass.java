package edu.gandhi.prajit.april.step01;

import java.text.MessageFormat;
/**
 * This Class Declares All Frequent DatabaseType With Fully Qualified Driver Name Along With Url Pattern
 * @author SageGandhi
 *
 */
public class NormalWayToLoadJdbcDriverClass {
	/**
	 * MySQL com.mysql.jdbc.Driver jdbc:mysql://<server>:<port>/<databaseName>
	 * jdbc:mysql://localhost:3306/MySqlDbName
	 */

	/**
	 * Oracle oracle.jdbc.driver.OracleDriver
	 * jdbc:oracle:thin:@<server>:<port>:<databaseName>
	 * jdbc:oracle:thin:@localhost:1521:xe
	 */
	/**
	 * IBM DB2 App com.ibm.db2.jdbc.app.DB2Driver jdbc:db2:<databaseName>
	 * jdbc:db2:IbmDb2AppDbName
	 */
	/**
	 * IBM DB2 Net com.ibm.db2.jdbc.net.DB2Driver
	 * jdbc:db2//<server>:<port>/<databasebName>
	 * jdbc:db2://localhost:6789/IbmDb2NetDbName
	 */
	/**
	 * Sybase com.sybase.jdbc.SybDriver
	 * jdbc:sybase:Tds:<server>:<port>/<databaseName>
	 * jdbc:sybase:Tds:localhost:4100/SybaseDbName
	 */
	/**
	 * Teradata com.teradata.jdbc.TeraDriver
	 * jdbc:teradata://<server>/database=<databaseName>,tmode=ANSI,charset=UTF8
	 * jdbc:teradata://localhost/database=TeradataDbName,tmode=ANSI,charset=UTF8
	 */
	/**
	 * Microsoft SQL Server com.microsoft.sqlserver.jdbc.SQLServerDriver
	 * jdbc:sqlserver://<server>:<port>/databaseName=<databaseName>
	 * jdbc:sqlserver://localhost:1433;databaseName=MsSqlServerDbName
	 */
	/**
	 * Postgre org.postgresql.Driver
	 * jdbc:postgresql://<server>:<port>/<databaseName>
	 * jdbc:postgresql://localhost:5432/PostgreDbName
	 */
	/**
	 * MS Access (JDBC-ODBC Bridge) sun.jdbc.odbc.JdbcOdbcDriver
	 * jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=<MdbFileName.mdb>;
	 * jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=MdbFileName.mdb;
	 */

	public static enum JdbcDrivers {
		MySQL("MySQL", "com.mysql.jdbc.Driver", "jdbc:mysql://<server>:<port>/<databaseName>","jdbc:mysql://localhost:3306/MySqlDbName"), 
		Oracle("Oracle", "oracle.jdbc.driver.OracleDriver","jdbc:oracle:thin:@<server>:<port>:<databaseName>","jdbc:oracle:thin:@localhost:1521:xe"), 
		IBMDB2App("IBM DB2 App","com.ibm.db2.jdbc.app.DB2Driver", "jdbc:db2:<databaseName>","jdbc:db2:IbmDb2AppDbName"), 
		IBMDB2Net("IBM DB2 Net", "com.ibm.db2.jdbc.net.DB2Driver","jdbc:db2//<server>:<port>/<databasebName>","jdbc:db2://localhost:6789/IbmDb2NetDbName"), 
		Sybase("Sybase","com.sybase.jdbc.SybDriver","jdbc:sybase:Tds:<server>:<port>/<databaseName>","jdbc:sybase:Tds:localhost:4100/SybaseDbName"), 
		Teradata("Teradata","com.teradata.jdbc.TeraDriver","jdbc:teradata://<server>/database=<databaseName>,tmode=ANSI,charset=UTF8",
				"jdbc:teradata://localhost/database=TeradataDbName,tmode=ANSI,charset=UTF8"), 
		MicrosoftSQLServer("Microsoft SQL Server","com.microsoft.sqlserver.jdbc.SQLServerDriver","jdbc:sqlserver://<server>:<port>/databaseName=<databaseName>",
				"jdbc:sqlserver://localhost:1433;databaseName=MsSqlServerDbName"), 
		Postgre("Postgre", "org.postgresql.Driver","jdbc:postgresql://<server>:<port>/<databaseName>","jdbc:postgresql://localhost:5432/PostgreDbName"), 
		MSAccessJdbcOdbcBridge("MS Access (JDBC-ODBC Bridge)","sun.jdbc.odbc.JdbcOdbcDriver",
				"jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=<MdbFileName.mdb>;",
				"jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=MdbFileName.mdb;");
		private final String dataBaseType;
		private final String fullyQualifiedDriverClass;
		private final String urlPattern;
		private final String urlPatternExample;

		/**
		 * @param dataBaseType
		 * @param fullyQualifiedDriverClass
		 * @param urlPattern
		 * @param urlPatternExample
		 */
		private JdbcDrivers(final String dataBaseType,final String fullyQualifiedDriverClass,
				final String urlPattern,final String urlPatternExample) {
			this.dataBaseType = dataBaseType;
			this.fullyQualifiedDriverClass = fullyQualifiedDriverClass;
			this.urlPattern = urlPattern;
			this.urlPatternExample = urlPatternExample;
		}

		/**
		 * @return the urlPatternExample
		 */
		public final String getUrlPatternExample() {
			return urlPatternExample;
		}

		/**
		 * @return the fullyQualifiedDriverClass
		 */
		public final String getFullyQualifiedDriverClass() {
			return fullyQualifiedDriverClass;
		}

		/**
		 * @return the urlPattern
		 */
		public final String getUrlPattern() {
			return urlPattern;
		}

		/**
		 * @return the dataBaseType
		 */
		public final String getDataBaseType() {
			return dataBaseType;
		}
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		for(JdbcDrivers drivers:JdbcDrivers.values()){
			System.out.println(MessageFormat.format("######################################:{0}:Start######################################",drivers.getDataBaseType()));
			System.out.println(MessageFormat.format("DataBaseType:{0}",drivers.getDataBaseType()));
			System.out.println(MessageFormat.format("FullyQualifiedDriverClass:{0}",drivers.getFullyQualifiedDriverClass()));
			System.out.println(MessageFormat.format("UrlPattern:{0}",drivers.getUrlPattern()));
			System.out.println(MessageFormat.format("UrlPatternExample:{0}",drivers.getUrlPatternExample()));
			System.out.println(MessageFormat.format("######################################:{0}:End########################################",drivers.getDataBaseType()));
		}
	}
}
