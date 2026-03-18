package com.example.SocialMedia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SocialMedia.entity.NoteTaking;
import com.example.SocialMedia.services.NoteSharingService;

@RestController
public class NoteSharingController {

    @Autowired
    private NoteSharingService noteSharingService;

    @PostMapping("/create")
    public String create(@RequestBody NoteTaking noteTaking) {
        noteSharingService.create(noteTaking);
        return "success";
    }

    @GetMapping("/findId")
    public NoteTaking findById(@RequestParam Long id)
    {
        return noteSharingService.findById(id);
    }

    @GetMapping("/findAll")
    public List<NoteTaking> findAll() {
        return noteSharingService.findAll();
    }

    @GetMapping("/delete")
    public String deleteById(@RequestParam Long id)
    {
       return noteSharingService.deleteById(id);        
    }
}
