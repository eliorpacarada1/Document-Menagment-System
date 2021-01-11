package com.example.demo.service;

import com.example.demo.model.Document;
import com.example.demo.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.util.Optional;
@Service
public class DocumentService {


    @Autowired
    private DocumentRepository repository;

    public Document getDocumentById(int documentId){
        Optional<Document> documentOptional= repository.findById(documentId);
        if(documentOptional == null)
            return null;

        return documentOptional.get();
    }
    public Document getDocumentByIDAndName(int id, String details){
        Document document = repository.findByDocumentIDAndAndDocumentDetails(id, details);
        return document;
    }
   /** public Document getDocumentByDetails(String details){
        Document document = repository.findByDocumentDetails(details);
        return document;
    }*/
}
