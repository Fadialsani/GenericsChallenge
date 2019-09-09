import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        FootBallPlayer joe = new FootBallPlayer("JOE ");
        BaseballPlayer Bat = new BaseballPlayer("BAT ");
        SoccerPlayer sucree = new SoccerPlayer("SUCREE ");

        Team<FootBallPlayer> sabe3team = new Team<>("Sabe3TEAM ");

        sabe3team.addPlayer(joe);
      //  sabe3team.addPlayer(Bat);
      //  sabe3team.addPlayer(sucree);

        System.out.println(sabe3team.numPlayers());

        Team<BaseballPlayer> crows = new Team<>("CROWS ");

        crows.addPlayer(Bat);

    }
}
