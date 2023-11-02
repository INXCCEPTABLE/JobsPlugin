package fr.roi.jobs.commands;

import fr.roi.jobs.gui.jobs.GuiJobs;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandJobs implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(commandSender instanceof Player){
            Player player = (Player) commandSender;
            if(GuiJobs.playerInventoryGUI.containsKey(player)){
                player.openInventory(GuiJobs.playerInventoryGUI.get(player));
            }else{
                GuiJobs guiJobs = new GuiJobs(player);
                GuiJobs.playerInventoryGUI.put(player, guiJobs.jobs);
                player.openInventory(GuiJobs.playerInventoryGUI.get(player));
            }


        }
        return false;
    }
}
