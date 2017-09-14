/*
public class BreakDemo {
    public static void main(String args[]) {
        int number[] = {10, 20, 30, 40, 50};
        for (int i : number) {
            if (i == 40) {
                break;
            }
            System.out.println(i);
        }
    }
}*/

public class BreakDemo {
    enum days {
        suday,
        monday,
        tuesday,
        wednesday,
        thursday,
        friday,
        saturday,
    }

    public static void main(String args[]) {
        for (days d : days.values()) {
            if(d.equals(days.thursday))
            {
                break;
            }
            week(d);
        }
    }

    public static void week(days d) {
        if (d.equals(days.suday)) {
            System.out.println(d + " is holiday");

        } else {
            System.out.println(d + " is working day");
        }
    }
}
