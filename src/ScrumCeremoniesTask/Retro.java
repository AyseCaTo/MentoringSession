package ScrumCeremoniesTask;

public class Retro extends ScrumCeremonies {

    public Retro() {
        super("Retrospective Meeting", "SM");
    }

    @Override
    public String agenda() {
        return "In order to evaluate the last sprint." +
                "\nthree questions:" +
                "\n1-What went well?" +
                "\n2-What went wrong?" +
                "\n3-What could be improved?";
    }

    @Override
    public String duration() {
        return "Around 2 hours";
    }

    @Override
    public String meetingTime() {
        return "At the end of each sprint after demo";
    }
}
