package ticket.booking.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class User{
    private String name;
    private String password;
    private String hashedPassword;
    private List<Ticket> ticketsBooked;
    private String userID;

    public User(String name, String password, String hashedPassword, List<Ticket> ticketsBooked, String userID){
        this.name = name;
        this.password = password;
        this.hashPassword = hashedPassword;
        this.ticketsBooked = ticketsBooked;
        this.userID = userID;
    }
    public User(){}        //constructor

    public String getName(){
        return name;
    }

    public String getPassword(){
        return password;
    }

    public String getHashedPassword(){
        return hashedPassword;
    }

    public List<Ticket> getTicketsBooked(){
        return ticketsBooked;
    }

    public void printTickets(){
        for(int i = 0;i < ticketsBooked.size();i++){
            System.out.println(ticketsBooked.get(i).getTicketInfo());
        }
    }

    public String getUserID(){
        return userID;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHashedPassword(String hashedPassword){
        this.hashedPassword = hashedPassword;
    }

    public void setTicketsBooked(List<Ticket> ticketsBooked){
        this.ticketsBooked = ticketsBooked;
    }

    public void setUserID(String userID){
        this.userID = userID;
    }

}