package general_classes;

import general_classes.interfaces.*;
import general_classes.objects.*;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class Initializer {
  
  private final ActionBar actionBar;
  private final Title title;

  private final int MAJOR_VERSION = 
          Integer.parseInt(Bukkit.getBukkitVersion().split("-")[0].split("\\.")[1]);
  
  public Initializer() {
    actionBar = MAJOR_VERSION < 11 ? new LegacyActionBar() : new NewActionBar();
    title = MAJOR_VERSION < 10 ? new LegacyTitle() : new NewTitle();
  }
  
  public void sendActionBar(Player player, String message) {
    actionBar.send(player, message);
  }
  
  public void sendTitleSubtitle(Player player, String title, String subtitle, int in, int stay, int out) {
    title.send(player, title, subtitle != null ? subtitle : "", in, stay, out);
  }
  
  public void sendTitleSubtitle(Player player, String[] array, int in, int stay, int out) {
    if (array.length < 1 || array.length > 2) return;
    title.send(player, array[0], array.length == 2 ? array[1] : "", in, stay, out);
  }
}
