// Source code is decompiled from a .class file using FernFlower decompiler.
public class AquaticEcoSystem {
  
   
   public static void main(String[] var0) {
      Fish var1 = new Fish("Shark", 300.0, "Smaller Fish", "Coral Reef");
      System.out.println("Total Fish: " + Fish.totalFish);
      Fish var2 = new Fish("Clownfish", 5.0, "Algae and Plankton", "Sea Anemone");
      System.out.println("Total Fish: " + Fish.totalFish);
      new Fish("Tuna", 3.5, "Small Fish", "Deep Sea");
      Plant var4 = new Plant("Seaweed", "Coral Reef");
      System.out.println("Total Fish: " + Plant.getTotalPlants());
      Plant var5 = new Plant("Algae", "Shallow Waters");
      System.out.println("Total Fish: " + Fish.totalFish);
      new Plant("Kelp", "Shallow Waters");
      new Plant("Seagrass", "Coastal Areas");
      Fish[] var8 = new Fish[]{new Fish("Guppy", 400.0, "Algae", "Freshwater Pond"), new Fish("Swordfish", 340.0, "Squid", "Deep Ocean"), new Fish("Barracuda", 20.0, "Small Fish", "Coral Reef")};
      System.out.println("Total Fish: " + Fish.totalFish);
      Plant[] var9 = new Plant[]{new Plant("Water Lily", "Still Waters"), new Plant("Mangrove", "Coastal Swamps")};
      System.out.println("Total Plant: " + Plant.getTotalPlants());
      Fish[] var10 = var8;
      int var11 = var8.length;
      
      int var12;
      for(var12 = 0; var12 < var11; ++var12) {
         Fish var13 = var10[var12];
         var13.move();
         var13.feed();
      }
      
      Plant[] var14 = var9;
      var11 = var9.length;
      System.out.println("Total Plant: " + Plant.totalPlants);
      
      for(var12 = 0; var12 < var11; ++var12) {
         Plant var15 = var14[var12];
         var15.spread();
      }
      
      var1.move();
      var1.feed();
      var2.move();
      var2.feed();
      var4.grow();
      var4.spread();
      var5.grow();
      var5.spread();
      
      
      System.out.println("Total Fish: " + Fish.getTotalFish());
      System.out.println("Total Plant: " + Plant.getTotalPlants());
   }
}
