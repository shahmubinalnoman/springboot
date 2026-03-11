package com.example.SocialMedia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SocialMedia.entity.NoteTaking;
import com.example.SocialMedia.repository.noteSharingRepository;

@Service
public class NoteSharingService {
    @Autowired
   private noteSharingRepository noteSharingRepository;

   public String create(NoteTaking notetaking){
    if (notetaking != null) {
        noteSharingRepository.save(notetaking);
    }
    return "Note shared successfully";

   }

   public NoteTaking findById(long id){
    NoteTaking note = noteSharingRepository.findById(id).get();
    return note;
   }

    
}
