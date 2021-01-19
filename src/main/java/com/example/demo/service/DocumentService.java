package com.example.demo.service;

import com.example.demo.model.Document;
import com.example.demo.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.util.List;
import java.util.Optional;
@Service
public class DocumentService implements IDocumentService {


    @Autowired
    private DocumentRepository repository;

    public Document saveDocument(Document document){
        return repository.save(document);
    }

    public List<Document> saveDocuments(List<Document> documents){
        return repository.saveAll(documents);
    }

    public List<Document> getAllDocuments(){
        return repository.findAll();
    }
    public String deleteDocumentById(int id){
        repository.deleteById(id);
        return "Document has been removed" + ", id: " + id;

    }

    public Document getDocumentById(int documentId){
        return repository.findById(documentId).orElse(null);
    }
    public Document getDocumentByIDAndDetails(int id, String details){
        Document document = repository.findByDocumentIDAndAndDocumentDetails(id, details);
        return document;
    }




}
