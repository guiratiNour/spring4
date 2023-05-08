package com.nour.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nour.demo.entities.Album;

public interface AlbumRepository extends JpaRepository<Album, Long> {

}
