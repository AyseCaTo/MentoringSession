package ScrumCeremoniesTask;

public class StandUp extends ScrumCeremonies { //stand up is a Scrum ceremonies


    public StandUp() {
        super("Daily Stand up Meeting", "SM");
    }

    @Override
    public String agenda() {
        return "Three questions:" +
                "\n1-What did we do yesterday?" +
                "\n2-What we are gonna do today?" +
                "\n3-Is there any problem?";
    }

    @Override
    public String duration() {
        return "Around 15-20 minutes";
    }

    @Override
    public String meetingTime() {
        return "Every morning";
    }
}
