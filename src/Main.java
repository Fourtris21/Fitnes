import decorators.CardioPlanSupplement;
import decorators.StrengthPlanSupplement;
import interfaces.TrainingPlan;
import singleton.Fitness;
import utilities.MainTrainingPlan;
import utilities.Trainee;

public class Main {
    public static void main(String[] args) {
        Fitness fitness = Fitness.getInstance();
        MainTrainingPlan mainFitnessPlan = fitness.getMainTrainingPlan();

        Trainee tr1 = new Trainee("Alex", 8);
        Trainee tr2 = new Trainee("Bob", 7);
        Trainee tr3 = new Trainee("Charles", 6);
        Trainee tr4 = new Trainee("Dan", 5);

        mainFitnessPlan.createTrainingPlan();

        mainFitnessPlan.registerObserver(tr1);
        tr1.pay();
        mainFitnessPlan.registerObserver(tr2);
        tr2.pay();
        mainFitnessPlan.registerObserver(tr3);
        tr3.pay();
        mainFitnessPlan.registerObserver(tr4);
        tr4.pay();

        TrainingPlan cardio = new CardioPlanSupplement(mainFitnessPlan);
        TrainingPlan strength = new StrengthPlanSupplement(cardio);

        cardio.createTrainingPlan();
        cardio.removePartOfTrainingPlan("КАРДИО");
        strength.createTrainingPlan();
    }
}