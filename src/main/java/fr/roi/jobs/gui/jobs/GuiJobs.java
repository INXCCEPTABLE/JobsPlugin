package fr.roi.jobs.gui.jobs;

import fr.roi.jobs.Main;
import fr.roi.jobs.file.CreatePlayer;
import fr.roi.jobs.utils.ItemUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.HashMap;

public class GuiJobs implements Listener {


    public static HashMap<Player, Inventory> playerInventoryGUI = new HashMap<>();
    private Player player;
    public static Inventory jobs;

    final ItemStack vide = new ItemStack(Material.AIR, 1);

    final ItemStack vitre = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1, (short) 0);

    public ItemStack tete  ;

    final ItemStack pioche = new ItemStack(Material.DIAMOND_PICKAXE,1);

    final ItemStack hache = new ItemStack(Material.DIAMOND_AXE, 1);

    final ItemStack epee = new ItemStack(Material.DIAMOND_SWORD, 1);

    final ItemStack laisse = new ItemStack(Material.LEAD,1);

    final ItemStack houe = new ItemStack(Material.DIAMOND_HOE, 1);

    final ItemStack rod = new ItemStack(Material.FISHING_ROD, 1);
    public GuiJobs() {

    }
    public GuiJobs(Player player ) {
        this.player = player;
        tete =  createSkullItem(player);
        ItemUtils.ItemDisplayName(pioche,"§r§8§m------§r §9§lMINEUR§r§8 §m------");
        ItemUtils.ItemDisplayName(hache,"§r§8§m------§r §6§lBUCHERON§r§8 §m------");
        ItemUtils.ItemDisplayName(tete,"§r§8§m------§r §a§lPROFIL§r§8 §m------");
        ItemUtils.ItemDisplayName(vitre," ");
        ItemUtils.ItemDisplayName(epee,"§r§8§m------§r §4§lCHASSEUR§r§8 §m------");
        ItemUtils.ItemDisplayName(laisse,"§r§8§m------§r §5§lDRESSEUR§r§8 §m------");
        ItemUtils.ItemDisplayName(houe,"§r§8§m------§r §2§lAGRICULTEUR§r§8 §m------"); //§r§8§m------§r §2§lAGRICULTEUR§r§8 §m------  §l§6Agriculteur
        ItemUtils.ItemDisplayName(rod,"§r§8§m------§r §3§lPECHEUR§r§8 §m------");




        jobs = Bukkit.createInventory(null,3*9,"§2Jobs");
        this.jobs.setItem(0, vitre );        this.jobs.setItem(9, vide );        this.jobs.setItem(18, vitre );
        this.jobs.setItem(1, vitre );        this.jobs.setItem(10, epee );       this.jobs.setItem(19, vitre );
        this.jobs.setItem(2, vitre );         this.jobs.setItem(11, hache );       this.jobs.setItem(20, vitre );
        this.jobs.setItem(3, vitre );        this.jobs.setItem(12, pioche );       this.jobs.setItem(21, vitre );
        this.jobs.setItem(4, tete );        this.jobs.setItem(13, vide );       this.jobs.setItem(22, vitre );
        this.jobs.setItem(5, vitre );        this.jobs.setItem(14, laisse );       this.jobs.setItem(23, vitre );
        this.jobs.setItem(6, vitre );         this.jobs.setItem(15, houe );       this.jobs.setItem(24, vitre );
        this.jobs.setItem(7, vitre );        this.jobs.setItem(16, rod );       this.jobs.setItem(25, vitre );
        this.jobs.setItem(8, vitre );        this.jobs.setItem(17, vide );       this.jobs.setItem(26, vitre);



        ArrayList<String> loreMineur = new ArrayList<String>();
        ArrayList<String> loreAgriculteur = new ArrayList<String>();
        ArrayList<String> loreBucheron = new ArrayList<String>();
        ArrayList<String> lorePecheur = new ArrayList<String>();
        ArrayList<String> loreChasseur = new ArrayList<String>();
        ArrayList<String> loreDresseur = new ArrayList<String>();
        ArrayList<String> loreProfil = new ArrayList<String>();

        new BukkitRunnable(){
            @Override
            public void run() {

                ////////////////////////////////
                //         LORE MINEUR        //
                ////////////////////////////////

                loreMineur.clear();
                loreMineur.add("");
                loreMineur.add("§r  §8✦§7 Information §8✦" );
                loreMineur.add("§r§9§l      » §7Niveau §f§l"+  CreatePlayer.getLevelMineur(player)  );

                String percMineur = "||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||";
                String insertStringMineur = "§8";
                StringBuilder stringBuilderMineur = new StringBuilder(percMineur);
                int pMineur = (int) ((int) (CreatePlayer.getXpMineur(player) * 100)/ CreatePlayer.getXpMaxMineur(player));
                // Insérer la chaîne à la position spécifiée
                stringBuilderMineur.insert(pMineur, insertStringMineur);

                // Convertir le StringBuilder en String si nécessaire
                String modifiedStringMineur = stringBuilderMineur.toString();
                loreMineur.add("§r§9§l      » §f"+ modifiedStringMineur );
                loreMineur.add("§r§9§l      » §f§l"+ CreatePlayer.getXpMineur(player) +"§l§9/§r§7"+ CreatePlayer.getXpMaxMineur(player)  );
                loreAgriculteur.add("");
                loreAgriculteur.add("§r§8§m--------------------------" );
                ItemUtils.ItemAddLore(12, loreMineur, jobs);

                ////////////////////////////////
                //      LORE AGRICULTEUR      //
                ////////////////////////////////


                loreAgriculteur.clear();
                loreAgriculteur.add("");
                loreAgriculteur.add("§r  §8✦§7 Information §8✦" );
                loreAgriculteur.add("§r§2§l      » §7Niveau §f§l"+ CreatePlayer.getLevelAgriculteur(player) );
                String percAgriculteur = "||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||";
                String insertStringAgriculteur = "§8";
                StringBuilder stringAgriculteur = new StringBuilder(percAgriculteur);
                int pAgriculteur = (int) ((int) (CreatePlayer.getXpAgriculteur(player) * 100)/ CreatePlayer.getXpMaxAgriculteur(player));
                // Insérer la chaîne à la position spécifiée
                stringAgriculteur.insert(pAgriculteur, insertStringAgriculteur);

                // Convertir le StringBuilder en String si nécessaire
                String modifiedStringAgriculteur = stringAgriculteur.toString();
                loreAgriculteur.add("§r§2§l      » §f"+modifiedStringAgriculteur );
                loreAgriculteur.add("§r§2§l      » §f§l"+CreatePlayer.getXpAgriculteur(player)+"§l§2/§r§7"+ CreatePlayer.getXpMaxAgriculteur(player)  );
                loreAgriculteur.add("");
                loreAgriculteur.add("§r§8§m--------------------------" );
                ItemUtils.ItemAddLore(15, loreAgriculteur,jobs);

                ////////////////////////////////
                //        LORE BUCHERON       //
                ////////////////////////////////

                loreBucheron.clear();
                loreBucheron.add("");
                loreBucheron.add("§r  §8✦§7 Information §8✦" );
                loreBucheron.add("§r§6§l      » §7Niveau §f§l"+ CreatePlayer.getLevelBucheron(player) );
                String percBucheron = "||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||";
                String insertStringBucheron = "§8";
                StringBuilder stringBucheron = new StringBuilder(percBucheron);
                int pBucheron = (int) ((int) (CreatePlayer.getXpBucheron(player) * 100)/ CreatePlayer.getXpMaxBucheron(player));
                // Insérer la chaîne à la position spécifiée
                stringBucheron.insert(pBucheron, insertStringBucheron);

                // Convertir le StringBuilder en String si nécessaire
                String modifiedStringBucheron = stringBucheron.toString();
                loreBucheron.add("§r§6§l      » §f"+modifiedStringBucheron );
                loreBucheron.add("§r§6§l      » §f§l"+CreatePlayer.getXpBucheron(player)+"§l§6/§r§7"+CreatePlayer.getXpMaxBucheron(player)  );
                loreBucheron.add("");// --------------------------
                loreBucheron.add("§r§8§m--------------------------" );
                ItemUtils.ItemAddLore(11, loreBucheron,jobs);

                ////////////////////////////////
                //        LORE PECHEUR        //
                ////////////////////////////////

                lorePecheur.clear();
                lorePecheur.add("");
                lorePecheur.add("§r  §8✦§7 Information §8✦" );
                lorePecheur.add("§r§3§l      » §7Niveau §f§l"+ CreatePlayer.getLevelPecheur(player) );
                String percPecheur = "||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||";
                String insertStringPecheur = "§8";
                StringBuilder stringPecheur = new StringBuilder(percPecheur);
                int pPecheur = (int) ((int) (CreatePlayer.getXpPecheur(player) * 100)/ CreatePlayer.getXpPecheur(player));
// Insérer la chaîne à la position spécifiée
                stringPecheur.insert(pPecheur, insertStringPecheur);

// Convertir le StringBuilder en String si nécessaire
                String modifiedStringPecheur = stringPecheur.toString();
                lorePecheur.add("§r§3§l      » §f"+modifiedStringPecheur );

                lorePecheur.add("§r§3§l      » §f§l"+CreatePlayer.getXpPecheur(player)+"§l§3/§r§7"+ CreatePlayer.getXpMaxPeucheur(player) );
                lorePecheur.add("");
                lorePecheur.add("§r§8§m--------------------------" );
                ItemUtils.ItemAddLore(16, lorePecheur,jobs);

                ////////////////////////////////
                //        LORE CHASSEUR       //
                ////////////////////////////////

                loreChasseur.clear();
                loreChasseur.add("");
                loreChasseur.add("§r  §8✦§7 Information §8✦" );
                loreChasseur.add("§r§4§l      » §7Niveau §f§l" + CreatePlayer.getLevelChasseur(player) );
                String percChasseur = "||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||";
                String insertStringChasseur = "§8";
                StringBuilder stringChasseur = new StringBuilder(percChasseur);
                int pChasseur = (int) ((int) (CreatePlayer.getXpChasseur(player) * 100)/ CreatePlayer.getXpMaxChasseur(player));
// Insérer la chaîne à la position spécifiée
                stringChasseur.insert(pChasseur, insertStringChasseur);

// Convertir le StringBuilder en String si nécessaire
                String modifiedStringChasseur = stringChasseur.toString();
                loreChasseur.add("§r§4§l      » §f"+modifiedStringChasseur );


                loreChasseur.add("§r§4§l      » §f§l"+CreatePlayer.getXpChasseur(player)+"§l§4/§r§7"+ + CreatePlayer.getXpMaxChasseur(player)   );
                loreChasseur.add("");
                loreChasseur.add("§r§8§m--------------------------" );
                ItemUtils.ItemAddLore(10, loreChasseur,jobs);

                ////////////////////////////////
                //        LORE DRESSEUR       //
                ////////////////////////////////

                loreDresseur.clear();
                loreDresseur.add("");
                loreDresseur.add("§r  §8✦§7 Information §8✦" );
                loreDresseur.add("§r§5§l      » §7Niveau §f§l"+  CreatePlayer.getLevelDresseur(player) );
                String percDresseur = "||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||";
                String insertStringDresseur = "§8";
                StringBuilder stringDresseur = new StringBuilder(percDresseur);
                int pDresseur = (int) ((int) (CreatePlayer.getXpDresseur(player) * 100)/ CreatePlayer.getXpMaxDresseur(player));
// Insérer la chaîne à la position spécifiée
                stringDresseur.insert(pDresseur, insertStringDresseur);

// Convertir le StringBuilder en String si nécessaire
                String modifiedStringDresseur = stringDresseur.toString();
                loreDresseur.add("§r§5§l      » §f"+modifiedStringDresseur );


                loreDresseur.add("§r§5§l      » §f§l"+CreatePlayer.getXpDresseur(player)+"§l§5/§r§7"+ CreatePlayer.getXpMaxDresseur(player)  );
                loreDresseur.add("");
                loreDresseur.add("§r§8§m--------------------------" );
                ItemUtils.ItemAddLore(14, loreDresseur,jobs);

                ////////////////////////////////
                //         LORE PROFIL        //
                ////////////////////////////////

                loreProfil.clear();
                loreProfil.add("");
                loreProfil.add("§r  §8✦ §7Jobs §8✦" );
                loreProfil.add("§r    §a§l » §r§1"+CreatePlayer.getJobs1(player) );
                loreProfil.add("§r    §a§l » §r§1"+CreatePlayer.getJobs2(player) );
                loreProfil.add("");
                loreProfil.add("§r§8§m--------------------" );
                ItemUtils.ItemAddLore(4, loreProfil,jobs);










            }
        }.runTaskTimer(Main.getInstance(),0,20);


    }
    @EventHandler
    public void onPlayerInteract(InventoryClickEvent event) {
        if (event.getWhoClicked().getOpenInventory().getTitle().equals("§2Jobs")) {
            event.setCancelled(true);
            //if (event.getCurrentItem().getType().equals(Material.NETHER_STAR)) {
            //event.getWhoClicked().openInventory(GuiInventaire.config);

        }
    }

    public ItemStack createSkullItem(Player player) {
        ItemStack item = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta meta = (SkullMeta) item.getItemMeta();
        meta.setOwningPlayer(Bukkit.getOfflinePlayer(player.getUniqueId()));
        item.setItemMeta(meta);
        return item;
    }



}
