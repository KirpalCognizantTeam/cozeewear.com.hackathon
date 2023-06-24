package cozeewear.com.hackathon.services.impl;

import cozeewear.com.hackathon.model.Admin;
import cozeewear.com.hackathon.model.Employee;
import cozeewear.com.hackathon.repo.AdminRepo;
import cozeewear.com.hackathon.repo.EmployeeRepo;
import cozeewear.com.hackathon.services.UsersLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsersLoginServiceImpl implements UsersLoginService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private AdminRepo adminRepo;

    public boolean validateEmployee(String username, String password) {
        Optional<Employee> employeeUserName = employeeRepo.findById(username);
        System.out.println(employeeUserName);
        if (employeeUserName.isPresent()) {

            if (employeeUserName.get().getPassword().equals(password)) {
                return true;
            }

            return false;
        }

        return false;
    }


    public boolean validateAdmin(String username, String password) {

        Optional<Admin> adminUserName = adminRepo.findById(username);
        if (adminUserName.isPresent()) {

            if (adminUserName.get().getPassword().equals(password)) {
                return true;
            }

            return false;
        }

        return false;
    }

}
