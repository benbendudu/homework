package com.geektime.springbucks.model;

import lombok.*;
import org.hibernate.annotations.Type;
import org.joda.money.Money;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * @author colin
 */
@Entity
@Table(name = "t_coffees")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@XmlRootElement(name="coffee")
public class Coffee extends BaseEntity implements Serializable {

    private String name;

    @Column
//    @Type(type = "org.jadira.usertype.moneyandcurrency.joda.PersistentMoneyMinorAmount",
//            parameters = {@org.hibernate.annotations.Parameter(name = "currencyCode", value = "CNY")})
    private Long price;

}
