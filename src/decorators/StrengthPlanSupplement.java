package decorators;

import base.TrainingPlanSupplement;
import interfaces.TrainingPlan;

public class StrengthPlanSupplement extends TrainingPlanSupplement {
    public StrengthPlanSupplement(TrainingPlan extendedTrainingPlan) {
        super(extendedTrainingPlan);
    }

    @Override
    public void createTrainingPlan() {
        this.extendedTrainingPlan.createTrainingPlan();
        addStrength();
        setProgramDetailsMessage("Добавяне на допълнително силови тренировки в тренировъчния ви режим");
    }

    @Override
    public void showFullTrainingPlan() {
        this.extendedTrainingPlan.showFullTrainingPlan();
        showStrength();
    }
    @Override
    public void removePartOfTrainingPlan(String partOfTrainingPlan) {
        this.extendedTrainingPlan.removePartOfTrainingPlan(partOfTrainingPlan);
        if(partOfTrainingPlan.equals("СИЛОВА")){
            removeStrength();
            setProgramDetailsMessage("Премахване на силови упражнения от вашата тренировка");
        }
    }

    private void addStrength() {
        System.out.println("Добавяне на СИЛОВА тренировка към тренировъчната програма.");
    }
    private void removeStrength() {
        System.out.println("Премахване на СИЛОВА тренировка от тренировъчната програма.");
    }
    private void showStrength() {
        System.out.println("Режим добавка: СИЛОВА");
    }
}
