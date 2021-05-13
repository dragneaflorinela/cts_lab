package ro.ase.cts.seminar11.exempluACS.single;

import ro.ase.cts.seminar11.exempluACS.adapter.AdapterCont;
import ro.ase.cts.seminar11.exempluACS.adapter.BankAccount;
import ro.ase.cts.seminar11.exempluACS.factory.ContBancar;

public class Program {
    public static void main(String[] args) {
        SingleBanca singleBanca = SingleBanca.getInstance("BCR", "Centru");

        ContBancar contBancar1 = singleBanca.createInstance("CREDIT");

        ContBancar contBancar2 = singleBanca.createInstance("DEBIT");
        BankAccount bankAccount = new AdapterCont();
        System.out.println(SingleBanca.getNRCONTURI());


        ContBancar adapterCont = new AdapterCont();
        System.out.println(adapterCont);

        adapterCont.transfer(contBancar1, 200);
        System.out.println(adapterCont);

        adapterCont.depune(500);
        System.out.println(adapterCont);

        ((BankAccount) adapterCont).accountTransfer(bankAccount, 200);
        System.out.println(adapterCont);


    }
}
