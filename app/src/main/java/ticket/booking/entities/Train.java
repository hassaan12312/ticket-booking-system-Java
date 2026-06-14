package ticket.booking.entities;

import java.util.*;

public class Train{

   private String trainId;
   private String trainNum;
   private Date departure_time;
   private Date arrival_time;
   private List<List<Boolean>> seats;
   private Map<String, Date> stationTimes;
   private List<String> stations;
}