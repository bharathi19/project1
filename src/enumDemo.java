
public class enumDemo {
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
