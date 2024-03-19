package org.example.entities;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity // <-- Mi indica che questa classe dovrà essere mappata ad una tabella nel db
@Table(name = "events")
public class Evento {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "titoloevento")
    private String titolo;
    private LocalDate dataEvento;
    private String descrizione;
    private int numeroMassimoPartecipanti;
    @Column(name="tipo")
    @Enumerated(EnumType.STRING)
    private TipoEvento tipoEvento;

    public Evento() {
        // --> Vuoto per restituzione di oggetti da parte del Database
}

public Evento(Long id, String titolo, LocalDate dataEvento, String descrizione, int numeroMassimoPartecipanti, TipoEvento tipoEvento) {
    this.id = id;
    this.titolo = titolo;
    this.dataEvento = dataEvento;
    this.descrizione = descrizione;
    this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    this.tipoEvento = tipoEvento;
}

// Getters and Setters


    public Long getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }

    public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    //toString

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", dataEvento=" + dataEvento +
                ", descrizione='" + descrizione + '\'' +
                ", numeroMassimoPartecipanti=" + numeroMassimoPartecipanti +
                ", tipoEvento=" + tipoEvento +
                '}';
    }
}

