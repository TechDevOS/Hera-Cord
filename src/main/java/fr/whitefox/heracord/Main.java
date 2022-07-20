package fr.whitefox.heracord;

import fr.whitefox.heracord.commands.Lobby;
import fr.whitefox.heracord.commands.bc;
import fr.whitefox.heracord.commands.sc;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;


public final class Main extends Plugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getProxy().getConsole().sendMessage(" ");
        getProxy().getConsole().sendMessage(ChatColor.GREEN + "[HeraCord] Up !");
        getProxy().getConsole().sendMessage(" ");

        ProxyServer.getInstance().getPluginManager().registerCommand(this, new Lobby(this));
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new sc(this));
        ProxyServer.getInstance().getPluginManager().registerCommand(this, new bc(this));


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getProxy().getConsole().sendMessage(" ");
        getProxy().getConsole().sendMessage(ChatColor.RED + "[HeraCord] Goodbye :)");
        getProxy().getConsole().sendMessage(" ");
    }
}
