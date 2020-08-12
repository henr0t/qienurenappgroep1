package app.qienuren.rest;

import app.qienuren.controller.MedewerkerService;
import app.qienuren.model.Medewerker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/medewerker")
public class MedewerkerEndpoint {

    @Autowired
    MedewerkerService medewerkerService;

    @PostMapping("/new")
    public Medewerker addMedewerker(@RequestBody Medewerker medewerker) {
        return medewerkerService.addMedewerker(medewerker);
    }

    @GetMapping("/all")
    public Iterable<Medewerker> getMedewerkers(){
        return medewerkerService.getAllMedewerkers();
    }

    @PutMapping("/rol/{id}")
    public Medewerker naarMedewerkerVeranderen(@PathVariable(value = "id") long id) {
        return ms.naarMedewerkerVeranderen(id);
    }
}
