package de.podcastr.desktop.view;

import de.podcastr.desktop.controller.PodcastListButtonAction;

import javax.swing.*;
import java.awt.*;

public class Sidebar extends JScrollPane {

    private Sidebar(){}

    private static Sidebar instance;

    public static Sidebar getInstance(){
        if (instance == null){
            instance = new Sidebar();
        }
        return instance;
    }

    public JScrollPane buildSidebar(JPanel panel){
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JScrollPane scrollPane = new JScrollPane (panel,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setAlignmentY(Component.CENTER_ALIGNMENT);
        scrollPane.setPreferredSize(new Dimension(125, 400));
        /*TODO: -> model -> datenbank -> load podcasts*/
        for(int i = 0; i < 20; i++){
            JButton b1 = new JButton("Some Button");
            b1.addActionListener(new PodcastListButtonAction());
            panel.add(b1);
        }
        return scrollPane;
    }
}
