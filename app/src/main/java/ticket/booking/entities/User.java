package ticket.booking.entities;

import java.util.List;

public class User{
    private String userId;
    private String userName;
    private String password;
    private String hashedPassword;
    private List<Ticket> ticketsBooked;

    public String getId(){
        return userId;
    }

    public String getName(){
        return userName;
    }

    public String getPassword(){
        return password;
    }

    public String getHashedPassword(){
        return hashedPassword;
    }
}