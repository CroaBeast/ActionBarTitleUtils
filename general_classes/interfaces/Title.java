package general_classes.interfaces;

import org.bukkit.entity.Player;

public interface Title {
    void send(Player player, String title, String subtitle, int fadeIn, int stay, int fadeOut);
}
