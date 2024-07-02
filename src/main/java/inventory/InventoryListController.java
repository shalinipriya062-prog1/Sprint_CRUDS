package inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InventoryListController {

    @Autowired
    private InventoryListService inventoryListService;

    @RequestMapping("/inventoryList")
    public List<InventoryList> getInventoryList(){
        return inventoryListService.getInventoryList();
    }
    @RequestMapping("/getInventoryListById/{id}")
    public InventoryList getInventoryListById(@PathVariable Integer id){
        return inventoryListService.getInventoryListById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addInventory")
    public String addInventory(@RequestBody InventoryList item){
        return inventoryListService.addItem(item);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/removeInventory/{id}")
    public String removeInventory(@PathVariable Integer id){
        return inventoryListService.removeItem(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updateInventory/{id}")
    public String updateInventory(@PathVariable Integer id ,@RequestBody InventoryList item){
        return inventoryListService.updateItem(id, item);
    }

    @GetMapping("/hello")
    public String getError(){
        return "Hello!";
    }

}
