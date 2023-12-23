package com.masroufi.api.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.masroufi.api.enums.PermissionType;
import lombok.*;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "permission")
public class Permission extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @JsonIgnore
    private Long id;

    @Column
    @Enumerated(EnumType.STRING)
    private PermissionType type;
}
