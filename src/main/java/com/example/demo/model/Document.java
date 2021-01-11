package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Document {
    @Id
    @Column
    private int DocumentID;
    @Column
    private String DocumentName;

    public Document() {
    }

    public Document(int ID, String documentName, String documentDetails) {
        this.DocumentID = ID;
        DocumentName = documentName;
        DocumentDetails = documentDetails;
    }

    public int getID() {
        return DocumentID;
    }

    public void setID(int ID) {
        this.DocumentID = ID;
    }

    public String getDocumentName() {
        return DocumentName;
    }

    public void setDocumentName(String documentName) {
        DocumentName = documentName;
    }

    public String getDocumentDetails() {
        return DocumentDetails;
    }

    public void setDocumentDetails(String documentDetails) {
        DocumentDetails = documentDetails;
    }

    @Column
    private String DocumentDetails;

}
