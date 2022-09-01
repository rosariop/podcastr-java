package de.podcastr.desktop.view;

import de.podcastr.desktop.controller.B1Action;

import javax.swing.*;

public class Sidebar extends JScrollPane {

    private Sidebar(){}

    private static Sidebar instance;

    public JScrollPane buildSidebar(JPanel panel){
        JScrollPane scrollPane = new JScrollPane (panel,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        /*TODO: -> model -> datenbank -> load podcasts*/
        JButton b1 = new JButton("Some Button");
        b1.addActionListener(new B1Action());
        panel.add(b1);
        return scrollPane;
    }

    public static Sidebar getInstance(){
        if (instance == null){
            instance = new Sidebar();
        }
        return instance;
    }

}
