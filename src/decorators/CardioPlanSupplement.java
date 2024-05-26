package decorators;

import base.TrainingPlanSupplement;
import interfaces.TrainingPlan;

public class CardioPlanSupplement extends TrainingPlanSupplement {

    public CardioPlanSupplement(TrainingPlan extendedTrainingPlan) {
        super(extendedTrainingPlan);
        this.observers = getObservers();
    }

    @Override
    public void createTrainingPlan() {
        this.extendedTrainingPlan.createTrainingPlan();
        addCardio();
        setProgramDetailsMessage("Добавяне на допълнително кардио в тренировъчния ви режим");
    }

    @Override
    public void showFullTrainingPlan() {
        this.extendedTrainingPlan.showFullTrainingPlan();
        showCardio();
    }
    @Override
    public void removePartOfTrainingPlan(String partOfTrainingPlan) {
        this.extendedTrainingPlan.removePartOfTrainingPlan(partOfTrainingPlan);
        if(partOfTrainingPlan.equals("КАРДИО")){
            removeCardio();
            setProgramDetailsMessage("Премахване на кардио от вашата тренировка");
        }
    }

    private void addCardio() {
        System.out.println("Добавяне на КАРДИО към тренировъчната програма.");
    }
    private void removeCardio() {
        System.out.println("Премахване на КАРДИО от тренировъчната програма.");
    }
    private void showCardio() {
        System.out.println("Режим добавка: КАРДИО");
    }
}
