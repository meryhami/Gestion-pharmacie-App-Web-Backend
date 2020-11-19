package com.ecomm.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data

@AllArgsConstructor
@ToString
@NoArgsConstructor

public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Date dayePlaced;
    String userid;
    @OneToOne
    CustmerInfo custmerInfo;
    @OneToOne
    Invoice invoice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDayePlaced() {
        return dayePlaced;
    }

    public void setDayePlaced(Date dayePlaced) {
        this.dayePlaced = dayePlaced;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public CustmerInfo getCustmerInfo() {
        return custmerInfo;
    }

    public void setCustmerInfo(CustmerInfo custmerInfo) {
        this.custmerInfo = custmerInfo;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
