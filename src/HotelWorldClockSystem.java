import java.util.ArrayList;
import java.util.List;

public class HotelWorldClockSystem {

    private List<CityClock> cityClocks;

    public HotelWorldClockSystem(){
        cityClocks = new ArrayList<>();
    }

    public void add(CityClock cityClock){
        cityClocks.add(cityClock);
    }

    public List<CityClock> getCityClocks(){
        return cityClocks;
    }

}

