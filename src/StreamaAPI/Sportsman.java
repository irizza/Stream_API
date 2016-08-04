package StreamaAPI;

/**
 * Created by Anton on 20.04.2016.
 */
public class Sportsman implements Comparable {

    private int _position;
    private String _fio;
    private String _yearBorn;

    public int getPosition() {return this._position;}
    public String getFIO() {return this._fio;}
    public String getYearBorn() {return this._yearBorn;}

    public Sportsman(int pos, String fio, String year)
    {
        this._position = pos;
        this._fio = fio;
        this._yearBorn = year;
    }

    public int SummOfYearDigit()
    {
        int summ = 0;
        char mass[] = this.getYearBorn().toCharArray();
        for (int i = 0; i < 4; i++)
        {
            summ += Character.digit(mass[i],10);
        }
        return summ;
    }

    public boolean outOk()
    {
       if (this.SummOfYearDigit()%2 == 0)
           return false;

           return true;
    }

    public boolean outOK2(int inputValue)
    {
        if (this.getPosition() < inputValue || this.getPosition()%2 != 0)
            return false;
        else
            return true;
    }


    @Override
    public String toString()
    {
        return "Position: [" + this.getPosition() + "] FIO: [" + this.getFIO() +"] Year when born: [" + this.getYearBorn() + "]";
    }

    public int reversCompareTo(Object o)
    {
        Sportsman n = (Sportsman)o;

        int t1 = Integer.parseInt(this.getYearBorn());
        int t2 = Integer.parseInt(n.getYearBorn());

        if(t1 > t2)
            return -1;
        else if (t1 == t2)
            return 0;
        else
        { return +1;}
    }

    @Override
    public int compareTo(Object o) {

        Sportsman n = (Sportsman)o;

        int t1 = Integer.parseInt(this.getYearBorn());
        int t2 = Integer.parseInt(n.getYearBorn());

        if(t1 > t2)
            return 1;
        else if (t1 == t2)
            return 0;
        else
        { return -1;}
    }


}
