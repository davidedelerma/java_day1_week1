public class Oven{
  private String brand;
  private Cake[] stuffs;


  public Oven(String brand){
    this.brand = brand;
    this.stuffs = new Cake[10];
  }

  public String getBrand(){
    return this.brand;
  }

  public int stuffCount(){
    int count = 0;
    for (Cake cake : stuffs){
      if (cake != null){
        count++;
      }
    }
    return count;
  }

  public void bake(Cake cake){
    if (ovenFull()) return;
    int count = stuffCount();
    this.stuffs[count] = cake;
  }

  public boolean ovenFull(){
    return stuffCount() == stuffs.length;
  }

  public void takeOut(){
    for (int i = 0; i < stuffs.length; i++){
      if (this.stuffs[i] == null) return;
      this.stuffs[i] = null;      
    }
  }
}