package sportmasterBonus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusProgramTest {

    @Test
    public void calculateBonus() {
        BonusProgram program = new BonusProgram();
        int bonus = program.calculate(4_000, 160_000);

        assertEquals(400, bonus);
    }

    {
        BonusProgram program = new BonusProgram();
        int bonus = program.calculate(22_000, 14_000);

        assertEquals(1100, bonus);
    }


    @Test
    public void calculateCardLvl() {
        Card card = new Card();
        int lvl = card.purchasesSum(160_000);

        assertEquals(160_000, lvl);
    }
}
