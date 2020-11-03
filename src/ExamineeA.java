public class ExamineeA extends Examinee {

    public static final String Math = "Math";
    public static final String Physic = "Physic";
    public static final String Chemistry = "Chemistry";
    public ExamineeA(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "ExamineeA{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority + ", Subject: " + Math + " - " + Physic + " - " + Chemistry +
                '}';
    }


}