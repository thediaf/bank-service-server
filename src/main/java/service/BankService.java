package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.jws.*;

import metier.Account;

@WebService(name="BankWS")
public class BankService {
    @WebMethod
    public double conversion(@WebParam double amount) {
        return amount * 11.3;
    }

    @WebMethod
    public Account getAccount(@WebParam Long code) {
        return new Account(code, Math.random()*80000, new Date());
    }

    @WebMethod
    public List<Account> getAccounts() {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(1L, Math.random()*80000, new Date()));
        accounts.add(new Account(2L, Math.random()*80000, new Date()));
        
        return accounts;
    }    
}
