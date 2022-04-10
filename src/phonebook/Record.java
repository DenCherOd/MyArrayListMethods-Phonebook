package phonebook;

import java.util.ArrayList;
import java.util.List;

public class Record {
    private String userName;
    private List<String> phoneNumbers = new ArrayList<>();

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPhoneNumber(String phoneNumber) {
        phoneNumbers.add(phoneNumber);
    }

    @Override
    public String toString() {
        return "Record{" +
                "userName='" + userName + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}