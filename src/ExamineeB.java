public class ExamineeB extends Examinee {
    public ExamineeB(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    public static final String Math = "Math";
    public static final String Chemistry = "Chemistry";
    public static final String Biology = "Biology";

    @Override
    public String toString() {
        return "ExamineeB{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority + ", Subject: " + Math + " - " + Biology + " - " + Chemistry +
                '}';
    }
}
