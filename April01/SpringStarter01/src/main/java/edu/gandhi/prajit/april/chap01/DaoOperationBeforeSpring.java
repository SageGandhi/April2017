package edu.gandhi.prajit.april.chap01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoOperationBeforeSpring {
	public <EntityIdType> Object getBusinessClassTransferObject(EntityIdType entityIdType) {
		Connection connectionSql = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Object businessClassTransferObject = null;
		try {
			connectionSql = DriverManager.getConnection("DataBaseUrl");
			//Business Value In The Following Line
			preparedStatement = connectionSql.prepareStatement("AnySqlQueryWithParameter");
			preparedStatement.setString(1, entityIdType.toString());
			resultSet = preparedStatement.executeQuery();
			if (resultSet != null) {
				while (resultSet.next()) {
					//Business Value In The Following Line Set&Get
					businessClassTransferObject = resultSet.getObject(1); 
				}
			}
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		} finally {
			try {
				if (resultSet != null && !resultSet.isClosed()) {
					resultSet.close();
				}
			} catch (SQLException sqlExceptionRs) {
				sqlExceptionRs.printStackTrace();
			}
			try {
				if (preparedStatement != null && !preparedStatement.isClosed()) {
					preparedStatement.close();
				}
			} catch (SQLException sqlExceptionPs) {
				sqlExceptionPs.printStackTrace();
			}
			try {
				if (connectionSql != null && !connectionSql.isClosed()) {
					connectionSql.close();
				}
			} catch (SQLException sqlExceptionConn) {
				sqlExceptionConn.printStackTrace();
			}
		}
		return businessClassTransferObject;
	}
}