package istrunningclub;

import java.util.Objects;

public class Race {
    private int RaceID;
    private String Location;
    private String Date;
    
    public Race(int RaceID, String Location, String Date)
    {
        this.RaceID = RaceID;
        this.Location = Location;
        this.Date = Date;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.RaceID;
        hash = 97 * hash + Objects.hashCode(this.Location);
        hash = 97 * hash + Objects.hashCode(this.Date);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Race other = (Race) obj;
        if (this.RaceID != other.RaceID) {
            return false;
        }
        if (!Objects.equals(this.Location, other.Location)) {
            return false;
        }
        if (!Objects.equals(this.Date, other.Date)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Race{" + "RaceID=" + RaceID + ", Location=" + Location + ", Date=" + Date + '}';
    }

    public int getRaceID() {
        return RaceID;
    }

    public void setRaceID(int RaceID) {
        this.RaceID = RaceID;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }  
    
    
        
}
