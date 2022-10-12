package restaurant.strategy;

import java.util.List;

import restaurant.Meal;

public class StandardStrategy implements ChargingStrategy {
    private static final double CHARGE_RATE = 1.0;

    /**
     * The cost of a meal.
     */
    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        return order.stream().mapToDouble(meal -> meal.getCost()).sum();
    }

    /**
     * Modifying factor of charges for standard customers.
     */
    @Override
    public double standardChargeModifier() {
        return StandardStrategy.CHARGE_RATE;
    }
}
