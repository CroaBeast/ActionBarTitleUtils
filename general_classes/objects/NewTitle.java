package general_classes.objects;

import general_classes.interfaces.*;
import org.bukkit.entity.*;

public class NewTitle implements Title {

    @Override
    public void send(Player player, String title, String subtitle, int in, int stay, int out) {
        player.sendTitle(title, subtitle, in, stay, out);
    }
}
