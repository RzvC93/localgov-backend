package app.localgov.adapter.web;

import app.localgov.util.AuditLogger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAuditController {

    @GetMapping("/test-audit")
    public String testAudit() {
        AuditLogger.log("admin", "LOGIN", "dashboard", "success", "127.0.0.1");
        return "Audit log created.";
    }
}
