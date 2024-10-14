package repository;

import repository.AccountRepository;

public class CheckingService {

    AccountRepository accountRepository = new AccountRepository();

    public CheckingService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public createAccount(Checking account){
        this.datastore.put(account.getId(), account.clone());
    }

    public Account retrievedAccount(String id) {

        return (Checking)this.accountRepository.retrieveAccount(id);
    }
    
    public void updateAccount(Account account) {
        this.datastore.put(account.getId(), account.clone());
    }

    public void deleteAccount(String id) {
        this.datastore.remove(id);
    }

}
