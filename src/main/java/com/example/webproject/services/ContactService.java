package com.example.webproject.services;

import com.example.webproject.controller.ContactController;
import com.example.webproject.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Slf4j
@Service
public class ContactService {
   // private static Logger log = LoggerFactory.getLogger(ContactService.class);
    public boolean saveMessageDetails(Contact contact){
        boolean isSaved = true;
        log.info(contact.toString());
    return isSaved;
    }
}
