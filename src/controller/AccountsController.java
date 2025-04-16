package controller;

import java.util.List;

import model.entities.Account;
import model.readers.AccountReader;

public class AccountsController implements EntityController<Account> {
    public final static String FILE_NAME = "Accounts.csv";
    private AccountReader AccountReader;

    public AccountsController() {
        this.AccountReader = new AccountReader(FILE_NAME);
    }

    @Override
    public List<Account> getAllEntities() {
        AccountReader.read();
        return AccountReader.getAccounts();
    }
}
        