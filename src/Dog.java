public class Dog extends Animal{//собака наследует Animal extends- добавляет

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void bark(){
        System.out.println("Im barking");
    }
}
