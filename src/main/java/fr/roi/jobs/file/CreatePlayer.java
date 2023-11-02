package fr.roi.jobs.file;



import org.bukkit.entity.Player;

import java.io.File;

public class CreatePlayer {
    public static final File saveDirs = new File("plugins"+ File.separator+"JobsPlugin" + File.separator+"players"+ File.separator);

                                                 // MINEUR //
    ////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////  LEVEL ////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////
     public static void attributRole(Player p ){
         File file = new File("plugins"+ File.separator+"JobsPlugin" + File.separator+"players"+ File.separator, p.getUniqueId() + ".json");
         PlayerSerializationManager profileSerializationManager = new PlayerSerializationManager();
         PlayerProfile profile = PlayerProfile.createProfile(0, 0, 100,0,0,100,0,0,100,0 ,0,100,0,0,100,0,0,100,"Mineur" , "Bucheron");
         String json = profileSerializationManager.serialize(profile);
         FileUtils.save(file, json);
     }

    public static int getLevelMineur(Player p){
        File file = new File("plugins"+ File.separator+"JobsPlugin" + File.separator+"players"+ File.separator, p.getUniqueId() + ".json");
        PlayerSerializationManager roleSerializationManager = new PlayerSerializationManager();
        String json =   FileUtils.loadContent(file);
        PlayerProfile profile = roleSerializationManager.deserialize(json);
        return profile.getLevelMineur();
    }
    public static void addLevelMineur(Player p, int number){

        File file = new File(saveDirs, p.getUniqueId() + ".json");
        PlayerSerializationManager profileSerializationManager = new PlayerSerializationManager();

        PlayerProfile profile = PlayerProfile.createProfile(getLevelMineur(p) + number, getXpMineur(p), getXpMaxMineur(p),getLevelBucheron(p),getXpBucheron(p),getXpMaxBucheron(p),getLevelAgriculteur(p) ,getXpAgriculteur(p),getXpMaxAgriculteur(p),getLevelPecheur(p),getXpPecheur(p),getXpMaxPeucheur(p),getLevelChasseur(p),getXpChasseur(p),getXpMaxChasseur(p),getLevelDresseur(p),getXpDresseur(p),getXpMaxDresseur(p), getJobs1(p),getJobs2(p));

        String json = profileSerializationManager.serialize(profile);
        FileUtils.save(file, json);

    }

    ////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////// XP //////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////

    public static double getXpMineur(Player p){
        File file = new File("plugins"+ File.separator+"JobsPlugin" + File.separator+"players"+ File.separator, p.getUniqueId() + ".json");
        PlayerSerializationManager roleSerializationManager = new PlayerSerializationManager();
        String json =   FileUtils.loadContent(file);
        PlayerProfile profile = roleSerializationManager.deserialize(json);
        if(profile == null){
            return Double.MAX_VALUE;
        }
        return profile.getXpMineur();
    }

