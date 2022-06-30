package com.muller.devincars.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "COISA_ESTRANHA")
@SequenceGenerator(name="seq_coisa", initialValue=4, allocationSize=100)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoisaEstranha {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_coisa")
    private Long id;
    private String coisa_estranha;
}
