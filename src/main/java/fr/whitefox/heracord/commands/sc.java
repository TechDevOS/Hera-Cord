package fr.whitefox.heracord.commands;

import fr.whitefox.heracord.Main;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class sc extends Command {

    public sc(Main main) {
        super("sc");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {

        if ((sender instanceof ProxiedPlayer)) {

            ProxiedPlayer player = (ProxiedPlayer) sender;

            if ((sender.hasPermission("hera.sc"))) {

                if (args.length == 0) {
                    player.sendMessage(ChatColor.RED + "La commande est : /sc <message>");

                }

                if (args.length >= 1) {
                    StringBuilder bc = new StringBuilder();
                    for (String part : args) {
                        bc.append(part + " ");
                    }

                    for (ProxiedPlayer people : ProxyServer.getInstance().getPlayers()) {
                        if (people.hasPermission("hera.sc")) {
                            people.sendMessage("§5[§dStaffChat§5] §a[" + player.getServer().getInfo().getName() + "]§b " + player.getName() + " : " + bc.toString());

                        }
                    }
                }
            } else{
                player.sendMessage(ChatColor.RED + "Vous n'avez pas la permission de faire ceci !");

            }
        }

    }
}