    public static double getXpMaxMineur(Player p){
        File file = new File("plugins"+ File.separator+"JobsPlugin" + File.separator+"players"+ File.separator, p.getUniqueId() + ".json");
        PlayerSerializationManager roleSerializationManager = new PlayerSerializationManager();
        String json =   FileUtils.loadContent(file);
        PlayerProfile profile = roleSerializationManager.deserialize(json);
        return profile.getXpMaxMineur();
    }
    public static void addXpMineur(Player p, double number){

        File file = new File(saveDirs, p.getUniqueId() + ".json");
        PlayerSerializationManager profileSerializationManager = new PlayerSerializationManager();

        PlayerProfile profile = PlayerProfile.createProfile(getLevelMineur(p), getXpMineur(p) + number, getXpMaxMineur(p),getLevelBucheron(p),getXpBucheron(p),getXpMaxBucheron(p),getLevelAgriculteur(p) ,getXpAgriculteur(p),getXpMaxAgriculteur(p),getLevelPecheur(p),getXpPecheur(p),getXpMaxPeucheur(p), getLevelChasseur(p),getXpChasseur(p),getXpMaxChasseur(p),getLevelDresseur(p),getXpDresseur(p),getXpMaxDresseur(p),getJobs1(p),getJobs2(p));

        String json = profileSerializationManager.serialize(profile);
        FileUtils.save(file, json);
        if(getXpMineur(p) >= getXpMaxMineur(p)){


            PlayerProfile profiles = PlayerProfile.createProfile(getLevelMineur(p) +1 , 0, getXpMaxMineur(p),getLevelBucheron(p),getXpBucheron(p),getXpMaxBucheron(p),getLevelAgriculteur(p) ,getXpAgriculteur(p),getXpMaxAgriculteur(p),getLevelPecheur(p),getXpPecheur(p),getXpMaxPeucheur(p), getLevelChasseur(p),getXpChasseur(p),getXpMaxChasseur(p),getLevelDresseur(p),getXpDresseur(p),getXpMaxDresseur(p),getJobs1(p),getJobs2(p));

            String jsons = profileSerializationManager.serialize(profiles);
            FileUtils.save(file, jsons);

        }
    }
    public static void setXpMaxMineur(Player p, int number){

        File file = new File(saveDirs, p.getUniqueId() + ".json");
        PlayerSerializationManager profileSerializationManager = new PlayerSerializationManager();

        PlayerProfile profile = PlayerProfile.createProfile(getLevelMineur(p),  getXpMineur(p), number,getLevelBucheron(p),getXpBucheron(p),getXpMaxBucheron(p),getLevelAgriculteur(p) ,getXpAgriculteur(p),getXpMaxAgriculteur(p),getLevelPecheur(p),getXpPecheur(p),getXpMaxPeucheur(p),getLevelChasseur(p),getXpChasseur(p),getXpMaxChasseur(p),getLevelDresseur(p),getXpDresseur(p),getXpMaxDresseur(p), getJobs1(p),getJobs2(p));
        String json = profileSerializationManager.serialize(profile);
        FileUtils.save(file, json);
    }



                                            // JOBS //

    public static String getJobs1(Player p){
        File file = new File("plugins"+ File.separator+"JobsPlugin" + File.separator+"players"+ File.separator, p.getUniqueId() + ".json");
        PlayerSerializationManager roleSerializationManager = new PlayerSerializationManager();
        String json =   FileUtils.loadContent(file);
        PlayerProfile profile = roleSerializationManager.deserialize(json);
        return profile.getJobs1();
    }
    public static String getJobs2(Player p){
        File file = new File("plugins"+ File.separator+"JobsPlugin" + File.separator+"players"+ File.separator, p.getUniqueId() + ".json");
        PlayerSerializationManager roleSerializationManager = new PlayerSerializationManager();
        String json =   FileUtils.loadContent(file);
        PlayerProfile profile = roleSerializationManager.deserialize(json);
        return profile.getJobs2();
    }

    public static void setJobs1(Player p, String jobs){

        File file = new File(saveDirs, p.getUniqueId() + ".json");
        PlayerSerializationManager profileSerializationManager = new PlayerSerializationManager();

        PlayerProfile profile = PlayerProfile.createProfile(getLevelMineur(p),  getXpMineur(p), getXpMaxMineur(p),getLevelBucheron(p),getXpBucheron(p),getXpMaxBucheron(p),getLevelAgriculteur(p) ,getXpAgriculteur(p),getXpMaxAgriculteur(p),getLevelPecheur(p),getXpPecheur(p),getXpMaxPeucheur(p),getLevelChasseur(p),getXpChasseur(p),getXpMaxChasseur(p),getLevelDresseur(p),getXpDresseur(p),getXpMaxDresseur(p), jobs, getJobs2(p));
        String json = profileSerializationManager.serialize(profile);
        FileUtils.save(file, json);
    }

    public static void setJobs2(Player p, String jobs){

        File file = new File(saveDirs, p.getUniqueId() + ".json");
        PlayerSerializationManager profileSerializationManager = new PlayerSerializationManager();

        PlayerProfile profile = PlayerProfile.createProfile(getLevelMineur(p),  getXpMineur(p), getXpMaxMineur(p),getLevelBucheron(p),getXpBucheron(p),getXpMaxBucheron(p),getLevelAgriculteur(p) ,getXpAgriculteur(p),getXpMaxAgriculteur(p),getLevelPecheur(p),getXpPecheur(p),getXpMaxPeucheur(p),getLevelChasseur(p),getXpChasseur(p),getXpMaxChasseur(p),getLevelDresseur(p),getXpDresseur(p),getXpMaxDresseur(p), getJobs1(p), jobs);
        String json = profileSerializationManager.serialize(profile);
        FileUtils.save(file, json);
    }

