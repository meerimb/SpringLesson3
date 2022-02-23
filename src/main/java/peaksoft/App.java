package peaksoft;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(MyConfig.class);
        Person person=context.getBean("person",Person.class);
        person.callYourPet();
        System.out.println(person.getName());
        System.out.println(person.getAge());




//        ClassPathXmlApplicationContext context=
//                new ClassPathXmlApplicationContext("applicationContext2.xml");
//
//        Person person=context.getBean("person",Person.class);
//        System.out.println(person.getName());
//        System.out.println(person.getAge());
//        person.callYourPet();


//        Pet pet=new Dog();
//        Person person1=new Person(pet);
//        person1.callYourPet();

//        Pet pet=context.getBean("myPet",Pet.class);
//        pet.say();

//        Dog myDog=context.getBean("dogId",Dog.class);
//        myDog.say();
//
//        Dog yourDog=context.getBean("myPet",Dog.class);
//        Dog yourDogDog=context.getBean("myPet",Dog.class);
//
//        System.out.println("Ссылаются ди один и тот же объект :"+(myDog==yourDog));
//        System.out.println(myDog);
//        System.out.println(yourDog);
//        System.out.println(yourDogDog);

        context.close();
    }
}
