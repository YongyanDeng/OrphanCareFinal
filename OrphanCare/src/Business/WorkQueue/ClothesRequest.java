package Business.WorkQueue;

import java.util.ArrayList;
import java.util.List;

import Business.Item.Clothes;
import Business.UserAccount.UserAccount;

/**
 * @author zhb970327
 */
public class ClothesRequest extends WorkRequest{
  private List<Clothes> items;
  private boolean received; 

  public ClothesRequest() {
    super();
    items = new ArrayList<>();
    received = false;
  }
  
  public boolean isReceived() {
    return received;
  }

  public void Received() {
    this.received = true;
  }

  public void addCloth(Clothes clothes) {
    items.add(clothes);
  }

  public List<Clothes> getClothes() {
    return items;
  }
  
  public String summary() {
    return items.size() == 0 ? "" : items.size() + " * " + items.get(0); 
  }

}
