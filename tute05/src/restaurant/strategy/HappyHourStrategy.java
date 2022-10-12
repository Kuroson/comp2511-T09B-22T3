package restaurant.strategy;

import java.util.List;

import restaurant.Meal;

public class HappyHourStrategy implements ChargingStrategy {
    private static final double CHARGE_RATE = 0.7;

    /**
    * The cost of a meal.
    */
    @Override
    public double cost(List<Meal> order, boolean payeeIsMember) {
        if (payeeIsMember) {
            return order.stream().mapToDouble(meal -> meal.getCost() * 0.6).sum();
        } else {
            return order.stream().mapToDouble(meal -> meal.getCost() * 0.7).sum();
        }
    }

    /**
     * Modifying factor of charges for standard customers.
     */
    @Override
    public double standardChargeModifier() {
        return HappyHourStrategy.CHARGE_RATE;
    }
}
