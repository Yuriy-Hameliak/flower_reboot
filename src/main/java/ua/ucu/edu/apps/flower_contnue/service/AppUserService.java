package ua.ucu.edu.apps.flower_contnue.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.ucu.edu.apps.flower_contnue.model.users.AppUser;
import ua.ucu.edu.apps.flower_contnue.repository.AppUserRepository;
@Service
public class AppUserService {
    
    private final AppUserRepository appUserRepository;

    @Autowired
    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    public List<AppUser> getAppUsers() {
        return appUserRepository.findAll();
    }

    public AppUser addAppUser(AppUser user) {
        return appUserRepository.save(user);
    }
    public AppUser getUserByEmail(String email){
        return appUserRepository.findUserByEmail(email);
    }
}
