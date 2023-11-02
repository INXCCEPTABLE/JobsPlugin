package fr.roi.jobs.listener.jobs;

import com.pixelmonmod.pixelmon.api.events.CaptureEvent;
import fr.roi.jobs.file.CreatePlayer;
import org.bukkit.CropState;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.material.Crops;

public class AgriculteurListener implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerJoinEvent event) {
        if (CreatePlayer.getXpAgriculteur(event.getPlayer()) == Double.MAX_VALUE) {
            CreatePlayer.attributRole(event.getPlayer());

        }
    }

                ////////////////////////////////////////
                //          PLANTER SEED ETC          //
                ////////////////////////////////////////
      @EventHandler
      public void onPlayerInteract(CaptureEvent event) {

          System.out.println("t");
          }
    @EventHandler
    public void onPlayerInteract(BlockPlaceEvent event) {

        if (event.getBlock().getType().equals(Material.CARROTS)) {
            CreatePlayer.addXpAgriculteur(event.getPlayer(), 0.5);
        }
        if (event.getBlock().getType().equals(Material.POTATOES)) {
            CreatePlayer.addXpAgriculteur(event.getPlayer(), 0.5);
        }
        if (event.getBlock().getType().equals(Material.WHEAT)) {
            CreatePlayer.addXpAgriculteur(event.getPlayer(), 0.5);
        }
        if (event.getBlock().getType().equals(Material.BEETROOTS)) {
            CreatePlayer.addXpAgriculteur(event.getPlayer(), 0.5);
        }
        if (event.getBlock().getType().equals(Material.COCOA    )) {
            CreatePlayer.addXpAgriculteur(event.getPlayer(), 0.5);
        }
        if (event.getBlock().getType().equals(Material.PUMPKIN_STEM)) {
            CreatePlayer.addXpAgriculteur(event.getPlayer(), 0.5);
        }
        if (event.getBlock().getType().equals(Material.MELON_STEM)) {
            CreatePlayer.addXpAgriculteur(event.getPlayer(), 0.5);
        }
        if (event.getBlock().getType().equals(Material.NETHER_WART)) {
            CreatePlayer.addXpAgriculteur(event.getPlayer(), 0.5);
        }
        if (event.getBlock().getType().equals(Material.SUGAR_CANE)) {
            CreatePlayer.addXpAgriculteur(event.getPlayer(), 0.5);
        }
        if (event.getBlock().getType().equals(Material.CACTUS)) {
            CreatePlayer.addXpAgriculteur(event.getPlayer(), 0.5);
        }
        if (event.getBlock().getType().equals(Material.RED_MUSHROOM)) {
            CreatePlayer.addXpAgriculteur(event.getPlayer(), 0.5);
        }
        if (event.getBlock().getType().equals(Material.BROWN_MUSHROOM)) {
            CreatePlayer.addXpAgriculteur(event.getPlayer(), 0.5);
        }
    }

                ////////////////////////////////////////
                //        CASSER PLANTATION ETC       //
                ////////////////////////////////////////

    @EventHandler
    public void onPlayerInteract(BlockBreakEvent event) {
        System.out.println(event.getBlock().getType().getBlockTranslationKey());
        Block block = event.getBlock();
        if (event.getBlock().getType().equals(Material.CARROTS)) {
            Crops crop = (Crops) block.getState().getData();
            if (crop.getState() == CropState.RIPE) {
                CreatePlayer.addXpAgriculteur(event.getPlayer(), 1.2);
            }

        }
        if (event.getBlock().getType().equals(Material.POTATOES)) {
            Crops crop = (Crops) block.getState().getData();
            if (crop.getState() == CropState.RIPE) {
                CreatePlayer.addXpAgriculteur(event.getPlayer(), 1.2);
            }
        }
        if (event.getBlock().getType().equals(Material.WHEAT)) {
            Crops crop = (Crops) block.getState().getData();
            System.out.println(crop.getState().name());
            if (crop.getState() == CropState.RIPE) {
                CreatePlayer.addXpAgriculteur(event.getPlayer(), 1.2);
            }
        }
        if (event.getBlock().getType().equals(Material.COCOA_BEANS)) {
            Crops crop = (Crops) block.getState().getData();
            if (crop.getState() == CropState.RIPE) {
                CreatePlayer.addXpAgriculteur(event.getPlayer(), 1.5);
            }

        }
        if (event.getBlock().getType().equals(Material.PUMPKIN)) {
            CreatePlayer.addXpAgriculteur(event.getPlayer(), 1);
        }

        if (event.getBlock().getType().equals(Material.MELON)) {
                CreatePlayer.addXpAgriculteur(event.getPlayer(), 1);


        }
        if (event.getBlock().getType().equals(Material.NETHER_WART)) {
            Crops crop = (Crops) block.getState().getData();
            if (crop.getState() == CropState.GERMINATED) {
                CreatePlayer.addXpAgriculteur(event.getPlayer(), 1.2);
            }

        }
        if (event.getBlock().getType().equals(Material.SUGAR_CANE)) {
            CreatePlayer.addXpAgriculteur(event.getPlayer(), 0.5);
        }
        if (event.getBlock().getType().equals(Material.CACTUS)) {
            CreatePlayer.addXpAgriculteur(event.getPlayer(), 1);
        }
        if (event.getBlock().getType().equals(Material.BROWN_MUSHROOM)) {
            Crops crop = (Crops) block.getState().getData();
            if (crop.getState() == CropState.GERMINATED) {
                CreatePlayer.addXpAgriculteur(event.getPlayer(), 1);
            }

        }
        if (event.getBlock().getType().equals(Material.RED_MUSHROOM)) {
            Crops crop = (Crops) block.getState().getData();
            if (crop.getState() == CropState.GERMINATED) {
                CreatePlayer.addXpAgriculteur(event.getPlayer(), 1);
            }
        }


    }
}