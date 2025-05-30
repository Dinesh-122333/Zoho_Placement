package LLd_preparation.OnlyOOPs.InvoiceManagementSystem;

import java.util.*;

public class ItemsManager {
    private List<Items> itemsList;

    public ItemsManager(){
        itemsList = new ArrayList<>();
    }
    public List<Items> getItemsList() {
        return itemsList;
    }

    public void setItemsList(Items item) {
        this.itemsList.add(item);
    }
}
