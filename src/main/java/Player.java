//main interface
// all the subclasses must have these
// literally a template
// all must have, start,stop,volumeup,volume down,getvolume
// they must have these. they can still however add other bits and pieces of code
//literally a template
interface Player {
    
    public void start();
    public void stop();
    public void volumeUp();
    public void volumeDown();
    public int getVolume();

}