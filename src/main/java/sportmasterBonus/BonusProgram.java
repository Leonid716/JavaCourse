package sportmasterBonus;

public class BonusProgram {
    public int calculate(int currentPurchase, int totalPurchases) {

        if (totalPurchases > 0 && totalPurchases <= 15_000) {
            return currentPurchase / 1000 * 50;
        }
        if (totalPurchases > 15_000 && totalPurchases < 150_000) {
            return currentPurchase / 1000 * 70;
        }
        if (totalPurchases >= 150_000) {
            return currentPurchase / 1000 * 100;

        }
        return currentPurchase;
    }
}



