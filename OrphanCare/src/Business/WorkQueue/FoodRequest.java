package Business.WorkQueue;

import java.util.ArrayList;
import java.util.List;

import Business.Item.Food;

/**
 * 采购食物的工作请求
 * @author yuenasu
 */
public class FoodRequest extends WorkRequest {
  private List<Food> items;
  private boolean received; //福利院有么有收到这批食物

  public FoodRequest(){
    items = new ArrayList<>();
    received = false;
  }

  public boolean isReceived() {
    return received;
  }

  public void Received() {
    this.received = true;
  }

  public void addFood(Food food) {
    items.add(food);
  }

  public List<Food> getFoods() {
    return items;
  }

  public String summary() {
    return items.size() == 0 ? "" : items.size() + " * " + items.get(0); //让前端更好看一点
  }
}
