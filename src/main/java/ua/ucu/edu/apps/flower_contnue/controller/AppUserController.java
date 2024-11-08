package ua.ucu.edu.apps.flower_contnue.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.ucu.edu.apps.flower_contnue.model.users.AppUser;
import ua.ucu.edu.apps.flower_contnue.service.AppUserService;

import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/v1/users")
public class AppUserController {

    private final AppUserService appUserService;

    @Autowired
    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @GetMapping
    public List<AppUser> getAppUsers() {
        return appUserService.getAppUsers();
    }
    @GetMapping("/email")
    public ResponseEntity<AppUser> getUserByEmail(@RequestParam String email) {
        AppUser userByEmail = appUserService.getUserByEmail(email);
        if (userByEmail != null){
            return ResponseEntity.ok(userByEmail);
        }
        return ResponseEntity.notFound().build();
    }
    

    @PostMapping
    public AppUser createAppUser(@RequestBody AppUser user) {
        return appUserService.addAppUser(user);
    }
}