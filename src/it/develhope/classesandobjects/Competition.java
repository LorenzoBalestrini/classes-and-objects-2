package it.develhope.classesandobjects;

public class Competition {
    public static void main(String[] args) {

        CompetitionRules competitionRules = CompetitionRules.getInstance();
        competitionRules.printRules();

        System.out.println("---------------------------------------");

        Team teamA = new Team();
        teamA.teamName = "Primo team";

        teamA.p1.name = "Lorenzo";
        teamA.p1.programmingLanguage = "Java";
        teamA.p1.yearsOfExperience = 1;

        teamA.p2.name = "Luca";
        teamA.p2.programmingLanguage = "JavaScript";
        teamA.p2.yearsOfExperience = 3;


        Team teamB = new Team();
        teamB.teamName = "Secondo team";

        teamB.p1.name = "Silvia";
        teamB.p1.programmingLanguage = "C++";
        teamB.p1.yearsOfExperience = 2;

        teamB.p2.name = "Marco";
        teamB.p2.programmingLanguage = "Kotlin";
        teamB.p2.yearsOfExperience = 5;

        teamA.printDetails();
        System.out.println("---------------------------------------");
        teamB.printDetails();





    }


}
