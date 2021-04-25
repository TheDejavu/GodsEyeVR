package me.dejavu.godseyevr;

import lombok.Getter;
import me.dejavu.godseyevr.listener.VRPlayerJoinListener;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class GodsEyeVR extends JavaPlugin {
    @Getter
    private static GodsEyeVR instance;
    Plugin plugin = getServer().getPluginManager().getPlugin("GodsEye");
    YamlConfiguration conf = YamlConfiguration.loadConfiguration(new File(plugin.getDataFolder(), "checks.yml"));


    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new VRPlayerJoinListener(), this);
        GodsEyeVRAPI.setDelay(conf.getInt("Login checks activation delay"));
        getLogger().info(getDescription().getName() + " GodsEyeVR Fix has been enabled");
    }

    public void onDisable() {
        getLogger().info(getDescription().getName() + " GodsEyeVR Fix has been disabled");
    }

}
