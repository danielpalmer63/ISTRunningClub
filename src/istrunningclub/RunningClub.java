package istrunningclub;

import java.util.ArrayList;
import java.util.Iterator;

public class RunningClub {
    
    ArrayList<Runner> runners = new ArrayList();
    ArrayList<Race> races = new ArrayList();
    ArrayList<FinishTime> finishTimes = new ArrayList();
    
    public boolean addRunner(int RunnerID, String FirstName, String LastName, String Gender, int age)
    {
        
        Iterator<Runner> findRunner = runners.iterator();
        Runner tempRunner = new Runner(RunnerID, FirstName, LastName, Gender, age);
        
        while(findRunner.hasNext())
        {
            Runner runner = findRunner.next();
            if(RunnerID == runner.getRunnerID())
            {
                return false;
            }
        }
        
        runners.add(tempRunner);
        return true;             
    }
    
    public boolean addRace(int RaceID, String Location, String RaceDate)
    {
        Iterator<Race> findRace = races.iterator();
        Race tempRace = new Race(RaceID, Location, RaceDate);
                
        while(findRace.hasNext())
        {
            Race race = findRace.next();
            if(RaceID == race.getRaceID())
            {
                return false;
            }
        }  
        races.add(tempRace);

        return true;
    }
    
    
    
    public void recordCompletedRace(int RunnerID, String finishTime, int finishPlace, int RaceID)
    {
        boolean found1 = false;
        boolean found2 = false;
        Iterator<Race> findRace = races.iterator();
                       
        while(findRace.hasNext())
        {
            Race race = findRace.next();
            if(RaceID == race.getRaceID())
            {
                found1 = true;
                break;
            }
        }  
        
        Iterator<Runner> findRunner = runners.iterator();
                        
        while(findRunner.hasNext())
        {
            Runner runner = findRunner.next();
            if(RunnerID == runner.getRunnerID())
            {
                found2 = true;
                break;
            }
        }  
        
        if(found1 == true && found2 == true)
        {
            FinishTime tempFinishTime = new FinishTime(finishTime, finishPlace, RunnerID, RaceID);
            finishTimes.add(tempFinishTime);
        }
        
    }
    
    public void showAll()
    {
        System.out.println(runners);
        System.out.println(races);
        System.out.println(finishTimes);
    }
    
}