                                                      // JOBS //


                            // Bucheron //
    ////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////  LEVEL ////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////


    public static int getLevelBucheron(Player p){
        File file = new File("plugins"+ File.separator+"JobsPlugin" + File.separator+"players"+ File.separator, p.getUniqueId() + ".json");
        PlayerSerializationManager roleSerializationManager = new PlayerSerializationManager();
        String json =   FileUtils.loadContent(file);
        PlayerProfile profile = roleSerializationManager.deserialize(json);
        return profile.getLvlBucheron();
    }
    public static void addLevelBucheron(Player p, int number){

        File file = new File(saveDirs, p.getUniqueId() + ".json");
        PlayerSerializationManager profileSerializationManager = new PlayerSerializationManager();

        PlayerProfile profile = PlayerProfile.createProfile(getLevelMineur(p), getXpMineur(p), getXpMaxMineur(p),getLevelBucheron(p)+number,getXpBucheron(p),getXpMaxBucheron(p),getLevelAgriculteur(p) ,getXpAgriculteur(p),getXpMaxAgriculteur(p),getLevelPecheur(p),getXpPecheur(p),getXpMaxPeucheur(p),getLevelChasseur(p),getXpChasseur(p),getXpMaxChasseur(p),getLevelDresseur(p),getXpDresseur(p),getXpMaxDresseur(p), getJobs1(p),getJobs2(p));
        String json = profileSerializationManager.serialize(profile);
        FileUtils.save(file, json);
    }

    ////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////// XP //////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////

    public static double getXpBucheron(Player p){
        File file = new File("plugins"+ File.separator+"JobsPlugin" + File.separator+"players"+ File.separator, p.getUniqueId() + ".json");
        PlayerSerializationManager roleSerializationManager = new PlayerSerializationManager();
        String json =   FileUtils.loadContent(file);
        PlayerProfile profile = roleSerializationManager.deserialize(json);
        if(profile == null){
            return Double.MAX_VALUE;
        }
        return profile.getXpBucheron();
    }

    public static double getXpMaxBucheron(Player p){
        File file = new File("plugins"+ File.separator+"JobsPlugin" + File.separator+"players"+ File.separator, p.getUniqueId() + ".json");
        PlayerSerializationManager roleSerializationManager = new PlayerSerializationManager();
        String json =   FileUtils.loadContent(file);
        PlayerProfile profile = roleSerializationManager.deserialize(json);
        return profile.getXpMaxBucheron();
    }
    public static void addXpBucheron(Player p, double number){

        File file = new File(saveDirs, p.getUniqueId() + ".json");
        PlayerSerializationManager profileSerializationManager = new PlayerSerializationManager();

        PlayerProfile profile = PlayerProfile.createProfile(getLevelMineur(p), getXpMineur(p), getXpMaxMineur(p),getLevelBucheron(p),getXpBucheron(p) + number,getXpMaxBucheron(p) ,getLevelAgriculteur(p) ,getXpAgriculteur(p),getXpMaxAgriculteur(p),getLevelPecheur(p),getXpPecheur(p),getXpMaxPeucheur(p),getLevelChasseur(p),getXpChasseur(p),getXpMaxChasseur(p),getLevelDresseur(p),getXpDresseur(p),getXpMaxDresseur(p), getJobs1(p),getJobs2(p));
        String json = profileSerializationManager.serialize(profile);
        FileUtils.save(file, json);
    }
    public static void setXpMaxBucheron(Player p, int number){

        File file = new File(saveDirs, p.getUniqueId() + ".json");
        PlayerSerializationManager profileSerializationManager = new PlayerSerializationManager();

        PlayerProfile profile = PlayerProfile.createProfile(getLevelMineur(p),  getXpMineur(p), getXpMaxMineur(p),getLevelBucheron(p),getXpBucheron(p),number,getLevelAgriculteur(p) ,getXpAgriculteur(p),getXpMaxAgriculteur(p),getLevelPecheur(p),getXpPecheur(p),getXpMaxPeucheur(p),getLevelChasseur(p),getXpChasseur(p),getXpMaxChasseur(p),getLevelDresseur(p),getXpDresseur(p),getXpMaxDresseur(p), getJobs1(p),getJobs2(p));
        String json = profileSerializationManager.serialize(profile);
        FileUtils.save(file, json);
    }



