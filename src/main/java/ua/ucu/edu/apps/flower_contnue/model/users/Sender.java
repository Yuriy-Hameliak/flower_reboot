package ua.ucu.edu.apps.flower_contnue.model.users;

public class Sender extends AppUser implements User{
    @Override
    public void update(String status){
        if (status == null){
            this.setStatus("sended");
        } else{
            this.setStatus(status);
        }
    }
}
