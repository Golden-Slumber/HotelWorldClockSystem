public class CityClock extends Clock{

    private int utcZeroTIme;

    public CityClock(int utcOffset){
        this.utcOffset = utcOffset;
    }

    @Override
    public int getTime() {
        return (utcZeroTIme+utcOffset+24)%24;
    }

    public void setUtcZeroTIme(int utcZeroTIme){
        this.utcZeroTIme = utcZeroTIme;
    }
}
