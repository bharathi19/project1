
/*public class continueDemo {
    public static void main(String args[]) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}*/
public class continueDemo {
    enum days
    {
        suday,
        monday,
        tuesday,
        wednesday,
        thursday,
        friday,
        saturday,
    }
    public static void main(String args[])
    {
        for(days d:days.values())
        {
            if(d.equals(days.wednesday)) {
                continue;
            }
            week(d);

        }
    }
    public static void week(days d)
    {
        if(d.equals(days.suday))
        {
            System.out.println(d+" is holiday");

        }


        else
        {
            System.out.println(d+" is working day");
        }
    }
}
