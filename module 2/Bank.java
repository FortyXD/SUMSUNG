package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    }
}

class Human{
    String service;
    int TalonID;
    boolean IsBusy;
    public Human(String service , int TalonID ,boolean IsBusy){
        this.service = service;
        this.TalonID = TalonID;
        this.IsBusy = IsBusy;
    }
}
class Manager{
    Boolean isBusy;
    Human humBusy;
    int IDuser;
    public Manager(){
        isBusy= false;
        IDuser=0;
        humBusy= null;
    }
}

class Table{
    ArrayList<Human> Users = new ArrayList<Human>();
    ArrayList<Manager> Managers = new ArrayList<Manager>();

    void Print(){
//        Тут Вывод
    }
    void managerAdd(){
        Managers.add(new Manager());
    }

    void userAdd(String service, int Id , boolean IsBusy){
        Users.add(new Human(service , Id , IsBusy ));
    }
    void RemoveUserFromManager( Manager a){
    Users.remove(a.IDuser);
    a.isBusy=false;
    }
    void ComingUser( Manager a){
        for(int i=0; i<Users.size(); i++){
            if(Users.get(i).IsBusy==false){
                a.humBusy = Users.get(i);
                a.isBusy= true;
                Users.get(i).IsBusy=true;
                Users.get(i).TalonID=i;
            }
        }
    }

}
