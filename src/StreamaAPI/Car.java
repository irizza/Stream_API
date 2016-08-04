package StreamaAPI;


public class Car {
    private String brend;
    private String color;
    private int year;
    private int number;


    public void setBrend(String brend) {
        this.brend = brend;
    }

    public Car(String s, String ss, int i, int ii)
    {
        brend = s;
        color = ss;
        year = i;
        number = ii;

    }


    public String getBrend() {return this.brend;}
    public String getColor() {return color;}
    public int getYear() {return year;}
    public int getNumber() {return number;}


    public int compare(Car p)
    {
        char []t1= brend.toCharArray();
        char []t2 = p.getBrend().toCharArray();


        int s = 0;
        if (brend.length() > p.getBrend().length())s = p.getBrend().length();
        else s = brend.length();


        for(int i = 0; i < s; i++)
        {
            if (t1[i] > t2[i])return -1;
            else if (t1[i] < t2[i]) return 1;
        }

        return 0;
    }

    public boolean outOk(int inputValue)
    {
        if (this.getNumber() < inputValue || this.getNumber()%2 != 0)
            return false;
        else
            return true;
    }


    public boolean outOk2()
    {
        if ( this.getYear()%2 != 0)
            return true;
        else
            return false;
    }

    public boolean outOk3()
    {
        if ( this.getYear()%2 != 0)
            return false;
        else
            return true;
    }

    @Override
    public String toString()
    {
        return " [Name->" +brend+ " Vid->"  +color+ " Year->" +year+ " Serial_number->" +number+ "] \n";
    }



}
