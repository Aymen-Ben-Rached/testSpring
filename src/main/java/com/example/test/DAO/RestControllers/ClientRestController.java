package com.example.test.DAO.RestControllers;

import com.example.test.DAO.Entities.Client;
import com.example.test.DAO.Services.IClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("client")
@RestController
@AllArgsConstructor
public class ClientRestController {
    IClientService iClientService;
    @PostMapping("ajouterClient")
    public Client addBloc(@RequestBody Client client) {
        return iClientService.ajouterClient(client);
    }

}
