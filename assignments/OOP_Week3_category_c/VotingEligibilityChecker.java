package OOP_Week3_category_c;

public class VotingEligibilityChecker {

    public void checkVotingEligibility(int age) {

        boolean eligible = age >= 18;

        if (eligible) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void main(String[] args) {

        VotingEligibilityChecker checker = new VotingEligibilityChecker();

        checker.checkVotingEligibility(20);
        checker.checkVotingEligibility(16);
    }
}