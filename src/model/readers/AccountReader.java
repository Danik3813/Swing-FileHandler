package model.readers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import model.entities.Account;

public class AccountReader extends CSVReader {
    private List<Account> Accounts;

    public AccountReader(String FILE_NAME) {
        super(FILE_NAME);
        Accounts = new ArrayList<>();
    }

    @Override
    public void read() {
        try (BufferedReader AccountsReader = new BufferedReader(new FileReader(FILE_NAME))) {
            var AccountLine = AccountsReader.readLine();
            while((AccountLine = AccountsReader.readLine()) != null) {
                String[] CSVAccount = AccountLine.split(DELIMETER);
                // Добавить проверку на число элементов строки
                var Account = new Account(
                    Integer.parseInt(CSVAccount[0]),
                    Integer.parseInt(CSVAccount[1]),
                    Integer.parseInt(CSVAccount[2]),
                    CSVAccount[3],
                    CSVAccount[4]
                );
                Accounts.add(Account);
            }
        } catch(NumberFormatException e) {
            System.err.println(e.getMessage());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public List<Account> getAccounts() {
        return Accounts;
    }
}
