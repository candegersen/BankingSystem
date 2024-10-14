package pojo;

import java.math.BigDecimal;

public class Credit {
    public static void main(String[] args) {

    }
    
    public void setCredit(BigDecimal){
        this.credit = credit;
    }

    @Override
    public Account clone() {
        return new Credit(super.getId(), this.credit);
    }
}
