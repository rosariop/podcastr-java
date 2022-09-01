package de.podcastr.desktop.controller.view;

public enum Laf {
    Win("com.sun.java.swing.plaf.motif.MotifLookAndFeel");

    public final String LAF;

    Laf(String LAF) {
        this.LAF = LAF;
    }
}