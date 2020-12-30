package ScrumCeremoniesTask;

public class Demo extends ScrumCeremonies  {

    public Demo() {
        super("Demonstration Meeting", "PO");
    }

    @Override
    public String agenda() {
        return "Team members/leaders demonstrate their done work" +
                "\nPO accept or reject their work" +
                "\nDOD->checklist(check whether the project done or not)";
    }

    @Override
    public String duration() {
        return "Around 3 hours";
    }

    @Override
    public String meetingTime() {
        return "At the end of each meeting";
    }
}
