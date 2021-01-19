package com.example.demo.model;

import javax.persistence.*;

@Entity

public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int DocumentID;
    @Column
    private String DocumentName;
    @Column
    private String DocumentDetails;

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

}
