package com.example.demo.controller;


import com.example.demo.model.Document;
import com.example.demo.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/document")
public class DocumentController {

    @Autowired
    DocumentService service;

    //The @ResponseBody annotation tells a controller that the object returned is automatically serialized into JSON,
    // and passed back into the HttpResponse object.
    @PostMapping("/addDocument")
    public Document addDocument(@RequestBody Document document){
        return service.saveDocument(document);
    }

    @PostMapping("/addDocuments")
    public List<Document> addDocuments(@RequestBody List<Document> documents){
        return service.saveDocuments(documents);
    }
    @GetMapping("/getAll")
    public List <Document> getAllDocuments(){
        return service.getAllDocuments();
    }

    @GetMapping("/{documentid}")
    public Document getDocumentByID(@PathVariable int documentid){
        return service.getDocumentById(documentid);
    }

    @GetMapping("/id/{documentid}/details/{documentdetails}")
    public Document getDocumentByIdAndDetails(@PathVariable int documentid, @PathVariable String documentdetails){
        return service.getDocumentByIDAndDetails(documentid, documentdetails);
    }
    @DeleteMapping("/deleteDocument/{documentid}")
    public String deleteDocument(@PathVariable int documentid){
        return service.deleteDocumentById(documentid);
    }
    @PutMapping("/updateDocument")
    public Document updateDocument(@RequestBody Document document){
        return service.updateDocument(document);
    }








    //ResponseEntity represents the whole HTTP response: status code, headers, and body
    /**@PostMapping("/{documentid}")
    public ResponseEntity<Document> getDocument(@ResponseBody Document document, @PathVariable int documentid) {
    Document document = service.getDocumentById(documentid);
    return ResponseEntity.ok(document);
    }*/
    /**@PostMapping("/id/{documentid}/details/{documentdetails}")
    public ResponseEntity<Document> getDoc(@PathVariable int documentid,@PathVariable String documentdetails){
    Document document = service.getDocumentByIDAndDetails(documentid, documentdetails);
    return ResponseEntity.ok(document);
    }*/

}

