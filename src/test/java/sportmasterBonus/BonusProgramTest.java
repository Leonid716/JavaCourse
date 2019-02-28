package sportmasterBonus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusProgramTest {

    @Test
    void calculate() {
        {
            BonusProgram program = new BonusProgram();
            int bonus = program.calculate(4_000,160_000);

            assertEquals(400,bonus);
        }

        {
            BonusProgram program = new BonusProgram();
            int bonus = program.calculate(10_000,10_000);

            assertEquals(500,bonus);
        }

        {
            Card card = new Card();
            int lvl = card.purchasesSum(160_000);

            assertEquals(160_000,lvl);
        }

        {
            Card card = new Card();
            int lvl = card.purchasesSum(17_000);

            assertEquals(17_000,lvl);
        }


    }
}