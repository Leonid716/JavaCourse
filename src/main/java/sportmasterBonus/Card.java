package sportmasterBonus;

public class Card {
    public int purchasesSum(int sum) {

        if (sum < 15_000)
            System.out.println("Standart card");

        if ((sum > 15_000) && (sum < 150_000))
            System.out.println("Silver card");

        if (sum > 150_000)
            System.out.println("Gold card");

        return sum;
    }
}
