package peaksoft;

import org.springframework.stereotype.Component;

@Component("dogId")
public class Dog implements Pet{

    public Dog(){
        System.out.println("Bean Dog id created");
    }

    @Override
    public void say() {
        System.out.println("Gav-gav");
    }
    public void init(){
        System.out.println("Class Dog : init method");
    }

    public void destroy(){
        System.out.println("Class Dog : destroy method");
    }
}
