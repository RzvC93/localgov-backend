package app.localgov.legal.controller;

import app.localgov.legal.dto.ConsentDTO;
import app.localgov.legal.service.ConsentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/legal")
public class ConsentController {
    private final ConsentService consentService;

    public ConsentController(ConsentService consentService) {
        this.consentService = consentService;
    }

    @PostMapping("/consent")
    public ResponseEntity<Void> saveConsent(@RequestBody ConsentDTO consentDTO) {
        consentService.saveConsent(consentDTO);
        return ResponseEntity.ok().build();
    }
}
