package fr.roi.jobs.listener.jobs;

import biomesoplenty.api.block.BOPBlocks;
import fr.roi.jobs.file.CreatePlayer;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import java.net.http.WebSocket;

public class BucheronListener implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerJoinEvent event) {

        if (CreatePlayer.getXpBucheron(event.getPlayer()) == Double.MAX_VALUE) {
            CreatePlayer.attributRole(event.getPlayer());

        }
    }

                ////////////////////////////////////////
                //          BLOCK STONE ETC           //
                ////////////////////////////////////////

    @EventHandler
    public void onPlayerInteract(BlockBreakEvent event) {

        if (event.getBlock().getType().equals(Material.OAK_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(Material.DARK_OAK_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(Material.BIRCH_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(Material.SPRUCE_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(Material.JUNGLE_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(Material.ACACIA_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(Material.MANGROVE_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(Material.CHERRY_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(Material.CHERRY_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(Material.CHERRY_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(Material.CHERRY_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(Material.CHERRY_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(Material.CHERRY_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(Material.CHERRY_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(Material.CHERRY_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(Material.CHERRY_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(Material.CHERRY_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(Material.CHERRY_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(BOPBlocks.REDWOOD_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(BOPBlocks.STRIPPED_REDWOOD_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(BOPBlocks.MAHOGANY_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(BOPBlocks.STRIPPED_MAHOGANY_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(BOPBlocks.JACARANDA_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(BOPBlocks.PALM_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(BOPBlocks.STRIPPED_PALM_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(BOPBlocks.WILLOW_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(BOPBlocks.STRIPPED_WILLOW_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(BOPBlocks.DEAD_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(BOPBlocks.STRIPPED_DEAD_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(BOPBlocks.MAGIC_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(BOPBlocks.STRIPPED_MAGIC_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(BOPBlocks.FIR_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(BOPBlocks.STRIPPED_FIR_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(BOPBlocks.UMBRAN_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(BOPBlocks.STRIPPED_UMBRAN_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(BOPBlocks.HELLBARK_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(BOPBlocks.STRIPPED_HELLBARK_LOG)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }


}
