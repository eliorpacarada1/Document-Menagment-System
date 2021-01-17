package com.example.demo.service;

import com.example.demo.model.Document;
import com.example.demo.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class DocumentService implements IDocumentService {


    @Autowired
    private DocumentRepository repository;

    public Document saveDocument(Document document){
        return repository.save(document);
    }
    /**
    public List<Document> saveDocuments(List<Document> documents){
        return repository.saveAll(documents);
    }
    public Document getDocumentByName(String name){
        return repository.findByName(name);
    }
    public String deleteDocumentById(int id){
        repository.deleteById(id);
        return "Document has been removed" + ", id: " + id;

    }*/

    public Document getDocumentById(int documentId){
        Optional<Document> documentOptional= repository.findById(documentId);
        if(documentOptional == null)
            return null;

        return documentOptional.get();
    }
    public Document getDocumentByIDAndDetails(int id, String details){
        Document document = repository.findByDocumentIDAndAndDocumentDetails(id, details);
        return document;
    }



}
