package hello.itemservice.domain.item;

import lombok.Data;

@Data
public class Item {

    Long id;
    String itemName;
    Integer price;
    Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
