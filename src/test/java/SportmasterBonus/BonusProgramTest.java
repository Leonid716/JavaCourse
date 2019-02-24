package SportmasterBonus;

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
            Card card = new Card();
            int lvl = card.purchasesSum(160_000);

            assertEquals(160_000,lvl);

        }


    }
}