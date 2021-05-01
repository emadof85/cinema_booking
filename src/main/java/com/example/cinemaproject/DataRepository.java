package com.example.cinemaproject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataRepository {
    @Autowired
    private JdbcTemplate db;
    public void addTicket2(CinemaTicket Ticket1)
    {
        String sql="INSERT INTO CinemaTicket (movie_name,Ticket_number,first_name,sur_name,phone_number,email) VALUES(?,?,?,?,?,?)";
        db.update(sql,Ticket1.getMovie_name(),Ticket1.getTicket_number(),Ticket1.getFirst_name(),Ticket1.getSur_name(),Ticket1.getPhone_number(),Ticket1.getEmail());
    }
    public List<CinemaTicket> GetALLTicket()
    {
        String sql="SELECT * From CinemaTicket";
        List<CinemaTicket> allTickets=db.query(sql,new BeanPropertyRowMapper(CinemaTicket.class));
        return  allTickets;
    }
    public  void DeleteTickets()
    {
        String sql="Delete from CinemaTicket";
    }
}
