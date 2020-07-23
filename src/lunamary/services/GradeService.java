package lunamary.services;

import java.util.ArrayList;
import java.util.List;

public class GradeService extends SubjectObservable {
    private List<IObserver> observers;  // mas de un observador

    public GradeService() {
        observers = new ArrayList<IObserver>();
    }

    public void validateGrade(int grade) {
        // logica de validacion con el promedio setedo por el director
        String res = "test";
        if (res == "test") {
            notifyNow();
        } else {

            System.out.println("Congratulations!");
        }


    }

    public void joinObserver(IObserver o) {
        observers.add(o);
    }


    public void notifyNow() {
        for (IObserver o : observers) {
            o.update();
        }

    }

}
