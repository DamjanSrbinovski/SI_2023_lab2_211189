package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SILab2Test {

    User user1 = new User("damjan_srbinovski@live.com","Damjan123123%","damjan_srbinovski@live.com");
    User user2 = new User("Bozo","Bozhidar123%","damjan_srbinovski@live.com");
    User user3 = new User("Mihael","Mihael123123%","damjan_srbinovski@live.com");

    private List<User> userList (User ... users){
        return new ArrayList<User>(Arrays.asList(users));
    }



    @Test
    void everyStatement1Test() {
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, ()-> SILab2.function(new User(null,null,null), userList(user1,user2,user3)));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
    }
    @Test
    void everyStatement2Test(){
        User user = new User(null, "xxxxx","damjan_srbinovski@live.com");
        List<User> userList = userList(user1,user2,user3);

        boolean result = SILab2.function(user, userList);

        assertFalse(result);
    }
    @Test
    void everyStatement3Test(){
        User user = new User(null, "damjan123*","damjan_srbinovski@live.com");
        List<User> userList = userList(user1,user2,user3);

        boolean result = SILab2.function(user, userList);

        assertFalse(result);
    }
    @Test
    void everyStatement4Test(){
        User user = new User(null, "damjan123123","damjan_srbinovski@live.com");
        List<User> userList = userList(user1,user2,user3);

        boolean result = SILab2.function(user, userList);

        assertFalse(result);
    }
    @Test
    void multipleConditionTest1(){
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, ()-> SILab2.function(new User(null,null,"damjan_srbinovski@live.com"), userList(user1,user2,user3)));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        ex = assertThrows(RuntimeException.class, ()-> SILab2.function(new User(null,"xxxxx",null), userList(user1,user2,user3)));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        ex = assertThrows(RuntimeException.class, ()-> SILab2.function(new User(null,null,"damjan_srbinovski@live.com"), userList(user1,user2,user3)));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
    }
    @Test
    void multipleConditionTest2(){
        User user = new User(null, "xxxxx","damjan_srbinovski@live.com");
        List<User> userList = userList(user1,user2,user3);

        boolean result = SILab2.function(user, userList);

        assertFalse(result);
    }
    @Test
    void multipleConditionTest3(){
        User user = new User(null, "damjan 12343","damjan_srbinovski@live.com");
        List<User> userList = userList(user1,user2,user3);

        boolean result = SILab2.function(user, userList);

        assertFalse(result);
    }
}
