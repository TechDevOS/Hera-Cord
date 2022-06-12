package fr.whitefox.heracord.commands;

import fr.whitefox.heracord.Main;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class Lobby extends Command {

    public Lobby(Main main) {
        super("Lobby");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {

        if ((sender instanceof ProxiedPlayer)) {
            ProxiedPlayer player = (ProxiedPlayer) sender;
            player.sendMessage(new ComponentBuilder("Connexion au Lobby en cours...").color(ChatColor.RED).create());
            player.connect(ProxyServer.getInstance().getServerInfo("Lobby"));



        }
    }

}