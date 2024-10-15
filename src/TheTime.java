public class TheTime {
    int hour ;
    int minute;
    int second;
    TheTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    int getHour() {
        return hour;
    }
    int getMinute(){
        return minute;
    }
    int getSecong(){
        return second;
    }
    void setHour(int hour) {
        this.hour = hour;
    }
    void setMinute (int minute){
        this.minute = minute;
    }
    void setSecond(int second){
        this.second = second;
    }
    void setTime (int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    public String toString(){
        return hour + ":" + minute + ":" + second;
    }
    TheTime nextSecond(){
        return new TheTime(hour + 1, minute + 1, second);
    }

}
