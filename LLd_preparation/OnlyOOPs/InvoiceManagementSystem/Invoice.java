package LLd_preparation.OnlyOOPs.InvoiceManagementSystem;

import java.util.*;

public class Invoice {
    private static int iid = 1;
    private int id;
    private List<Items> itemsList;

    public Invoice(){
        itemsList = new ArrayList<>();
    }

// getter && setter
    public List<Items> getItemsList() {
        return itemsList;
    }

    public void setItemsList(Items itemsList) {
        this.itemsList.add(itemsList);
    }
}
