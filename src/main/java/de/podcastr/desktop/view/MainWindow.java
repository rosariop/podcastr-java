package de.podcastr.desktop.view;

import javax.swing.*;

import com.formdev.flatlaf.FlatDarculaLaf;

import java.awt.*;

public class MainWindow {

    private MainWindow(){}

    public static void start(){
        FlatDarculaLaf.setup();

        //frame
        JFrame frame = buildFrame();
        //title
        placeTitle(frame);
        //sidebar
        placeSidebar(frame);

        frame.setVisible(true);
    }

    private static void placeTitle(JFrame frame) {
        JLabel title = new JLabel("Podcastr App",  SwingConstants.CENTER);
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 24));
        frame.add(title, BorderLayout.NORTH);
    }

    private static void placeSidebar(JFrame frame) {
        JPanel panel = new JPanel();
        Sidebar sidebar = Sidebar.getInstance();
        JScrollPane sidebarPane = sidebar.buildSidebar(new JPanel());
        panel.add(sidebarPane);
        frame.add(panel, BorderLayout.WEST);
    }

    private static JFrame buildFrame() {
        JFrame frame = new JFrame("a random title");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);
        return frame;
    }

}
