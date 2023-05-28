public abstract class Observer {
    private String name;

    public abstract void update();
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
