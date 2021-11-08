package TVSetInnerRemote;

public class TVSetInnerRemote {
    private int channel = 5;
    private boolean isOn;
    private Remote remote = new Remote();

    public Remote getRemote(){
        return remote;
    }

    class Remote{

        public void setChannel(int channel){
            TVSetInnerRemote.this.channel = channel;
        }
        public void turnOn(){
            isOn = true;
        }
        public void turnOff(){
            isOn = false;
        }
    }

    public String toString(){
        if (!isOn){
            return "The TVset is OFF";
        }
        return "Channel " + channel + " is on the TVset now.";
    }
}

class Main {    //должно быть public class Main

    public static void main(String[] args) {
        TVSetInnerRemote tv = new TVSetInnerRemote();
        TVSetInnerRemote.Remote remote = tv.getRemote();
        System.out.println(tv);
        remote.turnOn();
        System.out.println(tv);
        remote.setChannel(2);
        System.out.println(tv);
        remote.turnOff();
        System.out.println(tv);

    }
}