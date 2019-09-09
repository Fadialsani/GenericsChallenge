import java.util.ArrayList;

public class Team<T> {
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
            System.out.println(((Player)player).getName() +"Player already exist");
            return false;
        }
        else {
            members.add(player);
            System.out.println(((Player)player).getName()+"player was added to team " + this.Name);
            return true;
        }
    }
        public int numPlayers() {
        return this.members.size();
        }
     public void matchResult(Team opponent, int ourScore, int theirScore ) {
      //  opponent.played++;
        this.played++;
        if (ourScore>theirScore) {
            this.won++;
          //  opponent.lost++;
        }else if (ourScore<theirScore) {
            this.lost++;
          //  opponent.won++;
        }
        else {this.tied++;//opponent.tied++;

             }
        if(opponent!=null) {
            opponent.matchResult(null,theirScore,ourScore);
        }
     }

     public int ranking (){
        return (won*2 +tied);
     }

    }

