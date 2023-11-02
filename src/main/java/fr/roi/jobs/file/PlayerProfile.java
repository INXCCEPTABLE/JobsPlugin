package fr.roi.jobs.file;

public class PlayerProfile {

    private int lvlMineur;
    private double xpMineur;
    private double xpMaxMineur;

    private int lvlBucheron;
    private double xpBucheron;
    private double xpMaxBucheron;

    private int lvlAgriculteur;
    private double xpAgriculteur;
    private double xpMaxAgriculteur;

    private int lvlPecheur;
    private double xpPecheur;
    private double xpMaxPecheur;

    private int lvlChasseur;
    private double xpChasseur;
    private double xpMaxChasseur;

    private int lvlDresseur;
    private double xpDresseur;
    private double xpMaxDresseur;
    private String jobs1;
    private String jobs2;


    public PlayerProfile(int lvlMineur, double xpMineur, double xpMaxMineur,int lvlBucheron, double xpBucheron, double xpMaxBucheron,int lvlAgriculteur, double xpAgriculteur, double xpMaxAgriculteur,int lvlPecheur, double xpPecheur, double xpMaxPecheur,int lvlChasseur, double xpChasseur, double xpMaxChasseur,int lvlDresseur, double xpDresseur, double xpMaxDresseur, String jobs1, String jobs2 ) {
        this.lvlMineur = lvlMineur;
        this.xpMineur = xpMineur;
        this.xpMaxMineur = xpMaxMineur;
        this.lvlBucheron = lvlBucheron;
        this.xpBucheron = xpBucheron;
        this.xpMaxBucheron = xpMaxBucheron;
        this.lvlAgriculteur = lvlAgriculteur;
        this.xpAgriculteur = xpAgriculteur;
        this.xpMaxAgriculteur = xpMaxAgriculteur;

        this.lvlPecheur = lvlPecheur;
        this.xpPecheur = xpPecheur;
        this.xpMaxPecheur = xpMaxPecheur;

        this.lvlChasseur = lvlChasseur;
        this.xpChasseur = xpChasseur;
        this.xpMaxChasseur = xpMaxChasseur;


        this.lvlDresseur = lvlDresseur;
        this.xpDresseur = xpDresseur;
        this.xpMaxDresseur = xpMaxDresseur;
        this.jobs1 = jobs1;
        this.jobs1 = jobs2;

    }

    public int getLevelMineur() {
        return lvlMineur;
    }

    public double getXpMaxMineur() {
        return xpMaxMineur;
    }

    public int getLvlBucheron()   { return lvlBucheron;
    }

    public int getLvlAgriculteur() {
        return lvlAgriculteur;
    }

    public double getXpAgriculteur() {
        return xpAgriculteur;
    }

    public double getXpMaxAgriculteur() {
        return xpMaxAgriculteur;
    }

    public double getXpBucheron() {
        return xpBucheron;
    }

    public double getXpMaxBucheron() {
        return xpMaxBucheron;
    }
    public String getJobs1() {
        return jobs1;
    }

    public int getLvlChasseur() {
        return lvlChasseur;
    }

    public double getXpChasseur() {
        return xpChasseur;
    }

    public double getXpMaxChasseur() {
        return xpMaxChasseur;
    }

    public int getLvlDresseur() {
        return lvlDresseur;
    }

    public double getXpDresseur() {
        return xpDresseur;
    }

    public double getXpMaxDresseur() {
        return xpMaxDresseur;
    }

    public String getJobs2() {
        return jobs2;
    }

    public int getLvlPecheur() {
        return lvlPecheur;
    }

    public double getXpPecheur() {
        return xpPecheur;
    }

    public double getXpMaxPecheur() {
        return xpMaxPecheur;
    }

    public double getXpMineur() {
        return xpMineur;
    }


    public static PlayerProfile createProfile(int levelMineur, double xpMineur, double xpMaxMineur,int levelBucheron, double xpBucheron, double xpMaxBucheron,int levelAgriculteur, double xpAgriculteur, double xpMaxAgriculteur,int levelPecheur, double xpPecheur, double xpMaxPecheur,int levelChasseur, double xpChasseur, double xpMaxChasseur,int levelDresseur, double xpDresseur, double xpMaxDresseur, String jobs1, String jobs2 ){
            return new PlayerProfile(levelMineur, xpMineur, xpMaxMineur, levelBucheron, xpBucheron, xpMaxBucheron,levelAgriculteur, xpAgriculteur, xpMaxAgriculteur,levelPecheur, xpPecheur, xpMaxPecheur,levelChasseur, xpChasseur, xpMaxChasseur , levelDresseur, xpDresseur, xpMaxDresseur, jobs1, jobs2);
        }


}
