package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.jws.*;

import metier.Account;

@WebService
public class BankService {
    @WebMethod
    public double xofToEuro(@WebParam(name = "amount")double amount) 
    {    
        return amount / 654.91;
    }

    @WebMethod
    public double euroToXof(@WebParam(name = "amount")double amount) 
    {    
        return amount * 654.91;
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
