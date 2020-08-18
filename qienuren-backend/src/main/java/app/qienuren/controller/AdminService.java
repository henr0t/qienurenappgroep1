package app.qienuren.controller;

import app.qienuren.model.Admin;

import app.qienuren.model.Gebruiker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdminService {
    @Autowired
    AdminRepository adminRepository;

    @Autowired
    GebruikerRepository gebruikerRepository;

    //@Autowired
    //TraineeRepository traineerepository;

    //public Trainee addTrainee(Trainee trainee){
        //return traineerepository.save(trainee);
    //}

    //public Iterable<Trainee> getAllTrainees(){
       // return traineerepository.findAll();
   // }

    public Admin addAdmin(Admin admin) {
            return adminRepository.save(admin);
        }
    }

