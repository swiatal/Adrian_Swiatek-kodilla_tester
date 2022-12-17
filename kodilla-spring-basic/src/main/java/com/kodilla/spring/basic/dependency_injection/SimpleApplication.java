package com.kodilla.spring.basic.dependency_injection;

import com.kodilla.spring.basic.dependecy_injection.MessageService;
import org.springframework.stereotype.Component;

@Component
public class SimpleApplication {
  //  @Autowired
    //private SkypeMessageService messageService;
    private MessageService messageService;

    //@Autowired
    //public void setMessageService(SkypeMessageService messageService) {
        //this.messageService = messageService;
    //}
    //public SimpleApplication(SkypeMessageService messageService) {
    //this.messageService = messageService;
    //}

    public SimpleApplication(MessageService messageService) {
        this.messageService = messageService;
        }
        public void processMessage(String message, String receiver) {
        if (checkReceiver(receiver)) {
            this.messageService.send(message, receiver);
        }
    }
    private boolean checkReceiver(String receiver) {
        return receiver != null && !receiver.isEmpty();
    }
}

