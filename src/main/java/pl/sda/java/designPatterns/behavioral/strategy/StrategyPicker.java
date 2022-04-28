package pl.sda.java.designPatterns.behavioral.strategy;

import java.time.LocalDate;
import java.time.Month;

public class StrategyPicker {

    private static Discounter discounter;

    public static Discounter chooseDiscounter(LocalDate date){

        Month month = date.getMonth();

        if (month.equals(Month.DECEMBER)) {
            discounter = new ChristmassDiscounter();
        } else if (month.equals(Month.MARCH) || month.equals(Month.APRIL)) {
            discounter = new EasternDiscounter();
        } else {
            discounter = new DefaultDiscounter();
        }

        return discounter;
    }

}
