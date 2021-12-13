package reduced_classes;

import org.bukkit.entity.Player;
import reduced_classes.*;

public class Initializer {
  
  private final ActionBar actionBar;
  private final Title titleMain;
  
  public Initializer() {
    actionBar = new ActionBar();
    title = new ActionBar();
  }
  
  public void sendActionBar(Player player, String message) {
    actionBar.getMethod().send(player, message);
  }
  
  public void sendTitleSubtitle(Player player, String title, String subtitle, int in, int stay, int out) {
    title.getMethod().send(player, title, subtitle != null ? subtitle : "", in, stay, out);
  }
  
  public void sendTitleSubtitle(Player player, String[] array, int in, int stay, int out) {
    if (array.length < 1 || array.length > 2) return;
    title.getMethod().send(player, array[0], array.length == 2 ? array[1] : "", in, stay, out);
  }
}
