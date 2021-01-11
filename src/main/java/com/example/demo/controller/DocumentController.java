package com.example.demo.controller;


import com.example.demo.model.Document;
import com.example.demo.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/document")
public class DocumentController {

    @Autowired
    DocumentService documentService;

    @GetMapping("/{documentid}")
    public ResponseEntity<Document> getDocument(@PathVariable int documentid) {
        Document document = documentService.getDocumentById(documentid);
        return ResponseEntity.ok(document);
    }

    @GetMapping("/id/{documentid}/details/{documentdetails}")
    public ResponseEntity<Document> getByDocumentIDAndAndDocumentDetails(@PathVariable int documentid,@PathVariable String documentdetails){
        Document document = documentService.getDocumentByIDAndName(documentid, documentdetails);
        return ResponseEntity.ok(document);
    }

    /**@GetMapping("/details{documentdetails}")
    public ResponseEntity<Document> getDocumentByDetails(@PathVariable String documentdetails){
        Document document = documentService.getDocumentByDetails(documentdetails);
        return ResponseEntity.ok(document);
    }**/
}

