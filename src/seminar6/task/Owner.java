package seminar6.task;

public class Owner {
    public String fullName;
    public String phone;
    public Owner(String fullName, String phone) {
        this.fullName = fullName;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format("owner: %s, phone: %s", fullName, phone);
    }
}
