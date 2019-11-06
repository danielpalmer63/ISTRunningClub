package istrunningclub;

import java.util.Objects;

public class Runner 
{
    
    private int runnerID;
    private String FirstName;
    private String LastName;
    private String Gender;
    private int age;
    
    public Runner(int runnerID, String FirstName, String LastName, String Gender, int age)
    {
        this.runnerID = runnerID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Gender = Gender;
        this.age = age;        
    }

    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 37 * hash + this.runnerID;
        hash = 37 * hash + Objects.hashCode(this.FirstName);
        hash = 37 * hash + Objects.hashCode(this.LastName);
        hash = 37 * hash + Objects.hashCode(this.Gender);
        hash = 37 * hash + this.age;
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) 
        {
            return true;
        }
        if (obj == null) 
        {
            return false;
        }
        if (getClass() != obj.getClass()) 
        {
            return false;
        }
        final Runner other = (Runner) obj;
        if (this.runnerID != other.runnerID) 
        {
            return false;
        }
        if (this.age != other.age) 
        {
            return false;
        }
        if (!Objects.equals(this.FirstName, other.FirstName)) 
        {
            return false;
        }
        if (!Objects.equals(this.LastName, other.LastName)) 
        {
            return false;
        }
        if (!Objects.equals(this.Gender, other.Gender)) 
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString() 
    {
        return "Runner{" + "runnerID=" + runnerID + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Gender=" + Gender + ", age=" + age + '}';
    }

    public int getRunnerID() 
    {
        return runnerID;
    }

    public void setRunnerID(int runnerID) 
    {
        this.runnerID = runnerID;
    }

    public String getFirstName() 
    {
        return FirstName;
    }

    public void setFirstName(String FirstName) 
    {
        this.FirstName = FirstName;
    }

    public String getLastName() 
    {
        return LastName;
    }

    public void setLastName(String LastName) 
    {
        this.LastName = LastName;
    }

    public String getGender() 
    {
        return Gender;
    }

    public void setGender(String Gender) 
    {
        this.Gender = Gender;
    }

    public int getAge() 
    {
        return age;
    }

    public void setAge(int age) 
    {
        this.age = age;
    }
}