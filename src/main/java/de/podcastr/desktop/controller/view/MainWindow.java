package de.podcastr.desktop.controller.view;

import lombok.extern.slf4j.Slf4j;

import javax.swing.*;
import java.awt.*;

@Slf4j
public class MainWindow {

    public static void start(){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException | ClassNotFoundException e) {
            log.error(e.getMessage());
            e.printStackTrace();
        }

        //frame
        JFrame frame = new JFrame("a random title");
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);

        //panel
        JPanel panel = new JPanel();
        frame.setContentPane(panel);

        //title
        JLabel title = new JLabel("Podcastr App");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 24));
        panel.add(title, BorderLayout.NORTH);

        //sidebar
        Sidebar sidebar = new Sidebar();
        panel.add(sidebar.buildSidebar(), BorderLayout.WEST);

        frame.setVisible(true);
    }

}
