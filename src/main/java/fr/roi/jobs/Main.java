package fr.roi.jobs;

import fr.roi.jobs.commands.CommandJobs;
import fr.roi.jobs.gui.jobs.GuiJobs;
import fr.roi.jobs.listener.jobs.*;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class Main extends JavaPlugin {

    public static Main instance;



    @Override
    public void onLoad() {
        super.onLoad();
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    @Override
    public void onEnable() {
        instance = this;
        Bukkit.getPluginManager().registerEvents(new GuiJobs(), this);
        Bukkit.getPluginManager().registerEvents(new MineurListener(), this);
        Bukkit.getPluginManager().registerEvents(new BucheronListener(), this);
        Bukkit.getPluginManager().registerEvents(new AgriculteurListener(), this);
        Bukkit.getPluginManager().registerEvents(new PecheurListener(), this);
        Bukkit.getPluginManager().registerEvents(new DresseurListener(), this);
        Bukkit.getPluginManager().registerEvents(new ChasseurListener(), this);
        getCommand("jobs").setExecutor(new CommandJobs());


        super.onEnable();
    }
    public static Main getInstance(){
        return instance;
    }
}
