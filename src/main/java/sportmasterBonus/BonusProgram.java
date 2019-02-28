package sportmasterBonus;

public class BonusProgram {
    public int calculate(int currentPurchase, int totalPurchases) {

        if (totalPurchases <= 15_000) {
            return currentPurchase / 1000 * 50;
        } else if ((totalPurchases > 15_000) && (totalPurchases < 150_000)) {
            return currentPurchase / 1000 * 70;
        } else if (totalPurchases >= 15_0000) {
            return currentPurchase / 1000 * 100;

        }
        return currentPurchase;
    }
}



