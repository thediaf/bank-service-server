package metier;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.*;

/**
 * Accountb
 */
@XmlRootElement	
public class Account implements Serializable 
{
    protected long code;
    protected double balance;
    protected Date createdAt;

    public Account() {
        super();
    }

    public Account(long code, double balance, Date createdAt)
    {
        super();
        this.setCode(code);
        this.setBalance(balance);
        this.setCreatedAt(createdAt);
    }
    
    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    
}
