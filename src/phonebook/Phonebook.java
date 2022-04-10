package phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Phonebook {
    private List<Record> recordList = new ArrayList<>();
    private Record record;
    private Scanner scanner = new Scanner(System.in);

    public void fillThePhoneNumber() {
        while (true) {
            int yesOrNo = 0;
            System.out.println("Fill the phone number of the user: ");
            record.setPhoneNumber(scanner.next());
            while (yesOrNo != 1 || yesOrNo != 2) {
                System.out.println("Would you like to fill one more phone number?");
                System.out.println("1-yes, 2-no");
                yesOrNo = scanner.nextInt();
                if (yesOrNo == 1) {
                    break;
                } else if (yesOrNo == 2) {
                    return;
                } else {
                    if (yesOrNo != 1 || yesOrNo != 2) {
                        continue;
                    }
                }
            }
        }
    }

    public void add() {
        record = new Record();
        System.out.println("Fill the username: ");
        record.setUserName(scanner.next());
        fillThePhoneNumber();
        recordList.add(record);
        System.out.println("User has been added!");
    }

    public Record find(String searchUserName) {
        Record searchingRecord = null;
        for (Record record : recordList) {
            if (record.getUserName().contains(searchUserName)) {
                searchingRecord = record;
                break;
            } else {
                searchingRecord = null;
            }
        }
        return searchingRecord;
    }

    public List<Record> findAll(String searchUserName) {
        List<Record> searchingRecords = new ArrayList<>();
        for (Record record : recordList) {
            if (record.getUserName().contains(searchUserName)) {
                searchingRecords.add(record);
            } else {
                continue;
            }
        }
        return searchingRecords;
    }
}