    // Agriculteur //
    ////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////  LEVEL ////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////


    public static int getLevelAgriculteur(Player p){
        File file = new File("plugins"+ File.separator+"JobsPlugin" + File.separator+"players"+ File.separator, p.getUniqueId() + ".json");
        PlayerSerializationManager roleSerializationManager = new PlayerSerializationManager();
        String json =   FileUtils.loadContent(file);
        PlayerProfile profile = roleSerializationManager.deserialize(json);
        return profile.getLvlAgriculteur();
    }
    public static void addLevelAgriculteur(Player p, int number){

        File file = new File(saveDirs, p.getUniqueId() + ".json");
        PlayerSerializationManager profileSerializationManager = new PlayerSerializationManager();

        PlayerProfile profile = PlayerProfile.createProfile(getLevelMineur(p), getXpMineur(p), getXpMaxMineur(p),getLevelBucheron(p),getXpBucheron(p),getXpMaxBucheron(p),getLevelAgriculteur(p)+number,getXpAgriculteur(p),getXpMaxAgriculteur(p),getLevelPecheur(p),getXpPecheur(p),getXpMaxPeucheur(p),getLevelChasseur(p),getXpChasseur(p),getXpMaxChasseur(p),getLevelDresseur(p),getXpDresseur(p),getXpMaxDresseur(p), getJobs1(p),getJobs2(p));
        String json = profileSerializationManager.serialize(profile);
        FileUtils.save(file, json);
    }

    ////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////// XP //////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////

    public static double getXpAgriculteur(Player p){
        File file = new File("plugins"+ File.separator+"JobsPlugin" + File.separator+"players"+ File.separator, p.getUniqueId() + ".json");
        PlayerSerializationManager roleSerializationManager = new PlayerSerializationManager();
        String json =   FileUtils.loadContent(file);
        PlayerProfile profile = roleSerializationManager.deserialize(json);
        if(profile == null){
            return Double.MAX_VALUE;
        }
        return profile.getXpAgriculteur();
    }

    public static double getXpMaxAgriculteur(Player p){
        File file = new File("plugins"+ File.separator+"JobsPlugin" + File.separator+"players"+ File.separator, p.getUniqueId() + ".json");
        PlayerSerializationManager roleSerializationManager = new PlayerSerializationManager();
        String json =   FileUtils.loadContent(file);
        PlayerProfile profile = roleSerializationManager.deserialize(json);
        return profile.getXpMaxAgriculteur();
    }
    public static void addXpAgriculteur(Player p, double number){

        File file = new File(saveDirs, p.getUniqueId() + ".json");
        PlayerSerializationManager profileSerializationManager = new PlayerSerializationManager();

        PlayerProfile profile = PlayerProfile.createProfile(getLevelMineur(p), getXpMineur(p), getXpMaxMineur(p),getLevelBucheron(p),getXpBucheron(p) ,getXpMaxBucheron(p) ,getLevelAgriculteur(p),getXpAgriculteur(p) +number, getXpMaxAgriculteur(p),getLevelPecheur(p),getXpPecheur(p),getXpMaxPeucheur(p),getLevelChasseur(p),getXpChasseur(p),getXpMaxChasseur(p),getLevelDresseur(p),getXpDresseur(p),getXpMaxDresseur(p), getJobs1(p),getJobs2(p));
        String json = profileSerializationManager.serialize(profile);
        FileUtils.save(file, json);
    }
    public static void setXpMaxAgriculteur(Player p, int number){

        File file = new File(saveDirs, p.getUniqueId() + ".json");
        PlayerSerializationManager profileSerializationManager = new PlayerSerializationManager();

        PlayerProfile profile = PlayerProfile.createProfile(getLevelMineur(p),  getXpMineur(p), getXpMaxMineur(p),getLevelBucheron(p),getXpBucheron(p),getXpMaxBucheron(p),getLevelAgriculteur(p),getXpAgriculteur(p) , number,getLevelPecheur(p),getXpPecheur(p),getXpMaxPeucheur(p),getLevelChasseur(p),getXpChasseur(p),getXpMaxChasseur(p),getLevelDresseur(p),getXpDresseur(p),getXpMaxDresseur(p), getJobs1(p),getJobs2(p));
        String json = profileSerializationManager.serialize(profile);
        FileUtils.save(file, json);
    }

