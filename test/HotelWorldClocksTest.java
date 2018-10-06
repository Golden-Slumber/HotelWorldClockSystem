import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HotelWorldClocksTest {
    private HotelWorldClockSystem hotelWorldClockSystem;
    private PhoneClock phoneClock;

    @Before
    public void init(){
        hotelWorldClockSystem = new HotelWorldClockSystem();
        phoneClock = new PhoneClock(8);
    }

    @Test
    public void the_time_of_clock_London_should_be_1_after_the_phone_clock_is_set_to_9_Beijing_time(){
        CityClock londonClock = new CityClock(0);
        hotelWorldClockSystem.add(londonClock);

        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(9);

        assertEquals(1,londonClock.getTime());
    }

    @Test
    public void the_time_of_clock_Beijing_should_be_9_after_the_phone_clock_is_set_to_9_Beijing_time(){
        CityClock beijingClock = new CityClock(8);
        hotelWorldClockSystem.add(beijingClock);

        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(9);

        assertEquals(9,beijingClock.getTime());
    }

    @Test
    public void the_time_of_clock_Beijing_should_be_5_after_the_phone_clock_is_set_to_9_Beijing_time(){
        CityClock MoscowClock = new CityClock(4);
        hotelWorldClockSystem.add(MoscowClock);

        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(9);

        assertEquals(5,MoscowClock.getTime());
    }

    @Test
    public void the_time_of_clock_Sydeney_should_be_11_after_the_phone_clock_is_set_to_9_Beijing_time(){
        CityClock SydeneyClock = new CityClock(10);
        hotelWorldClockSystem.add(SydeneyClock);

        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(9);

        assertEquals(11,SydeneyClock.getTime());
    }

    @Test
    public void the_time_of_clock_NewYork_should_be_20_after_the_phone_clock_is_set_to_9_Beijing_time(){
        CityClock NewYorkClock = new CityClock(-5);
        hotelWorldClockSystem.add(NewYorkClock);

        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(9);

        assertEquals(20,NewYorkClock.getTime());
    }
}
