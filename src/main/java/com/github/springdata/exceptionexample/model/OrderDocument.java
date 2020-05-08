package com.github.springdata.exceptionexample.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.UUID;

@ToString(of = {"orderId"})
@Getter
@Setter
@Document(collection = "orderFormFieldData")
public class OrderDocument {

    @Id
    private ObjectId id;

    @Field("order_id")
    private UUID orderId;

    private Boolean hasTask;

    private Integer shipmentCount;

}
