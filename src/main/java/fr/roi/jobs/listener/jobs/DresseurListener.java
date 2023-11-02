package fr.roi.jobs.listener.jobs;

import com.pixelmonmod.pixelmon.api.events.CaptureEvent;
import fr.roi.jobs.file.CreatePlayer;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class DresseurListener implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerJoinEvent event) {

        if (CreatePlayer.getXpDresseur(event.getPlayer()) == Double.MAX_VALUE) {
            CreatePlayer.attributRole(event.getPlayer());
        }
    }

    CaptureEvent.SuccessfulCapture
    @EventHandler
    public void CaptureEvent.SuccessfulCapture(CaptureEvent.SuccessfulCapture event) {

        if (event.getBlock().getType().equals(Material.OAK_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
    }
}
