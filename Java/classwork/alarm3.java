import java.util.*;

class Alarm3 {
    String message;
    private boolean active;
    ArrayList<String> regphone;

    Alarm3(){
        this.message="";
        this.active=false;
        regphone=new ArrayList<String>();
    }
    void register(String phoneno)
{
    regphone.add(phoneno);
    System.out.println("Your Phone number is Registered:" +phoneno);
}
    void visualise(){
        if(active)
        {
            System.out.println("Active");
        }
        else{
            System.out.println("Inactive");
        }

    }
    void activateAlarm(){
        this.active=true;
        visualise();
    }
    void deactivateAlarm(){
        this.active=false;
        visualise();
    }
}
    