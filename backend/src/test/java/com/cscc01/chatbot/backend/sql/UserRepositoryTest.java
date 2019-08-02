package com.cscc01.chatbot.backend.sql;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import com.cscc01.chatbot.backend.model.User;
import com.cscc01.chatbot.backend.sql.repositories.UserRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@Transactional
@DataJpaTest
@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.NONE)
public class UserRepositoryTest {
     
    @Autowired
    private UserRepository userRepository;
     
    @Test
    public void givenUser_whenSave_thenGetOk() {
        User user1 = new User();
        user1.setUsername("test");
        userRepository.save(user1);
         
        User user2 = userRepository.findByUsername("test");
        assertEquals("test", user2.getUsername());
    }

         
    @Test
    public void givenUser_whenSave_thenGetAllOk() {
        User user1 = new User();
        user1.setUsername("test");
        userRepository.save(user1);
         
        User user2 = userRepository.findAll().iterator().next();
        assertEquals("test", user2.getUsername());
    }

    @Test
    public void givenUser_whenSave_thenDelete() {
        User user1 = new User();
        user1.setUsername("test");
        userRepository.save(user1);
        userRepository.delete(user1);
        
        assertFalse(userRepository.findAll().iterator().hasNext());
    }
}
