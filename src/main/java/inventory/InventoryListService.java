package inventory;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class InventoryListService {
    private List<InventoryList> inventoryList = new ArrayList<>(Arrays.asList(
            new InventoryList(1, "Pen", "Blue Parker"),
            new InventoryList(2, "Paper", "Single Ruled"),
            new InventoryList(3, "Stapler", "Small Red"),
            new InventoryList(4, "Geometry Box", "Faber Castle Company")
            ));

    public List<InventoryList> getInventoryList() {
        return inventoryList;
    }

    public InventoryList getInventoryListById(Integer id) {
        return inventoryList.stream().filter(item -> item.getId().equals(id)).findFirst().get();
    }

    public String addItem(InventoryList item){
        try{
            inventoryList.add(item);
            return "Item successfully added to inventory list";
        }
        catch(Exception e){
            return "Failed to add item to inventory list";
        }

    }

    public String removeItem(Integer id) {
        try {
            inventoryList.removeIf(l -> l.getId().equals(id));
            //for (int i = 0; i < inventoryList.size(); i++) {
            //    InventoryList inventoryItem = inventoryList.get(i);
            //    if (inventoryItem.getId().equals(id)) {
            //        inventoryList.remove(inventoryItem);
            //    }
            //}
            return "Item successfully removed to inventory list";
        } catch (Exception e) {
            return "Failed to remove item to inventory list";
        }
    }

    public String updateItem(Integer id, InventoryList item) {
        try{
            //inventoryList.stream().filter(i -> i.getId().equals(id)).map(i -> item).collect(Collectors.toList());
            for (int i=0; i<inventoryList.size(); i++) {
                InventoryList inventoryItem = inventoryList.get(i);
                if(inventoryItem.getId().equals(id)){
                    inventoryList.set(i, item);
                    //eachItem.setItemName(item.getItemName());
                    //eachItem.setDescription(item.getDescription());
                }


            }
            return "Item successfully updated to inventory list";
        }
        catch(Exception e){
            return "Failed to update item to inventory list";
        }
    }
}
