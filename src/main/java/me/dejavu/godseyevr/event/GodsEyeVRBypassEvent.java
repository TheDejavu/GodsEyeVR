package me.dejavu.godseyevr.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class GodsEyeVRBypassEvent extends Event implements Cancellable {

    private boolean cancel;
    private static HandlerList handlers = new HandlerList();
    private Player player;

    public GodsEyeVRBypassEvent(Player player){
        this.player = player;
    }

    public void setCancelled(final boolean cancel) {
        this.cancel = cancel;
    }
    public boolean isCancelled() {
        return this.cancel;
    }
    public final HandlerList getHandlers() {
        return handlers;
    }

    public Player getPlayer() {
        return player;
    }
}