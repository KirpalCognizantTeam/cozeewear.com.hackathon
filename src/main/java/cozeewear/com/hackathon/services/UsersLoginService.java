package cozeewear.com.hackathon.services;

public interface UsersLoginService {

    public boolean validateEmployee(String username, String password);
    public boolean validateAdmin(String username, String password);
}
