package com.example.demo.repository;

import com.example.demo.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DocumentRepository extends JpaRepository<Document, Integer> {
    @Query("select d from Document d where d.DocumentID=?1 and d.DocumentDetails=?2")
    Document findByDocumentIDAndAndDocumentDetails(int id, String details);


    //Document findByDocumentDetails(String details);


}
