package composite;

public class CompositeMain {

    public static void main(String[] args) {
        // Creating objects
        Developer d1 = new Developer("dev1","developer",100001l);
        Developer d2 = new Developer("dev2","developer",100000l);
        Developer d3 = new Developer("dev3","developer",100000l);
        Developer d4 = new Developer("dev4","developer",10000l);
        VicePresident vicePresident = new VicePresident("VicePresident","VicePresident",100000l);
        SeniorManager seniorManager = new SeniorManager("SeniorManager","SeniorManager",100000l);
        TeamLeader teamLeader1 = new TeamLeader("TeamLeader1","TeamLeader1",100000l);
        TeamLeader teamLeader2 = new TeamLeader("TeamLeader2","TeamLeader2",100000l);

        // Using composite by clients
        vicePresident.add(seniorManager);
        seniorManager.add(teamLeader1);
        seniorManager.add(teamLeader2);
        teamLeader1.add(d1);
        teamLeader1.add(d2);
        teamLeader2.add(d3);
        teamLeader2.add(d4);

        vicePresident.assignProject("ste",seniorManager);
        vicePresident.assignProject("ste",teamLeader1);
        teamLeader1.assignProject("ste",d1);
        teamLeader1.assignProject("ste",d2);
        teamLeader1.assignProject("ste",d3);
        teamLeader1.assignProject("ste",d4);

        teamLeader2.remove(d4);
        teamLeader2.remove(d3);

        d1.runProject();
        d2.runProject();
        teamLeader1.runProject();
    }
}
