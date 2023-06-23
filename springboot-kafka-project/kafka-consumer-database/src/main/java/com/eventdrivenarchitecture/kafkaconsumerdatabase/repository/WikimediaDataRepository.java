package com.eventdrivenarchitecture.kafkaconsumerdatabase.repository;

import com.eventdrivenarchitecture.kafkaconsumerdatabase.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData,Long> {

}
