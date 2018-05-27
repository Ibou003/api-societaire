package api.iard.societaire.controler;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import api.iard.societaire.model.AdresseSocietaire;
import api.iard.societaire.model.Societaire;
import api.iard.societaire.repository.SocietaireRepository;
import api.iard.societaire.service.SocietaireService;

@RestController
@RequestMapping("/iard/societaires/v1/societaire")
@Api(value="Societaire Endepoints", description="Ressource Societaire ")
public class SocietaireControler {

    @Autowired
    public SocietaireRepository societaireRepository;

    @Autowired
    public SocietaireService societaireService;

    // recupper les données d'un societaire
    @GetMapping("/{numeroSocietaire}")
    public Societaire getSocietaire(@PathVariable Long numeroSocietaire) {
        return societaireRepository.findByNumeroSocietaire(numeroSocietaire);
    }

    // post une nouvelle données societaire
    @PostMapping("/me")
    public Societaire newSocietaire(@RequestBody Societaire societaire) {
        return this.societaireService.addSocietaire(societaire);
    }

    // PUT: Modification du Sociétaire (Endpoint d’accès par NSOC)
    @PutMapping("/{numeroSocietaire}")
    public Societaire modicationSocietaire(@RequestParam Long numeroSocietaire, @RequestBody Societaire societaire) {
        return societaireService.modicationSocietaire(numeroSocietaire, societaire);
    }

    // PUT: Modification de l'adresse du Sociétaire (Endpoint d’accès par NSOC)
    @PutMapping("/{numeroSocietaire}/adresse")
    public Societaire modicationSocietaire(@PathVariable Long numeroSocietaire, @RequestBody AdresseSocietaire adresseSocietaire) {
        return societaireService.modificationAdresseSocietaire(numeroSocietaire, adresseSocietaire);
    }
    @ApiOperation(value="Return hello Word")
    @ApiResponses(
    		value = {
    				@ApiResponse(code =100, message = "100 is the message"),
    				@ApiResponse(code =200, message = "Sucessfull hello word ! ")
    		}
    )
    @GetMapping("/hello")
    public String getHello() {
        return "Hello World";
    }

}
