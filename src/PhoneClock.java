public class PhoneClock extends Clock{
    private HotelWorldClockSystem hotelWorldClockSystem;
    private int time;

    public PhoneClock(int utcOffset){
        this.utcOffset = utcOffset;
    }

    public void setHotelWorldClockSystem(HotelWorldClockSystem hotelWorldClockSystem){
        this.hotelWorldClockSystem = hotelWorldClockSystem;
    }

    public void setTime(int time){
        this.time = time;
        if(hotelWorldClockSystem!=null){
            for (CityClock cityClock:hotelWorldClockSystem.getCityClocks()){
                cityClock.setUtcZeroTIme(time-utcOffset);
            }
        }
    }

    @Override
    public int getTime() {
        return time;
    }
}
