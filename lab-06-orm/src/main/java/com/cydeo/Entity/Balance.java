package com.cydeo.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Balance {

    private BigDecimal amount;

    @OneToOne
    private Customer customer;
}
