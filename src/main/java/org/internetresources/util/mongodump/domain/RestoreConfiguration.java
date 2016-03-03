package org.internetresources.util.mongodump.domain;

import lombok.Data;

@Data
public class RestoreConfiguration {
	String dbName = null;
	String collectionName = null;
	String backupFile = null;

	public static RestoreConfiguration getInstance(String dbName, String backupFilename) {
		RestoreConfiguration conf = new RestoreConfiguration();
		conf.dbName = dbName;
		conf.backupFile = backupFilename;
		return conf;
	}

	public static RestoreConfiguration getInstance(String dbName, String collName, String backupFilename) {
		RestoreConfiguration conf = new RestoreConfiguration();
		conf.dbName = dbName;
		conf.collectionName = collName;
		conf.backupFile = backupFilename;
		return conf;
	}
}
