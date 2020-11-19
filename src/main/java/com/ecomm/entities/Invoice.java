package com.ecomm.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data

@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Invoice implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private Date datecreated;
    @OneToMany(mappedBy = "invoice",cascade = CascadeType.ALL ,fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Projections> projections=new ArrayList<Projections>();

}
