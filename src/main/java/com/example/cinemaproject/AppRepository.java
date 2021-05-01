package com.example.cinemaproject;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class AppRepository {
    private final ArrayList<CinemaTicket> cinema_tickets=new ArrayList();
    public void AddTicket(CinemaTicket cinema_ticket1)
    {
        cinema_tickets.add(cinema_ticket1);
    }
    public ArrayList<CinemaTicket> ShowAllTicket()
    {
        return  cinema_tickets;
    }
    public  void DeleteAllTickets(){
        cinema_tickets.clear();
    }
}