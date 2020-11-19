package com.ecomm.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data

@AllArgsConstructor
@ToString
@NoArgsConstructor
public class CustmerInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String theAmountPaid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTheAmountPaid() {
        return theAmountPaid;
    }

    public void setTheAmountPaid(String theAmountPaid) {
        this.theAmountPaid = theAmountPaid;
    }
}
