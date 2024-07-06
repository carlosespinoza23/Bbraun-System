package com.bbraun.pedidos.cotizacion.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Setter
@Getter
@Table(name = "departamentos")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Departamento {

    @Id
    private Integer id_departamento;

    @Column(name = "nombre_departamento")
    private String nombreDepartamento;
    private Float costo_envio;
}
