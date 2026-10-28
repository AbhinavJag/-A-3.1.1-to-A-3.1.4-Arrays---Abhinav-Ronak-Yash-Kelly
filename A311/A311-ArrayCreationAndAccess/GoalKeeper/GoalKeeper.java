public class GoalKeeper {
    public static void main(String[] args) {
        int[] goals = {1,2,0,3,2,4,2,1,0,2,0,1,3,2};
        System.out.println(goals);
        System.out.println("Goals in highest scoring game: " + goals[5]);

        goals[2] = 1;
        System.out.println("Game 3 goals: " + goals[2]);
    }
}
