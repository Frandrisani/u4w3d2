package org.example.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import org.example.entities.Evento;
import org.example.exceptions.NotFoundExceptions;

public class EventoDAO {
    private final EntityManager em;

    public EventoDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Evento evento){
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.persist(evento);
            transaction.commit();
            System.out.println("Evento " + evento.getTitolo() + " salvato correttamente!");
    }

public Evento getById(Long id) {
        Evento evento = em.find(Evento.class, id);
    if(evento == null) throw new NotFoundExceptions(id);
        return evento;

}

public void delete(Long id){
            Evento eventotrovato = this.getById(id);
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.remove(eventotrovato);
            transaction.commit();
            System.out.println("Evento con id " + eventotrovato.getId() + " eliminato correttamente!");
}
}
