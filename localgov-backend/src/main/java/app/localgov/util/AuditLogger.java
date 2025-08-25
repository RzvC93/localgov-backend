package app.localgov.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Instant;

public class AuditLogger {

    private static final Logger logger = LoggerFactory.getLogger("com.localgov.audit");

    public static void log(String userId, String action, String resource, String status, String ip) {
        String json = String.format(
                "{\"timestamp\":\"%s\",\"user_id\":\"%s\",\"action\":\"%s\",\"resource\":\"%s\",\"status\":\"%s\",\"ip\":\"%s\"}",
                Instant.now().toString(),
                userId,
                action,
                resource,
                status,
                ip
        );
        logger.info(json);
    }
}
