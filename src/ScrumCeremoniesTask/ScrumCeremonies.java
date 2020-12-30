package ScrumCeremoniesTask;

public class ScrumCeremonies {

    public String nameOfCeremonies, host;

    public ScrumCeremonies(String nameOfCeremonies, String host) {
        this.nameOfCeremonies = nameOfCeremonies;
        this.host = host;
    }

    public String agenda(){ //override, we can not override static, final, private, constructor
        return "";
    }

    public String duration(){
        return "";
    }

    public String meetingTime(){
        return "";
    }

    @Override
    public String toString() {
        return "\nScrum Ceremony" +
                "\nName Of Ceremonies: " + nameOfCeremonies + '\'' +
                "\nHost='" + host + '\'' +
                "\n=====================================";
    }
}
/*
create a package named ScrumCeremoniesTask
2- create a super class named ScrumCeremonies
	instance variables: nameOfCeremony, host;
	methods: Constructor, toString, agenda, duration, meetingTime;
3- create sub-classes: Grooming, SprintPlanning, DailyStandUp, Demo, Retro;
4- create new class named Scrum and create objects
 */

/*
Based on this task:
1-OOP->Object Oriented Programming which helps to keep the Java code DRY->"Don't Repeat Yourself"
	*makes the code easy to maintain
	*organize and efficient
	*improves the codes reusabilty
2-Inheritance->super/sub, parent/child, extends keyword
3-		super()->call constructor from parent class
		super. -> instance variables from parent class
		this()->call constructor current class
		this. -> instance variables current class
4-overriding
5-is a/has a relationship
 */

