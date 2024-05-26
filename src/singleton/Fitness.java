package singleton;
import utilities.MainTrainingPlan;
import context.PaymentsMethods;

public class Fitness {
    private static Fitness instance;
    private MainTrainingPlan mainTrainingPlan;
    private PaymentsMethods paymentsMethods;

    private Fitness() {
        this.mainTrainingPlan = new MainTrainingPlan();
        this.paymentsMethods = new PaymentsMethods();
    }

    public static Fitness getInstance() {
        if (instance == null) {
            instance = new Fitness();
        }
        return instance;
    }
    public MainTrainingPlan getMainTrainingPlan() {
        return mainTrainingPlan;
    }
}