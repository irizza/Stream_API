package StreamaAPI;



public class Pictures {
    private String picture_name;
    private int year;
    private int price;



        public Pictures(String s, int i, int ii)
        {
            picture_name = s;
            year = i;
            price = ii;
        }


    public String getPicture_name() {return picture_name;}
    /*  public String getPicture_name() {return this.brend;}
        public String getPrice() {return color;}*/
        public int getYear() {return year;}
    public int getPrice() {return price;}



        public int compare(Pictures p)
        {
            char []t1= picture_name.toCharArray();
            char []t2 = p.getPicture_name().toCharArray();


            int s =0;
            if (picture_name.length() > p.getPicture_name().length())s = p.getPicture_name().length();
            else s = picture_name.length();


            for(int i = 0; i < s; i++)
            {
                if (t1[i] > t2[i])return -1;
                else if (t1[i] < t2[i]) return 1;
            }

            return 0;
        }

        public boolean outOk(int inputValue)
        {
            if (this.getPrice() < inputValue || this.getPrice()%2 != 0)
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
            return " [Picture_Name->" +picture_name+ " Price->"  +price+ " Year->" +year+ " ] \n";
        }



}



