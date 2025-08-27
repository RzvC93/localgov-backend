package app.localgov.legal.dto;

import java.util.Map;

public class ConsentDTO {
    private String userId;
    private Map<String, Boolean> preferences;

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public Map<String, Boolean> getPreferences() { return preferences; }
    public void setPreferences(Map<String, Boolean> preferences) { this.preferences = preferences; }
}
