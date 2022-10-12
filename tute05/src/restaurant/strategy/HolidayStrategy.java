package restaurant.strategy;

import java.util.List;

import restaurant.Meal;

public class HolidayStrategy implements ChargingStrategy {
    private static final double CHARGE_RATE = 1.15;

    /**
    * The cost of a meal.
    */
    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        return order.stream().mapToDouble(meal -> meal.getCost() * 1.15).sum();
    }

    /**
     * Modifying factor of charges for standard customers.
     */
    @Override
    public double standardChargeModifier() {
        return HolidayStrategy.CHARGE_RATE;
    }
}
