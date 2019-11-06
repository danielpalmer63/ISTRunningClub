package istrunningclub;

public class ISTRunningClub 
{
    public static void main(String[] args) 
    {
        RunningClub run = new RunningClub();
        
        run.addRunner(1234, "Princess", "Peach", "Female", 19);
        run.addRunner(5678, "Sonic", "Hedgehog", "Male", 18);
        
        run.addRace(1111, "Luigi's Mansion", "1/18/2019");
        run.addRace(2222, "Rainbow Road", "1/12/2019");
        run.addRace(3333, "Yoshi Circuit", "1/5/2019");
               
        run.recordCompletedRace(1234, "10:00", 1, 1111);
        run.recordCompletedRace(1234, "11:30", 2, 2222);
        run.recordCompletedRace(5678, "10:10", 2, 1111);
        run.recordCompletedRace(5678, "11:00", 1, 2222);
        
        run.showAll();
    }
    
}
