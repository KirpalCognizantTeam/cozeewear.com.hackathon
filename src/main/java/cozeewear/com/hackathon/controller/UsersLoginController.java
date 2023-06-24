package cozeewear.com.hackathon.controller;

import cozeewear.com.hackathon.services.UsersLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsersLoginController {

    @Autowired
    private UsersLoginService usersLoginService;


    @PostMapping("/validateEmployee/{username}/{password}")
    @ResponseBody
    public ResponseEntity validateEmployee(@PathVariable() String username,@PathVariable() String password) {

        if(usersLoginService.validateEmployee(username, password)) {
            return new ResponseEntity(HttpStatus.OK);
        }

        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/validateAdmin/{username}/{password}")
    @ResponseBody
    public ResponseEntity validateAdmin(@PathVariable String username,@PathVariable String password) {
        if(usersLoginService.validateAdmin(username, password)) {
            return new ResponseEntity(HttpStatus.OK);
        }

        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }
}
