package classes;

public abstract class Entity {
    public String name;
    public Entity()
    {
        this.name = "unknown";
    }
    public Entity(String name)
    {
        this.name = name;
    }
    public abstract void increment();
}
