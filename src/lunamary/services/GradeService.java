package lunamary.services;

import java.util.ArrayList;
import java.util.List;

public class GradeService  {
    private List<IObserver> observers;  // mas de un observador

    public GradeService() {
        observers = new ArrayList<IObserver>();
    }

    public void validateGrade(int grade) {
        // logica de validacion con el promedio setedo por el director
        String res = "test";
        if (res == "test") {
        } else {

            System.out.println("Congratulations!");
        }


    }

    public void joinObserver(IObserver o) {
        observers.add(o);
    }




}
