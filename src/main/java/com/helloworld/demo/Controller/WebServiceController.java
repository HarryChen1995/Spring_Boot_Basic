package com.helloworld.demo.Controller;


import com.helloworld.demo.model.Model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.helloworld.demo.repository.UserRepository;
import com.helloworld.demo.model.RequestModel.RequestUser;
import com.helloworld.demo.model.Model.User;
@RestController
@RequestMapping(value = "/api")
public class WebServiceController {

    @Autowired 
    private  UserRepository userRepository;

    @RequestMapping(value="/createuser", method=RequestMethod.POST, produces = "application/json")
    public ResponseEntity<Message> requestMethodName(@RequestBody RequestUser requestUser) {
 
        Message message = new Message("Successfully Create User");
        User u = new User();
        u.setName(requestUser.getName());
        u.setEmail(requestUser.getEmail());
        userRepository.save(u);
        return ResponseEntity.ok(message);
    }
    
}
