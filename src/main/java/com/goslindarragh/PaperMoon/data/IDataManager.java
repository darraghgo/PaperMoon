package com.goslindarragh.PaperMoon.data;

import	java.sql.Connection;
import	java.sql.SQLException;
public interface IDataManager {
				
				public	Connection	getConnectionObject() throws	SQLException;
				public void disconnect() throws	SQLException;
}