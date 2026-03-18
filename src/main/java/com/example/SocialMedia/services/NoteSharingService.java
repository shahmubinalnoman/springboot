package com.example.SocialMedia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SocialMedia.entity.NoteTaking;
import com.example.SocialMedia.repository.NoteSharingRepository;

@Service
public class NoteSharingService {
    @Autowired
   private NoteSharingRepository noteSharingRepository;

   public String create(NoteTaking notetaking){
        noteSharingRepository.save(notetaking);
    return "Note shared successfully";

   }

   public NoteTaking findById(long id){
    NoteTaking note = noteSharingRepository.findById(id).get();
    return note;
   }

   
   public List<NoteTaking> findAll() {
       return noteSharingRepository.findAll();
   }
   

   public String deleteById(long id) {
       noteSharingRepository.deleteById(id);
       return "Note deleted successfully";
   }
}
