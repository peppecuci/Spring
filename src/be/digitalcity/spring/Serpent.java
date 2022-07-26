package be.digitalcity.spring;

public class Serpent {

    private String name;

    public Serpent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Serpent{" +
                "name='" + name + '\'' +
                '}';
    }
}
