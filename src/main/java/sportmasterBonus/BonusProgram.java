package sportmasterBonus;

public class BonusProgram {
    public int calculate(int currentPurchase, int totalPurchases) {

        int bonusForEveryThousand = currentPurchase / 1000;

        if (totalPurchases > 0 && totalPurchases <= 15_000) {
            return bonusForEveryThousand * 50;
        }
        if (totalPurchases > 15_000 && totalPurchases < 150_000) {
            return bonusForEveryThousand * 70;
        }
        if (totalPurchases >= 150_000) {
            return bonusForEveryThousand * 100;

        }
        return 0;
    }
}



