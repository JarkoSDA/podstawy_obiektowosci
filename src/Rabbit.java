public class Rabbit {
    private int lenght;
    private String name;
    private boolean softness;

    Rabbit(int lenght, String name, boolean softness ){
        this.lenght = lenght;
        this.name = name;
        this.softness = softness;
    }
    public void changeName(String name){
        this.name = name;

    }
    public String viewName(){
        return name;
    }
    public void changeSoftness(boolean softness) {
        this.softness = softness;
    }
    public boolean viewSoftness(){
        return softness;
    }
}
