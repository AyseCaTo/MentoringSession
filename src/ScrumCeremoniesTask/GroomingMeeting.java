package ScrumCeremoniesTask;

public class GroomingMeeting extends ScrumCeremonies {


    public GroomingMeeting() {
        super("Grooming Meeting", "PO");
    }

    @Override
    public String agenda() {
        return "PO explains all user stories." +
                "\nPO prioritize the user stories" +
                "\nTeam give the estimation.";
    }

    @Override
    public String duration() {
        return "Around 2 hours";
    }

    @Override
    public String meetingTime() {
        return "Before each sprint";
    }
}