    // Pecheur //
    ////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////  LEVEL ////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////


    public static int getLevelPecheur(Player p){
        File file = new File("plugins"+ File.separator+"JobsPlugin" + File.separator+"players"+ File.separator, p.getUniqueId() + ".json");
        PlayerSerializationManager roleSerializationManager = new PlayerSerializationManager();
        String json =   FileUtils.loadContent(file);
        PlayerProfile profile = roleSerializationManager.deserialize(json);
        return profile.getLvlPecheur();
    }
    public static void addLevelPecheur(Player p, int number){

        File file = new File(saveDirs, p.getUniqueId() + ".json");
        PlayerSerializationManager profileSerializationManager = new PlayerSerializationManager();

        PlayerProfile profile = PlayerProfile.createProfile(getLevelMineur(p), getXpMineur(p), getXpMaxMineur(p),getLevelBucheron(p),getXpBucheron(p),getXpMaxBucheron(p),getLevelAgriculteur(p),getXpAgriculteur(p),getXpMaxAgriculteur(p),getLevelPecheur(p)+number,getXpPecheur(p),getXpMaxPeucheur(p),getLevelChasseur(p),getXpChasseur(p),getXpMaxChasseur(p),getLevelDresseur(p),getXpDresseur(p),getXpMaxDresseur(p), getJobs1(p),getJobs2(p));
        String json = profileSerializationManager.serialize(profile);
        FileUtils.save(file, json);
    }

    ////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////// XP //////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////

    public static double getXpPecheur(Player p){
        File file = new File("plugins"+ File.separator+"JobsPlugin" + File.separator+"players"+ File.separator, p.getUniqueId() + ".json");
        PlayerSerializationManager roleSerializationManager = new PlayerSerializationManager();
        String json =   FileUtils.loadContent(file);
        PlayerProfile profile = roleSerializationManager.deserialize(json);
        if(profile == null){
            return Double.MAX_VALUE;
        }
        return profile.getXpPecheur();
    }

    public static double getXpMaxPeucheur(Player p){
        File file = new File("plugins"+ File.separator+"JobsPlugin" + File.separator+"players"+ File.separator, p.getUniqueId() + ".json");
        PlayerSerializationManager roleSerializationManager = new PlayerSerializationManager();
        String json =   FileUtils.loadContent(file);
        PlayerProfile profile = roleSerializationManager.deserialize(json);
        return profile.getXpMaxPecheur();
    }
    public static void addXpPecheur(Player p, double number){

        File file = new File(saveDirs, p.getUniqueId() + ".json");
        PlayerSerializationManager profileSerializationManager = new PlayerSerializationManager();

        PlayerProfile profile = PlayerProfile.createProfile(getLevelMineur(p), getXpMineur(p), getXpMaxMineur(p),getLevelBucheron(p),getXpBucheron(p) ,getXpMaxBucheron(p) ,getLevelAgriculteur(p),getXpAgriculteur(p) , getXpMaxAgriculteur(p),getLevelPecheur(p),getXpPecheur(p)+number,getXpMaxPeucheur(p),getLevelChasseur(p),getXpChasseur(p),getXpMaxChasseur(p),getLevelDresseur(p),getXpDresseur(p),getXpMaxDresseur(p), getJobs1(p),getJobs2(p));
        String json = profileSerializationManager.serialize(profile);
        FileUtils.save(file, json);
    }
    public static void setXpMaxPecheur(Player p, int number){

        File file = new File(saveDirs, p.getUniqueId() + ".json");
        PlayerSerializationManager profileSerializationManager = new PlayerSerializationManager();

        PlayerProfile profile = PlayerProfile.createProfile(getLevelMineur(p),  getXpMineur(p), getXpMaxMineur(p),getLevelBucheron(p),getXpBucheron(p),getXpMaxBucheron(p),getLevelAgriculteur(p),getXpAgriculteur(p) , getXpMaxAgriculteur(p),getLevelPecheur(p),getXpPecheur(p),number,getLevelChasseur(p),getXpChasseur(p),getXpMaxChasseur(p),getLevelDresseur(p),getXpDresseur(p),getXpMaxDresseur(p), getJobs1(p),getJobs2(p));
        String json = profileSerializationManager.serialize(profile);
        FileUtils.save(file, json);
    }

