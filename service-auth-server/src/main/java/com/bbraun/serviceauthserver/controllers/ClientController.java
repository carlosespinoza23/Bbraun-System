package com.bbraun.serviceauthserver.controllers;

import com.bbraun.serviceauthserver.models.dto.CreateClientDTO;
import com.bbraun.serviceauthserver.models.dto.MessageDTO;
import com.bbraun.serviceauthserver.service.ClientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
@RequiredArgsConstructor
@Slf4j
public class ClientController {

    private final ClientService clientService;


    @PostMapping("/create")
    public ResponseEntity<MessageDTO> create(@RequestBody CreateClientDTO dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(clientService.create(dto));
    }
}
