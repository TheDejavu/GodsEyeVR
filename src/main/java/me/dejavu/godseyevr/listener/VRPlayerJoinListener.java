package me.dejavu.godseyevr.listener;

import godseye.GodsEyeException;
import me.dejavu.godseyevr.GodsEyeVR;
import me.dejavu.godseyevr.GodsEyeVRAPI;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class VRPlayerJoinListener implements Listener {
    @EventHandler(priority = EventPriority.LOWEST)
    public void onPlayerJoin(PlayerJoinEvent e) throws GodsEyeException {
        Bukkit.getScheduler().runTaskLater(GodsEyeVR.getInstance(), new Runnable() {
            @Override
            public void run() {
                GodsEyeVRAPI.attemptBypassVRPLayer(e.getPlayer());
            }
        }, GodsEyeVRAPI.getDelay() * 20L);
    }
}
