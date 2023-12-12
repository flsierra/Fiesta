package com.makaia.back4.JpaMySql.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class InicarFiestaConsumer {
    @RabbitListener(queues = {"iniciar_fiesta"})
    public void receiveIniciarFiesta(String process){
        System.out.println("La fiesta fué iniciada");
    }

}
