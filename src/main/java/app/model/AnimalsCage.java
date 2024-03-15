package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
    private Animal animal;
    @Autowired
    private Timer timer;
    public Timer getTimer() {
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        //System.out.println(new Timer().getTime());
        // он каждый раз создает новый объект класса Timer
        // и будет возвращать разное время, а нам нужно одинаковое
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }
}
