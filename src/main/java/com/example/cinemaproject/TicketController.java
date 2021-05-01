package com.example.cinemaproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/CinemaTicket")
public class TicketController {
   @Autowired
    AppRepository repo;
    DataRepository repo2;
    @PostMapping("/ticket")
    public void new_ticket(CinemaTicket cinema_ticket1)
    {
        repo.AddTicket(cinema_ticket1);
        repo2.addTicket2(cinema_ticket1);
    }
    @GetMapping("/ticket")
    public ArrayList<CinemaTicket> ShowTickets()
    {
        return repo.ShowAllTicket();

    }
    @DeleteMapping("/ticket")
    public  void DeleteTickets()
    {
        repo.DeleteAllTickets();
        repo2.DeleteTickets();
    }
}

