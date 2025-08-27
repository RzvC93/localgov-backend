package app.localgov.legal.service;

import app.localgov.legal.dto.ConsentDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ConsentService {
    private static final Logger log = LoggerFactory.getLogger(ConsentService.class);

    public void saveConsent(ConsentDTO consent) {
        log.info("Consent received: userId={}, preferences={}", consent.getUserId(), consent.getPreferences());
    }
}
