package InterfacePackage;

import javax.swing.plaf.PanelUI;

interface Memebers{
    void callBack();

}

class Store{
    Memebers mem[] = new Memebers[100];
    int count = 0 ;
    public void register(Memebers m){
        mem[count++] = m;
    }
    public void inviteSell(){
        for(int i = 0 ; i < count ; i++){
            mem[i].callBack();
        }
    }

}



class  Customer implements Memebers{
    String name;
    Customer(String n){
        name = n;
    }
    public void callBack(){
        System.out.println("Ok , I will visit" + name);
    }

}






public class CustomerDriver {
    public static void main(String[] args) {



    Store s = new Store();
    Customer c1 = new Customer(" John");
    Customer c2 = new Customer(" Khan");

    s.register(c1);
    s.register(c2);
    s.inviteSell();
}
}
