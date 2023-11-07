package lotto.domain;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private int money;
    private List<Lotto> lottos=new ArrayList<>();

    public Customer(String money){
        this.money=Integer.parseInt(money);
    }

    public void pay(){
        IssuingMachine issuingMachine=IssuingMachine.turnOn(money);
        lottos=issuingMachine.issueLotto();
    }

    public void validateMoney(){

    }

    public List<Lotto> getLottos(){
        return lottos;
    }
}
