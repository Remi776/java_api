//1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
//        а) информационной системой ветеринарной клиники

package seminar6.task;

import java.util.Objects;

public class Cat {
    public int age;
    public String name;
    public boolean illness;
    public String diagnosis;
    public Owner owner;

    public Cat(int age, String name, boolean illness, String diagnosis, Owner owner) {
        this.age = age;
        this.name = name;
        this.illness = illness;
        this.diagnosis = diagnosis;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return String.format("{age: %s, name: %s, illness: %s, diagnosis: %s, owner: %s}", age, name, illness, diagnosis, owner);
    }

    @Override
    public boolean equals(Object obj) {
        Cat cat = (Cat) obj;
        return cat.name.equals(this.name) && cat.age == this.age
                && cat.diagnosis.equals(this.diagnosis) && cat.illness == this.illness;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        result = prime * result + ((diagnosis == null) ? 0 : diagnosis.hashCode());
        return result;
    }
}
