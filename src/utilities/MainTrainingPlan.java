package utilities;

import base.TrainingPlanBase;
import interfaces.TrainingPlan;

public class MainTrainingPlan extends TrainingPlanBase implements TrainingPlan {
    private Boolean isCreated;
    public MainTrainingPlan() {
        isCreated = false;
    }
    @Override
    public void createTrainingPlan() {
        if(!isCreated)
            System.out.println("Създаване на основен тренировъчен режим.");
        isCreated = true;
    }

    @Override
    public void showFullTrainingPlan() {
        System.out.println("Режим: ЗАГРЯВКА");
    }

    @Override
    public void removePartOfTrainingPlan(String partOfTrainingPlan) {
        if(partOfTrainingPlan == "ЗАГРЯВКА"){
            System.out.println("ЗАГРЯВКАТА не може да бъде премахната!");
        }
    }
}
