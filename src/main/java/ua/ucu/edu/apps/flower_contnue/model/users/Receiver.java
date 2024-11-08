package ua.ucu.edu.apps.flower_contnue.model.users;

public class Receiver extends AppUser implements User{
    @Override
    public void update(String status){
        if (status == null){
            this.setStatus("received");
        } else{
            this.setStatus(status);
        }
    }
}
