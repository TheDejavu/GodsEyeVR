package me.dejavu.godseyevr;

import godseye.GodsEyeAPI;
import lombok.Getter;
import lombok.Setter;
import me.dejavu.godseyevr.event.GodsEyeVRBypassEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.vivecraft.VivePlayer;

public class GodsEyeVRAPI {
    @Getter
    @Setter
    private static int delay;

    public static void attemptBypassVRPLayer(Player player){
        VivePlayer vivePlayer = new VivePlayer(player);
        GodsEyeVRBypassEvent event = new GodsEyeVRBypassEvent(player);
        Bukkit.getPluginManager().callEvent(event);
        if (event.isCancelled()) {
            if(!player.isOnline()) {
                return;
            }
            event.setCancelled(true);
            return;
        }
        if (vivePlayer.isVR() && GodsEyeAPI.hasProfile(player)) {
            GodsEyeAPI.setBypassed(player, true);
            Bukkit.getLogger().info("[GodsEyeVR] added " + player.getName() + " to bypassed players");
        }
    }
}
