package StreamaAPI;


public class Hobby {

    public String Nane;
    public int Countofuser;
    public float Cost;

    public Hobby(String s , int c, float cos)
    {
        Nane = s;
        Countofuser = c;
        Cost = cos;

    }


    public String  getName()
    {
        return Nane;
    }

    public int compareTo1(Object obj)
    {
        Hobby t = (Hobby)obj;
        if(Countofuser > t.Countofuser)return 1;
        else if (Countofuser < t.Countofuser) return -1;
        else return 0;
    }

    public int compareTo2(Object obj)
    {
        Hobby t = (Hobby)obj;
        if(Cost > t.Cost)return 1;
        else if (Cost < t.Cost) return -1;
        else return 0;
    }

    public boolean isok ()
    {
     if(Cost %2 ==0)return true;
        else return false;
    }

    @Override
    public String toString()
    {
        return " [Name->" + Nane + " Users->" + Countofuser + " Cost->" + Cost + "]\n";
    }
}
