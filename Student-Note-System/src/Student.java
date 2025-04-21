public class Student {
    private String name;
    private int registration;
    private int note;

    public Student(String name, int registration, int note){
        this.name = name;
        this.registration = registration;
        this.note = note;
    }
    public String getName(){
        return name;
    }
    public int getRegistration() {
        return registration;
    }

    public int getNote(){
        return note;
    }
    public void SetNote(int note){
        this.note = note;
    }
}
