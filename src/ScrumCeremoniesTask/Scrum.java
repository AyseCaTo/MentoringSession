package ScrumCeremoniesTask;

public class Scrum { // scrum has (a) ceremonies

    public static void main(String[] args) {

        Demo demo = new Demo();
        SprintPlanning sprintPlanning = new SprintPlanning();
        System.out.println(demo);
        System.out.println(demo.agenda());
        System.out.println(demo.duration());
        System.out.println(demo.meetingTime());
        System.out.println(sprintPlanning);
        System.out.println(sprintPlanning.agenda());
        System.out.println(sprintPlanning.duration());
        System.out.println(sprintPlanning.meetingTime());

    }
}
