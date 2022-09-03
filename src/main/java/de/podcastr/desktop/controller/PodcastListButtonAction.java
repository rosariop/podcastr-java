package de.podcastr.desktop.controller;

import de.podcastr.desktop.model.Episode;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PodcastListButtonAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("testPU");
        EntityManager em = emf.createEntityManager();

        Episode epi = new Episode();
        em.persist(epi);

        System.out.println("works");
    }
}
