class MusicPlayer implements Player {
    
    protected String[] musicList;
    protected String currentSong; 
    protected boolean onOff;
       
    protected int volume;
    protected int currentSongIndex;

    public MusicPlayer(String[] list) {
        this.musicList = list;
        this.volume = 0;
        this.onOff = false;
        this.currentSong = "";
    }
// starts the musuic
    @Override
    public void start() {
        if (!onOff) {
            onOff = true;
            currentSong = musicList[0];
            currentSongIndex = 0;
        }
    }
// ends the music
    @Override
    public void stop() {
        if (onOff) {
            onOff = false;
            currentSong = "";
        }
    }
// checks if the music is on or off
    public boolean getOnOff() {
        return onOff;
    }
// increase the volume by 1
    @Override
    public void volumeUp() {
        volume++;
    }
    // decreasze the volume by 1
    @Override
    public void volumeDown() {
        volume--;
    }
//whats the volume!!!
    public int getVolume() {
        return volume;
    }
    // starts the next song. hopefully its not tyler swift
    public void next() {
        currentSongIndex++;
        currentSong = musicList[currentSongIndex];
    }

// starts the previous song. hopeuflly its not tyler swift
    public void previous() {
        currentSongIndex--;
        currentSong = musicList[currentSongIndex];
    }
    // WHATS THE CURRENT SONG??
    public String getCurrentSong() {
        return currentSong;
    }

}