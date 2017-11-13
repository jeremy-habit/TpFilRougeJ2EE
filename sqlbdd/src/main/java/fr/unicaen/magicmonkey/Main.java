package fr.unicaen.magicmonkey;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {


    public static void main(String[] args) throws SQLException {
        createLink("", "j2ee", "root", "");
    }

    public static Connection createLink(String host, String database, String username, String password) throws SQLException {
        MysqlDataSource ds = new MysqlDataSource();
        ds.setServerName(host);
        ds.setDatabaseName(database);
        Connection link = ds.getConnection(username, password);
        if (!link.isValid(0)) {
            throw new SQLException("Failed to initialize a valid connection to database.");
        }
        return link;
    }

}
