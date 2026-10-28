public class GoalKeeper2 {
    public static void main(String[] args) {
        int[] ourGoals = new int[28];
        System.out.println(ourGoals[5]); // goals scored in 6th game

        int[] theirGoals = new int[28];
        System.out.println(theirGoals);

        // game 1: we scored 3, they scored 1
        ourGoals[0] = 3;
        theirGoals[0] = 1;
        System.out.println("Game 1 result: Us " + ourGoals[0] + ", Them " + theirGoals[0]);
    }
}
