public class JwtRequest {
    private String token;

    public JwtResponse(String token) {
        this.token = token;
    }

    public String getToken() { return token; }
    
}