import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        FootBallPlayer joe = new FootBallPlayer("JOE ");
        BaseballPlayer Bat = new BaseballPlayer("BAT ");
        SoccerPlayer sucree = new SoccerPlayer("SUCREE ");
        FootBallPlayer fadi = new FootBallPlayer("FADI ");

        Team<FootBallPlayer> footBallTeam = new Team<>("footBallTeam ");
        Team<FootBallPlayer> footBallTeam2 = new Team<>("footBallTeam 2");
        footBallTeam2.addPlayer(joe);

        footBallTeam.addPlayer(fadi);
       // footBallTeam.addPlayer(sucree);


       // System.out.println(footBallTeam.numPlayers());

        Team<BaseballPlayer> baseBallTeam = new Team<>("baseBallTeam ");

        baseBallTeam.addPlayer(Bat);

        Team<SoccerPlayer> soccerTeam = new Team<>("soccerTeam");
footBallTeam.matchResult(footBallTeam2,5,3);

footBallTeam2.matchResult(footBallTeam,1,0);
        footBallTeam.matchResult(footBallTeam2,1,3);

        soccerTeam.addPlayer(sucree);
//baseBallTeam.matchResult(footBallTeam,5,0);

        System.out.println("RANKING \n ==============================================");
        System.out.println(footBallTeam.getName() +"RANK is = " + footBallTeam.ranking());
        System.out.println(footBallTeam2.getName() +"RANK is = " + footBallTeam2.ranking());

        System.out.println(footBallTeam.compareTo(footBallTeam2));
        System.out.println(footBallTeam2.compareTo(footBallTeam));



    }
}
