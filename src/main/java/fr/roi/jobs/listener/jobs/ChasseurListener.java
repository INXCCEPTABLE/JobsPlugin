package fr.roi.jobs.listener.jobs;

import fr.roi.jobs.file.CreatePlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class ChasseurListener implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerJoinEvent event) {

        if (CreatePlayer.getXpChasseur(event.getPlayer()) == Double.MAX_VALUE) {
            CreatePlayer.attributRole(event.getPlayer());
        }
    }

}
