package com.aqsha.interntest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "status")   // sesuaikan dengan nama tabel di MySQL
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Status {
    @Id
    private Integer id;

    private String name;
}
