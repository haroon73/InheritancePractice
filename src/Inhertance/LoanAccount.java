package Inhertance;

import Inhertance.Account;

public class LoanAccount extends Account {



    public void payEmi(double bala){
        balance -= bala;
    }
    public  void repay(double bala){
       if(balance == bala){
           balance =0;
       }
    }

}
