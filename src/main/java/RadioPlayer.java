//import java.util.ArrayList;

// all 3 are like literally the same
public class RadioPlayer implements Player {
   //// protected; both private and public at the same time!!
    protected boolean onOff;
    protected double[] stationList;
    protected int volume;
    protected double station;
    
    protected int stationIndex;

    public RadioPlayer(double[] list) {
        this.stationList = list;
        this.volume = 0;
        this.onOff = false;
        this.station = 0;
    }
// start radio
    public void start() {
        if (!onOff) {
            onOff = true;
            station = stationList[0];
            stationIndex = 0;
        }
    }
//end radio
    public void stop() {
        if (onOff) {
            onOff = false;
            station = 0;
        }
    }
// is the raido even on
    public boolean getOnOff() {
        return onOff;
    }
// increase volume. must be too quiet
    public void volumeUp() {
        volume += 2;
    }
// decrease volume. must be too loud
    public void volumeDown() {
        volume -= 2;
    }
//what evne is the the volume?
    public int getVolume() {
        return volume;
    }
// next radio
    public void next() {
        stationIndex++;
        station = stationList[stationIndex];

    }
// previous radio
    public void previous() {
        stationIndex--;
        station = stationList[stationIndex];
    }
// what station is even playing? checks which one
    public double getStation() {
        return station;
    }

}