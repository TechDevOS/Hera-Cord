package fr.whitefox.heracord.commands;

import fr.whitefox.heracord.Main;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

import java.awt.*;

public class bc extends Command {

    public bc(Main main) {
        super("bc");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {

        if ((sender instanceof ProxiedPlayer)) {

            ProxiedPlayer player = (ProxiedPlayer) sender;

            if ((sender.hasPermission("hera.sc"))) {

                if (args.length == 0) {
                    player.sendMessage(ChatColor.RED + "La commande est : /bc <message>");

                }

                if (args.length >= 1) {
                    StringBuilder bc = new StringBuilder();
                    for (String part : args) {
                        bc.append(part + " ");
                    }

                    ProxyServer.getInstance().broadcast("\n» §l§6ANNONCE (§c" + player.getName() + ") §6:" + bc.toString());

                }
            } else{
                player.sendMessage(ChatColor.RED + "Vous n'avez pas la permission de faire ceci !");

            }
        }

    }
}

