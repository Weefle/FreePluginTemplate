package fr.refactor.plugin.event;

import fr.refactor.plugin.RefactorMain;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;

public class EventsManager {

    private RefactorMain plugin;

    public EventsManager(RefactorMain plugin) {
        this.plugin = plugin;
    }

    public void registerEvents() {
        PluginManager pm = Bukkit.getPluginManager();

        // Pour enregistrer un event
        // pm.registerEvents(new Test(), plugin);
    }

}
