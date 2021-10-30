package com.helloworld.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
public class Model {

    @Entity
    public static class User {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;

        private String name;
        private String email;
        public Integer getId(){
            return id;
        }
        public void setId(Integer id ){
            this.id = id ;
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }

        public String getEmail(){
            return email;
        }
        public void setEmail(String email){
            this.email = email;
        }
    }






    public static class Message {

    private String message;

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
  }
}