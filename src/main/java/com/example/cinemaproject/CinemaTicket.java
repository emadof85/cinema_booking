package com.example.cinemaproject;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
@Entity
public class CinemaTicket {
    @Id
    private int id;
    private  String movie_name;
    private int Ticket_number;
    private String first_name;
    private String sur_name;
    private int phone_number;
    private String email;
    public CinemaTicket (int id,
                         String movie_name,
                         int Ticket_number,
                         String first_name,
                         String sur_name,
                         int phone_number,
                         String email)
    {
        this.id=id;
        this.movie_name=movie_name;
        this.Ticket_number=Ticket_number;
        this.first_name=first_name;
        this.sur_name=sur_name;
        this.phone_number=phone_number;
        this.email=email;

    }
    public CinemaTicket()
    {

    }
    public CinemaTicket (
            String movie_name,
            int Ticket_number,
            String first_name,
            String sur_name,
            int phone_number,
            String email)
    {

        this.movie_name=movie_name;
        this.Ticket_number=Ticket_number;
        this.first_name=first_name;
        this.sur_name=sur_name;
        this.phone_number=phone_number;
        this.email=email;

    }

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getSur_name() {
        return sur_name;
    }

    public int getTicket_number() {
        return Ticket_number;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public String getEmail() {
        return email;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public void setSur_name(String sur_name) {
        this.sur_name = sur_name;
    }

    public void setTicket_number(int ticket_number) {
        Ticket_number = ticket_number;
    }

    @Override
    public String toString() {
        return "CinemaTicket{" +
                "id=" + id +
                ", movie_name='" + movie_name + '\'' +
                ", Ticket_number=" + Ticket_number +
                ", first_name='" + first_name + '\'' +
                ", sur_name='" + sur_name + '\'' +
                ", phone_number=" + phone_number +
                ", email='" + email + '\'' +
                '}';
    }
}

