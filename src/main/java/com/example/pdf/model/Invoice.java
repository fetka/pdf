package com.example.pdf.model;

import java.time.LocalDate;
import java.util.List;

public class Invoice {
  private String invoiceNumber;
  private String clientName;
  private LocalDate date;
  private List<String> details;
  private String titleImg;

  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public List<String> getDetails() {
    return details;
  }

  public void setDetails(List<String> details) {
    this.details = details;
  }

  public String getTitleImg() {
    return titleImg;
  }

  public void setTitleImg(String titleImg) {
    this.titleImg = titleImg;
  }
}