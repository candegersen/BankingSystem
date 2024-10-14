import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import pojo.Checking;
import repository.AccountRepository;
import repository.CheckingService;

public class Main {
    public static void main(String[] args) {

        AccountRepository repository = new AccountRepository();
        CheckingService checkingService = new CheckingService(repository);
        CreditService creditService = new CreditService(repository);

        List<Account> accounts = Arrays.asList(
            
            new Checking('A1234B', new BigDecimal("500.000")),
            new Checking('A1234B', new BigDecimal("500.000")),
            new Checking('A1234B', new BigDecimal("500.000")),
            new Credit('A1234B', new BigDecimal("0.50")),
            new Credit('A1234B', new BigDecimal("500.000")),
        );

        accounts.forEach(account -> {
            repository.createAccount(account);
        });
        
        Checking checking = (Checking)repository.retrieveAccount("A1234B");
        checking.setBalance(checking.getBalance().add(new BigDecimal("100")));
        repository.updateAccount(checking);
        repository.deleteAccount(null);
    }
}