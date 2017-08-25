package fr.refactor.plugin;


import fr.refactor.plugin.utils.ChatUtils;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class RefactorMain extends JavaPlugin {

    //Appelle la class "Main"
    private Plugin pl;
    public void Main(Plugin pl){
        this.pl = pl;
    }
    //Pendant le chargement du plugin
    public void onLoad(){
        System.out.println("Activation » "+ ChatUtils.name +" version: "+ ChatUtils.version);
        super.onLoad();
    }
    //Quand il a finis de s'activée
    @Override
    public void onEnable() {
        System.out.println("Activée » "+ ChatUtils.name +" version: "+ ChatUtils.version);
        //EventsManagers | Vos event
        /*
        * new EventsManagers(this).registerEvent();
        */
        super.onEnable();
    }
    //Quand il ce désactive
    @Override
    public void onDisable() {
        System.out.println("Désactivation » "+ ChatUtils.name +" version: "+ ChatUtils.version);
        super.onDisable();
    }
}