    // Chasseur //
    ////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////  LEVEL ////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////


    public static int getLevelChasseur(Player p){
        File file = new File("plugins"+ File.separator+"JobsPlugin" + File.separator+"players"+ File.separator, p.getUniqueId() + ".json");
        PlayerSerializationManager roleSerializationManager = new PlayerSerializationManager();
        String json =   FileUtils.loadContent(file);
        PlayerProfile profile = roleSerializationManager.deserialize(json);
        return profile.getLvlChasseur();
    }
    public static void addLevelChasseur(Player p, int number){

        File file = new File(saveDirs, p.getUniqueId() + ".json");
        PlayerSerializationManager profileSerializationManager = new PlayerSerializationManager();

        PlayerProfile profile = PlayerProfile.createProfile(getLevelMineur(p), getXpMineur(p), getXpMaxMineur(p),getLevelBucheron(p),getXpBucheron(p),getXpMaxBucheron(p),getLevelAgriculteur(p),getXpAgriculteur(p),getXpMaxAgriculteur(p),getLevelPecheur(p),getXpPecheur(p),getXpMaxPeucheur(p),getLevelChasseur(p)+number,getXpChasseur(p),getXpMaxChasseur(p),getLevelDresseur(p),getXpDresseur(p),getXpMaxDresseur(p), getJobs1(p),getJobs2(p));
        String json = profileSerializationManager.serialize(profile);
        FileUtils.save(file, json);
    }

    ////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////// XP //////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////

    public static double getXpChasseur(Player p){
        File file = new File("plugins"+ File.separator+"JobsPlugin" + File.separator+"players"+ File.separator, p.getUniqueId() + ".json");
        PlayerSerializationManager roleSerializationManager = new PlayerSerializationManager();
        String json =   FileUtils.loadContent(file);
        PlayerProfile profile = roleSerializationManager.deserialize(json);
        if(profile == null){
            return Double.MAX_VALUE;
        }
        return profile.getXpChasseur();
    }

    public static double getXpMaxChasseur(Player p){
        File file = new File("plugins"+ File.separator+"JobsPlugin" + File.separator+"players"+ File.separator, p.getUniqueId() + ".json");
        PlayerSerializationManager roleSerializationManager = new PlayerSerializationManager();
        String json =   FileUtils.loadContent(file);
        PlayerProfile profile = roleSerializationManager.deserialize(json);
        return profile.getXpMaxChasseur();
    }
    public static void addXpChasseur(Player p, double number){

        File file = new File(saveDirs, p.getUniqueId() + ".json");
        PlayerSerializationManager profileSerializationManager = new PlayerSerializationManager();

        PlayerProfile profile = PlayerProfile.createProfile(getLevelMineur(p), getXpMineur(p), getXpMaxMineur(p),getLevelBucheron(p),getXpBucheron(p) ,getXpMaxBucheron(p) ,getLevelAgriculteur(p),getXpAgriculteur(p) , getXpMaxAgriculteur(p),getLevelPecheur(p),getXpPecheur(p),getXpMaxPeucheur(p),getLevelChasseur(p),getXpChasseur(p)+ number,getXpMaxChasseur(p),getLevelDresseur(p),getXpDresseur(p),getXpMaxDresseur(p), getJobs1(p),getJobs2(p));
        String json = profileSerializationManager.serialize(profile);
        FileUtils.save(file, json);
    }
    public static void setXpMaxChasseur(Player p, int number){

        File file = new File(saveDirs, p.getUniqueId() + ".json");
        PlayerSerializationManager profileSerializationManager = new PlayerSerializationManager();

        PlayerProfile profile = PlayerProfile.createProfile(getLevelMineur(p),  getXpMineur(p), getXpMaxMineur(p),getLevelBucheron(p),getXpBucheron(p),getXpMaxBucheron(p),getLevelAgriculteur(p),getXpAgriculteur(p) , getXpMaxAgriculteur(p),getLevelPecheur(p),getXpPecheur(p),getXpMaxPeucheur(p),getLevelChasseur(p),getXpChasseur(p),number,getLevelDresseur(p),getXpDresseur(p),getXpMaxDresseur(p), getJobs1(p),getJobs2(p));
        String json = profileSerializationManager.serialize(profile);
        FileUtils.save(file, json);
    }
    // Dresseur //
    ////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////  LEVEL ////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////


