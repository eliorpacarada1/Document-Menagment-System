package com.example.demo.controller;


import com.example.demo.model.Document;
import com.example.demo.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/document")
public class DocumentController {

    @Autowired
    DocumentService service;


    @PostMapping("/addDocument")
    public Document addDocument(@RequestBody Document document){
        return service.saveDocument(document);
    }

    @GetMapping("/{documentid}")
    public ResponseEntity<Document> getDocument(@PathVariable int documentid) {
        Document document = service.getDocumentById(documentid);
        return ResponseEntity.ok(document);
    }

    @PostMapping("/id/{documentid}/details/{documentdetails}")
    public ResponseEntity<Document> getDoc(@PathVariable int documentid,@PathVariable String documentdetails){
        Document document = service.getDocumentByIDAndDetails(documentid, documentdetails);
        return ResponseEntity.ok(document);
    }





}

