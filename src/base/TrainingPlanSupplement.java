package base;

import interfaces.Subject;
import interfaces.TrainingPlan;

public abstract class TrainingPlanSupplement extends TrainingPlanBase implements TrainingPlan {
    protected TrainingPlan extendedTrainingPlan;

    public TrainingPlanSupplement(TrainingPlan extendedTrainingPlan) {
        this.extendedTrainingPlan = extendedTrainingPlan;
        this.observers = extendedTrainingPlan.getObservers();
    }

    @Override
    public void createTrainingPlan() {
        this.extendedTrainingPlan.createTrainingPlan();
    }

    @Override
    public void showFullTrainingPlan() {
        this.extendedTrainingPlan.showFullTrainingPlan();
    }

    @Override
    public void removePartOfTrainingPlan(String partOfTrainingPlan) {
        this.extendedTrainingPlan.removePartOfTrainingPlan(partOfTrainingPlan);
    }
}