    public static int getLevelDresseur(Player p){
        File file = new File("plugins"+ File.separator+"JobsPlugin" + File.separator+"players"+ File.separator, p.getUniqueId() + ".json");
        PlayerSerializationManager roleSerializationManager = new PlayerSerializationManager();
        String json =   FileUtils.loadContent(file);
        PlayerProfile profile = roleSerializationManager.deserialize(json);
        return profile.getLvlDresseur();
    }
    public static void addLevelDresseur(Player p, int number){

        File file = new File(saveDirs, p.getUniqueId() + ".json");
        PlayerSerializationManager profileSerializationManager = new PlayerSerializationManager();

        PlayerProfile profile = PlayerProfile.createProfile(getLevelMineur(p), getXpMineur(p), getXpMaxMineur(p),getLevelBucheron(p),getXpBucheron(p),getXpMaxBucheron(p),getLevelAgriculteur(p),getXpAgriculteur(p),getXpMaxAgriculteur(p),getLevelPecheur(p),getXpPecheur(p),getXpMaxPeucheur(p),getLevelChasseur(p),getXpChasseur(p),getXpMaxChasseur(p),getLevelDresseur(p)+number,getXpDresseur(p),getXpMaxDresseur(p), getJobs1(p),getJobs2(p));
        String json = profileSerializationManager.serialize(profile);

        FileUtils.save(file, json);
    }

    ////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////// XP //////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////

    public static double getXpDresseur(Player p){
        File file = new File("plugins"+ File.separator+"JobsPlugin" + File.separator+"players"+ File.separator, p.getUniqueId() + ".json");
        PlayerSerializationManager roleSerializationManager = new PlayerSerializationManager();
        String json =   FileUtils.loadContent(file);
        PlayerProfile profile = roleSerializationManager.deserialize(json);
        if(profile == null){
            return Double.MAX_VALUE;
        }
        return profile.getXpDresseur();
    }

    public static double getXpMaxDresseur(Player p){
        File file = new File("plugins"+ File.separator+"JobsPlugin" + File.separator+"players"+ File.separator, p.getUniqueId() + ".json");
        PlayerSerializationManager roleSerializationManager = new PlayerSerializationManager();
        String json =   FileUtils.loadContent(file);
        PlayerProfile profile = roleSerializationManager.deserialize(json);
        return profile.getXpMaxDresseur();
    }
    public static void addXpDresseur(Player p, double number){

        File file = new File(saveDirs, p.getUniqueId() + ".json");
        PlayerSerializationManager profileSerializationManager = new PlayerSerializationManager();

        PlayerProfile profile = PlayerProfile.createProfile(getLevelMineur(p), getXpMineur(p), getXpMaxMineur(p),getLevelBucheron(p),getXpBucheron(p) ,getXpMaxBucheron(p) ,getLevelAgriculteur(p),getXpAgriculteur(p) , getXpMaxAgriculteur(p),getLevelPecheur(p),getXpPecheur(p),getXpMaxPeucheur(p),getLevelChasseur(p),getXpChasseur(p),getXpMaxChasseur(p),getLevelDresseur(p),getXpDresseur(p) + number,getXpMaxDresseur(p), getJobs1(p),getJobs2(p));
        String json = profileSerializationManager.serialize(profile);
        FileUtils.save(file, json);
    }
    public static void setXpMaxDresseur(Player p, int number){

        File file = new File(saveDirs, p.getUniqueId() + ".json");
        PlayerSerializationManager profileSerializationManager = new PlayerSerializationManager();

        PlayerProfile profile = PlayerProfile.createProfile(getLevelMineur(p),  getXpMineur(p), getXpMaxMineur(p),getLevelBucheron(p),getXpBucheron(p),getXpMaxBucheron(p),getLevelAgriculteur(p),getXpAgriculteur(p) , getXpMaxAgriculteur(p),getLevelPecheur(p),getXpPecheur(p),getXpMaxPeucheur(p),getLevelChasseur(p),getXpChasseur(p),getXpMaxChasseur(p),getLevelDresseur(p),getXpDresseur(p),number, getJobs1(p),getJobs2(p));
        String json = profileSerializationManager.serialize(profile);
        FileUtils.save(file, json);
    }
}
