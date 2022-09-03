package de.podcastr.desktop;

import de.podcastr.desktop.view.MainWindow;
import org.h2.jdbcx.JdbcDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class Podcastr {
    public static void main(String[] args) {
        try {
            JdbcDataSource ds = new JdbcDataSource();
            ds.setURL("jdbc:h2:./test");
            ds.setUser("sa");
            ds.setPassword("sa");
            Connection conn = ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        MainWindow.start();
    }
}
