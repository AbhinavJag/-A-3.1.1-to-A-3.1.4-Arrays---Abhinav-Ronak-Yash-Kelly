public class Partners {
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday",
                         "Thursday", "Friday", "Saturday"};

        String[] partners = new String[7];
        System.out.println("Monday partner: " + partners[1]);

        // practice is Monday (1), Wednesday (3), and Friday (5)
        partners[1] = "Riya";
        partners[3] = "Marcus";
        partners[5] = "Ethan";

        System.out.println(days[1] + ": " + partners[1]);
        System.out.println(days[3] + ": " + partners[3]);
        System.out.println(days[5] + ": " + partners[5]);

        String[] friendPartners = partners;
        System.out.println("Friend on " + days[1] + ": " + friendPartners[1]);
        System.out.println("Friend on " + days[3] + ": " + friendPartners[3]);
        System.out.println("Friend on " + days[5] + ": " + friendPartners[5]);

        // partner change, only using the partners reference
        partners[3] = "Sofia";
        System.out.println("Friend on " + days[3] + " now: " + friendPartners[3]);
    }
}
