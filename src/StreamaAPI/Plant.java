/*
package StreamaAPI;


public class Plant {
    private String name;
    private String Vid;
    private int year;
    private int high;


    public Plant(String s, String ss, int i, int ii)
    {
        name = s;
        Vid = ss;
        year = i;
        high = ii;
    }


    public String getName() {return this.name;}
    public String getVid() {return Vid;}
    public int getYear() {return year;}
    public int getHigh() {return high;}


    public int compare(Plant p)
    {
        char []t1= name.toCharArray();
        char []t2 = p.getName().toCharArray();


        int s =0;
        if (name.length() > p.getName().length())s = p.getName().length();
        else s = name.length();


        for(int i = 0; i < s; i++)
        {
            if (t1[i] > t2[i])return -1;
            else if (t1[i] < t2[i]) return 1;
        }

        return 0;
    }

    @Override
    public String toString()
    {
        return " [Name->" +name+ " Vid->"  +Vid+ " Year->" +year+ " High->" +high+ "] \n";
    }

}
*/
