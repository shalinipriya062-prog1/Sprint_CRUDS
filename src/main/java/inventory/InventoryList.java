package inventory;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InventoryList {
    @Id
    Integer id;
    String itemName;
    String description;

    public InventoryList(){
    }

    public InventoryList(Integer id, String itemName, String description) {
        this.id = id;
        this.itemName = itemName;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
