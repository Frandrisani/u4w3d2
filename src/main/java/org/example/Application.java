package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.dao.EventoDAO;
import org.example.entities.Evento;
import org.example.entities.TipoEvento;
import org.example.exceptions.NotFoundExceptions;

import java.time.LocalDate;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4w3d2");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventoDAO eventoDao = new EventoDAO(em);
        Evento evento1 = new Evento("Evento 1", LocalDate.of(2023,3,12), "Descrizione evento 1", 100, TipoEvento.PUBBLICO);
        Evento evento2 = new Evento("Evento 2", LocalDate.of(2024,5,22), "Descrizione evento 2", 50, TipoEvento.PRIVATO);
        Evento evento3 = new Evento("Evento 3", LocalDate.of(2024,7,2), "Descrizione evento 3", 10, TipoEvento.PRIVATO);
        Evento evento4 = new Evento("Evento 4", LocalDate.of(2024,10,1), "Descrizione evento 4", 500, TipoEvento.PUBBLICO);
        Evento evento5 = new Evento("Evento 5", LocalDate.of(2025,1,1), "Descrizione evento 5", 1000, TipoEvento.PUBBLICO);

        /*eventoDao.save(evento1);
        eventoDao.save(evento2);
        eventoDao.save(evento3);
        eventoDao.save(evento4);
        eventoDao.save(evento5);*/

        /*eventoDao.delete(106L);*/

        try {
            Evento trovato = EventoDAO.getById(11);
            System.out.println(trovato);
        } catch (NotFoundExceptions ex) {
            System.out.println(ex.getMessage());
        }

    }
}
