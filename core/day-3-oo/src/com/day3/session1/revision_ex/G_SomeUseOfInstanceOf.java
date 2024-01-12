package com.day3.session1.revision_ex;
interface Animale{
    void sound();
}
class Cat implements Animale{
   public void sound(){
        System.out.println("sound of cat");
    }
}
class Dog implements Animale{
    public void sound(){
        System.out.println("sound of Dog");
    }
    public void nightWatchManShip(){
        System.out.println("jagta raho");
    }
}
public class G_SomeUseOfInstanceOf {
    public static void main(String[] args) {

        Animale []animales={new Cat(),new Dog(),new Cat(),new Dog()};

        for(Animale animale:animales){
            animale.sound();
            if(animale instanceof Dog) {
                Dog dog= (Dog) animale;
                dog.nightWatchManShip();
            }

        }
    }
}
