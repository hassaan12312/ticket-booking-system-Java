package ticket.booking.services;
import java.io.File;
import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ticket.booking.entities.User;

public class UserBookingService{
    
    private User user;
    private static final String USERS_PATH = " app/src/main/java/ticket/booking/localDb/users.json";
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private List<User> userList;

    public UserBookingService(User user1) throws IOException{
        this.user = user1;
        File users = new File(USERS_PATH);
        userList = objectMapper.readValue(users, new TypeReference<List<User>>() {});
    }

    public Boolean signUp(User user1){
        try{
            userList.add(user1);
            return Boolean.TRUE;
        } 
        catch(Exception ex){
            return Boolean.FALSE;
        }
    }

    public Boolean loginUser(){
        Optional<User> foundUser = userList.stream().filter(user1 -> {
            return user1.getName().equals(user.getName()) && UserServiceUtil.checkPassword(user.getPassword(), user1.getHashedPassword());
        }).findFirst();

        return foundUser.IsPresent();
    }
}