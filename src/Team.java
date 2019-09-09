import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {


    public Team(String name) {
        Name = name;
    }

    private String Name;
    int played=0;
    int won=0;

    public String getName() {
        return Name;
    }

    int lost=0;
    int tied = 0;
    private ArrayList<T> members= new ArrayList<>();

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println((player).getName() +"Player already exist");
            return false;
        }
        else {
            members.add(player);
            System.out.println((player).getName()+"player was added to team " + this.Name);
            return true;
        }
    }
        public int numPlayers() {
        return this.members.size();
        }
     public void matchResult(Team<T> opponent, int ourScore, int theirScore ) {
      //  opponent.played++;
         String message;
        this.played++;
        if (ourScore>theirScore) {
            this.won++;
            message = this.getName()+"Won on" ;
          //  opponent.lost++;
        }else if (ourScore<theirScore) {
            this.lost++;
            message = this.getName()+"Lost Against ";
          //  opponent.won++;
        }
        else {this.tied++;//opponent.tied++;
            message = this.getName()+"tied with " ;
             }
        if(opponent!=null) {
            opponent.matchResult(null,theirScore,ourScore);
        }
         System.out.println(message);
     }

     public int ranking (){
        return (won*2 +tied);
     }


    @Override
    public int compareTo(Team<T> team) {
            if (this.ranking() > team.ranking()) {
                return -1;
            }
            else if (this.ranking() < team.ranking()) {
                return 1;}
            else {
                return 0;}

    }
    }

