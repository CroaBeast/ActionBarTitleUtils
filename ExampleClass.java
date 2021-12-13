package a.custom.pack.lol;

import your.selected.package.Initializer; //don't forget to change this

public class ExampleClass {
  
  public void exampleMethod() {
    Initializer init = new Initializer();
    
    Player player = Bukkit.getPlayer("Markiplier"); // an example tho
    
    init.sendActionBar(player, "A custom action bar message :D");    
    init.sendTitleSubtitle(player, "My title", "is awesome B)", 10, 50, 10);
    
    String[] array = "This line will split<n>in two lines :o".split("<n>");
    init.sendTitleSubtitle(player, array, 15, 60, 5);
  }
}
