package fr.roi.jobs.listener.jobs;

import fr.roi.jobs.file.CreatePlayer;
import org.bukkit.entity.FishHook;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import java.net.http.WebSocket;

public class PecheurListener implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerJoinEvent event) {
        if (CreatePlayer.getXpAgriculteur(event.getPlayer()) == Double.MAX_VALUE) {
            CreatePlayer.attributRole(event.getPlayer());
        }

    }

    @EventHandler
    public void onPlayerInteract(PlayerFishEvent event) {
        CreatePlayer.addXpPecheur(event.getPlayer(), 2.5);


    }
}
