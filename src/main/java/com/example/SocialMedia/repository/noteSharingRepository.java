package com.example.SocialMedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SocialMedia.entity.NoteTaking;


@Repository
public interface noteSharingRepository extends JpaRepository<NoteTaking, Long> {

    
}
