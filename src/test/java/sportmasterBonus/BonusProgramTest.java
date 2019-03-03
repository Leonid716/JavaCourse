package sportmasterBonus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusProgramTest {

    @Test
    public void calculateBonusBlue() {
        BonusProgram program = new BonusProgram();
        int bonus = program.calculate(22_000, 14_000);

        assertEquals(1100, bonus);
    }


    @Test
    public void calculateBonusSilver() {
        BonusProgram program = new BonusProgram();
        int bonus = program.calculate(22_000, 18_000);

        assertEquals(1540, bonus);
    }


    @Test
    public void calculateBonusGold() {
        BonusProgram program = new BonusProgram();
        int bonus = program.calculate(22_000, 160_000);

        assertEquals(2200, bonus);
    }

    @Test
    public void calculateBonusZero() {
        BonusProgram program = new BonusProgram();
        int bonus = program.calculate(0, 0);

        assertEquals(0, bonus);
    }

}
