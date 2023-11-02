package fr.roi.jobs.listener.jobs;

import fr.roi.jobs.file.CreatePlayer;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class MineurListener implements Listener {
    @EventHandler
    public void onPlayerInteract(PlayerJoinEvent event) {

        if (CreatePlayer.getXpMineur(event.getPlayer()) == Double.MAX_VALUE) {
            CreatePlayer.attributRole(event.getPlayer());
        }
    }
             ////////////////////////////////////////
             //          BLOCK STONE ETC           //
             ////////////////////////////////////////

    @EventHandler
    public void onPlayerInteract(BlockBreakEvent event) {

        if (event.getBlock().getType().equals(Material.STONE)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 0.5);
        }
        if (event.getBlock().getType().equals(Material.SANDSTONE)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 0.5);
        }
        if (event.getBlock().getType().equals(Material.ANDESITE)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 0.5);
        }
        if (event.getBlock().getType().equals(Material.DIORITE)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 0.5);
        }
        if (event.getBlock().getType().equals(Material.GRANITE)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 0.5);
        }
        if (event.getBlock().getType().equals(Material.NETHERRACK)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 0.2);
        }
        if (event.getBlock().getType().equals(Material.END_STONE)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 0.8);
        }
        if (event.getBlock().getType().equals(Material.DEEPSLATE)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 0.8);
        }
             ////////////////////////////////////////
             // BLOCK MINERAIS COMME CHARBON ETC...//
             ////////////////////////////////////////

        if (event.getBlock().getType().equals(Material.COAL_ORE)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(Material.LAPIS_ORE)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(Material.IRON_ORE)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 2);
        }
        if (event.getBlock().getType().equals(Material.GOLD_ORE)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 2);
        }
        if (event.getBlock().getType().equals(Material.REDSTONE_ORE)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(Material.NETHER_QUARTZ_ORE)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(Material.DIAMOND_ORE)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 12);
        }
        if (event.getBlock().getType().equals(Material.EMERALD_ORE)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 7);
        }
        if (event.getBlock().getType().equals(Material.ANCIENT_DEBRIS)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 15);
        }
        if (event.getBlock().getType().equals(Material.DEEPSLATE_COAL_ORE)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(Material.DEEPSLATE_LAPIS_ORE)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(Material.DEEPSLATE_IRON_ORE)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 2);
        }
        if (event.getBlock().getType().equals(Material.DEEPSLATE_GOLD_ORE)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 2);
        }
        if (event.getBlock().getType().equals(Material.DEEPSLATE_REDSTONE_ORE)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(Material.DEEPSLATE_DIAMOND_ORE)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 12);
        }
        if (event.getBlock().getType().equals(Material.DEEPSLATE_EMERALD_ORE)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 7);
        }
        if (event.getBlock().getType().equals(Material.DEEPSLATE_EMERALD_ORE)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(Material.DEEPSLATE_EMERALD_ORE)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(Material.DEEPSLATE_EMERALD_ORE)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 2);
        }
        if (event.getBlock().getType().equals(Material.DEEPSLATE_EMERALD_ORE)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(Material.DEEPSLATE_EMERALD_ORE)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 2);
        }
        if (event.getBlock().getType().equals(Material.DEEPSLATE_EMERALD_ORE)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 1.5);
        }
        if (event.getBlock().getType().equals(Material.DEEPSLATE_EMERALD_ORE)) {
            CreatePlayer.addXpMineur(event.getPlayer(), 3.5);
        }
    }
}