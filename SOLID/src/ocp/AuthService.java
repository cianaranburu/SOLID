package ocp;

import java.util.HashMap;
import java.util.Map;

public class AuthService {
    private Map<String, AuthAbstract> services = new HashMap<>();
    
    public AuthService() {
        services.put("facebook", new AuthFB());
        services.put("google", new AuthGoogle());
        services.put("twitter", new AuthTwitter());
        services.put("apple", new AuthApple());  // Apple zerbitzua gehitzea
    }
    
    public boolean signIn(String service, String log, String pass) {
    	AuthAbstract authService = services.get(service.toLowerCase());
        if (authService != null) {
            return authService.signIn(log, pass);
        }
        return false;
    }
}