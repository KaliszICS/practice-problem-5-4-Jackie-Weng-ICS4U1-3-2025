//import java.util.ArrayList;
public class VideoPlayer implements Player {
    // protected; both private and public at the same time!!
    protected String video;
    protected boolean onOff;
    
    protected int currentTime;
    protected int volume;

    public VideoPlayer(String str) {
        this.video = str;
        this.volume = 0;
        this.onOff = false;
        this.currentTime = 0;
        //stops video
    }
    public void stop() {
        if (onOff) {
            onOff = false;
        }
        //starts video
    }
    public void start() {
        if (!onOff) {
            onOff = true;
        }
    }
// is the video even playing? check
   
    public boolean getOnOff() {
        return onOff;
    }
// lower volume. too loud
    public void volumeDown() {
        volume -= 5;
    }
// increase volume. too quiet

    public void volumeUp() {
        volume += 5;
    }

    
// what even is the volume??
    public int getVolume() {
        return volume;
    }
// fast foward. the video must be too boring or something
    public void fastForward() {
        currentTime += 5;
    }
// fast backwards. 
    public void rewind() {
        currentTime -= 5;
    }
// whats the current time?
    public int getCurrentTime() {
        return currentTime;
    }
// what video is even playing
    public String getVideo() {
        return video;
    }
// what video do you even want to watch?
    public void setVideo(String video) {
        this.video = video;
    }
    
}

