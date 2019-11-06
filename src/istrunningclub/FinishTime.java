package istrunningclub;

public class FinishTime {
    
    private String finishTime;
    private int RunnerID;
    private int RaceID;
    private int finishPlace;
    
    
    
    public FinishTime(String finishTime, int finishPlace, int RunnerID, int RaceID)
    {
        this.RaceID = RaceID;
        this.RunnerID = RunnerID;
        this.finishTime = finishTime;
        this.finishPlace = finishPlace;       
        
    }

    @Override
    public String toString() {
        return "FinishTime{" + "RaceID=" + RaceID + ", RunnerID=" + RunnerID + ", finishTime=" + finishTime + ", finishPlace =" + finishPlace + '}';
    }
    
}
