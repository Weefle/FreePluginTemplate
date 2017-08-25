package fr.refactor.plugin;


import fr.refactor.plugin.event.EventsManager;
import fr.refactor.plugin.utils.ChatUtils;
import org.bukkit.plugin.java.JavaPlugin;

public class RefactorMain extends JavaPlugin {

    private static RefactorMain instance;

    // Pendant le chargement du plugin
    @Override
    public void onLoad() {
        instance = this;

        System.out.println("Activation » "+ ChatUtils.NAME + " version: " + ChatUtils.VERSION);
    }

    // Quand il a fini de s'activer
    @Override
    public void onEnable() {
        System.out.println("Activé » " + ChatUtils.NAME + " version: " + ChatUtils.VERSION);

        new EventsManager(this).registerEvents();
    }

    // Quand il se désactive
    @Override
    public void onDisable() {
        System.out.println("Désactivation » " + ChatUtils.NAME + " version: " + ChatUtils.VERSION);
    }

    public static RefactorMain getInstance() { return instance; }

}
