package me.checkversion;

import com.google.common.base.Preconditions;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.ViaAPI;
import com.viaversion.viaversion.api.ViaManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.UUID;
import java.util.concurrent.TimeUnit;


public class Checkversion extends JavaPlugin implements Listener {

    private static ViaManager manager;

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "[Checkversion] Plugin made by Kim(FIP)");
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "[Checkversion] Plugin can check version from 1.8 - 1.19.2");
        Bukkit.getServer().getPluginManager().registerEvents(this, this);
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
            Player p = event.getPlayer();
            int version = Via.getPlatform().getApi().getPlayerVersion(p);
            TimeUnit.SECONDS.sleep(2);
            if (version == 47) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Checkversion] Version of " + p.getName() + " is 1.8");
            }
            if (version == 107) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Checkversion] Version of " + p.getName() + " is 1.9");
            }
            if (version == 108) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Checkversion] Version of " + p.getName() + " is 1.9.1");
            }
            if (version == 109) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Checkversion] Version of " + p.getName() + " is 1.9.2");
            }
            if (version == 110) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Checkversion] Version of " + p.getName() + " is 1.9.3 or 1.9.4");
            }
            if (version == 210) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Checkversion] Version of " + p.getName() + " is 1.10 or 1.10.1 or 1.10.2");
            }
            if (version == 315) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Checkversion] Version of " + p.getName() + " is 1.11");
            }
            if (version == 316) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Checkversion] Version of " + p.getName() + " is 1.11.1 or 1.11.2");
            }
            if (version == 335) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Checkversion] Version of " + p.getName() + " is 1.12");
            }
            if (version == 338) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Checkversion] Version of " + p.getName() + " is 1.12.1");
            }
            if (version == 340) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Checkversion] Version of " + p.getName() + " is 1.12.2");
            }
            if (version == 393) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Checkversion] Version of " + p.getName() + " is 1.13");
            }
            if (version == 401) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Checkversion] Version of " + p.getName() + " is 1.13.1");
            }
            if (version == 404) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Checkversion] Version of " + p.getName() + " is 1.13.2");
            }
            if (version == 477) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Checkversion] Version of " + p.getName() + " is 1.14");
            }
            if (version == 480) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Checkversion] Version of " + p.getName() + " is 1.14.1");
            }
            if (version == 485) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Checkversion] Version of " + p.getName() + " is 1.14.2");
            }
            if (version == 490) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Checkversion] Version of " + p.getName() + " is 1.14.3");
            }
            if (version == 498) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Checkversion] Version of " + p.getName() + " is 1.14.4");
            }
            if (version == 573) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Checkversion] Version of " + p.getName() + " is 1.15");
            }
            if (version == 575) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Checkversion] Version of " + p.getName() + " is 1.15.1");
            }
            if (version == 578) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Checkversion] Version of " + p.getName() + " is 1.15.2");
            }
            if (version == 735) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Checkversion] Version of " + p.getName() + " is 1.16");
            }
            if (version == 736) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Checkversion] Version of " + p.getName() + " is 1.16.1");
            }
            if (version == 751) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Checkversion] Version of " + p.getName() + " is 1.16.2");
            }
            if (version == 753) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Checkversion] Version of " + p.getName() + " is 1.16.3");
            }
            if (version == 754) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Checkversion] Version of " + p.getName() + " is 1.16.4 or 1.16.5");
            }
            if (version == 755) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Checkversion] Version of " + p.getName() + " is 1.17");
            }
            if (version == 756) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Checkversion] Version of " + p.getName() + " is 1.17.1");
            }
            if (version == 757) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Checkversion] Version of " + p.getName() + " is 1.18 or 1.18.1");
            }
            if (version == 758) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Checkversion] Version of " + p.getName() + " is 1.18.2");
            }
            if (version == 759) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Checkversion] Version of " + p.getName() + " is 1.19");
            }
            if (version == 760) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "[Checkversion] Version of " + p.getName() + " is 1.19.1 or 1.19.2");
            }
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            if (sender.hasPermission("Checkversion.checkversion")) {
                if (cmd.getName().equals("checkversion") && args.length == 0) {
                    int version = Via.getPlatform().getApi().getPlayerVersion(sender);
                    if (version == 47) {
                        sender.sendMessage(ChatColor.AQUA + "[Checkversion] Your minecraft version is 1.8");
                    }
                    if (version == 107) {
                        sender.sendMessage(ChatColor.AQUA + "[Checkversion] Your minecraft version is 1.9");
                    }
                    if (version == 108) {
                        sender.sendMessage(ChatColor.AQUA + "[Checkversion] Your minecraft version is 1.9.1");
                    }
                    if (version == 109) {
                        sender.sendMessage(ChatColor.AQUA + "[Checkversion] Your minecraft version is 1.9.2");
                    }
                    if (version == 110) {
                        sender.sendMessage(ChatColor.AQUA + "[Checkversion] Your minecraft version is 1.9.3 or 1.9.4");
                    }
                    if (version == 210) {
                        sender.sendMessage(ChatColor.AQUA + "[Checkversion] Your minecraft version is 1.10 or 1.10.1 or 1.10.2");
                    }
                    if (version == 315) {
                        sender.sendMessage(ChatColor.AQUA + "[Checkversion] Your minecraft version is 1.11");
                    }
                    if (version == 316) {
                        sender.sendMessage(ChatColor.AQUA + "[Checkversion] Your minecraft version is 1.11.1 or 1.11.2");
                    }
                    if (version == 335) {
                        sender.sendMessage(ChatColor.AQUA + "[Checkversion] Your minecraft version is 1.12");
                    }
                    if (version == 338) {
                        sender.sendMessage(ChatColor.AQUA + "[Checkversion] Your minecraft version is 1.12.1");
                    }
                    if (version == 340) {
                        sender.sendMessage(ChatColor.AQUA + "[Checkversion] Your minecraft version is 1.12.2");
                    }
                    if (version == 393) {
                        sender.sendMessage(ChatColor.AQUA + "[Checkversion] Your minecraft version is 1.13");
                    }
                    if (version == 401) {
                        sender.sendMessage(ChatColor.AQUA + "[Checkversion] Your minecraft version is 1.13.1");
                    }
                    if (version == 404) {
                        sender.sendMessage(ChatColor.AQUA + "[Checkversion] Your minecraft version is 1.13.2");
                    }
                    if (version == 477) {
                        sender.sendMessage(ChatColor.AQUA + "[Checkversion] Your minecraft version is 1.14");
                    }
                    if (version == 480) {
                        sender.sendMessage(ChatColor.AQUA + "[Checkversion] Your minecraft version is 1.14.1");
                    }
                    if (version == 485) {
                        sender.sendMessage(ChatColor.AQUA + "[Checkversion] Your minecraft version is 1.14.2");
                    }
                    if (version == 490) {
                        sender.sendMessage(ChatColor.AQUA + "[Checkversion] Your minecraft version is 1.14.3");
                    }
                    if (version == 498) {
                        sender.sendMessage(ChatColor.AQUA + "[Checkversion] Your minecraft version is 1.14.4");
                    }
                    if (version == 573) {
                        sender.sendMessage(ChatColor.AQUA + "[Checkversion] Your minecraft version is 1.15");
                    }
                    if (version == 575) {
                        sender.sendMessage(ChatColor.AQUA + "[Checkversion] Your minecraft version is 1.15.1");
                    }
                    if (version == 578) {
                        sender.sendMessage(ChatColor.AQUA + "[Checkversion] Your minecraft version is 1.15.2");
                    }
                    if (version == 735) {
                        sender.sendMessage(ChatColor.AQUA + "[Checkversion] Your minecraft version is 1.16");
                    }
                    if (version == 736) {
                        sender.sendMessage(ChatColor.AQUA + "[Checkversion] Your minecraft version is 1.16.1");
                    }
                    if (version == 751) {
                        sender.sendMessage(ChatColor.AQUA + "[Checkversion] Your minecraft version is 1.16.2");
                    }
                    if (version == 753) {
                        sender.sendMessage(ChatColor.AQUA + "[Checkversion] Your minecraft version is 1.16.3");
                    }
                    if (version == 754) {
                        sender.sendMessage(ChatColor.AQUA + "[Checkversion] Your minecraft version is 1.16.4 or 1.16.5");
                    }
                    if (version == 755) {
                        sender.sendMessage(ChatColor.AQUA + "[Checkversion] Your minecraft version is 1.17");
                    }
                    if (version == 756) {
                        sender.sendMessage(ChatColor.AQUA + "[Checkversion] Your minecraft version is 1.17.1");
                    }
                    if (version == 757) {
                        sender.sendMessage(ChatColor.AQUA + "[Checkversion] Your minecraft version is 1.18 or 1.18.1");
                    }
                    if (version == 758) {
                        sender.sendMessage(ChatColor.AQUA + "[Checkversion] Your minecraft version is 1.18.2");
                    }
                    if (version == 759) {
                        sender.sendMessage(ChatColor.AQUA + "[Checkversion] Your minecraft version is 1.19");
                    }
                    if (version == 760) {
                        sender.sendMessage(ChatColor.AQUA + "[Checkversion] Your minecraft version is 1.19.1 or 1.19.2");
                    }
                    return true;
                }
                if (args.length > 1) {
                    sender.sendMessage("????");
                }
                Player player = (Player) sender;
                Player target = Bukkit.getPlayer(args[0]);
                if (target == null && args.length == 1) {
                    player.sendMessage(ChatColor.GREEN + args[0] + " is not online!");
                    return true;
                }
                if (target != null && args.length == 1 && target != player) {
                    int version = Via.getPlatform().getApi().getPlayerVersion(player);
                    if (version == 47) {
                        player.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.8");
                    }
                    if (version == 107) {
                        player.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.9");
                    }
                    if (version == 108) {
                        player.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.9.1");
                    }
                    if (version == 109) {
                        player.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.9.2");
                    }
                    if (version == 110) {
                        player.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.9.3 or 1.9.4");
                    }
                    if (version == 210) {
                        player.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.10 or 1.10.1 or 1.10.2");
                    }
                    if (version == 315) {
                        player.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.11");
                    }
                    if (version == 316) {
                        player.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.11.1 or 1.11.2");
                    }
                    if (version == 335) {
                        player.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.12");
                    }
                    if (version == 338) {
                        player.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.12.1");
                    }
                    if (version == 340) {
                        player.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.12.2");
                    }
                    if (version == 393) {
                        player.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.13");
                    }
                    if (version == 401) {
                        player.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.13.1");
                    }
                    if (version == 404) {
                        player.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.13.2");
                    }
                    if (version == 477) {
                        player.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.14");
                    }
                    if (version == 480) {
                        player.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.14.1");
                    }
                    if (version == 485) {
                        player.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.14.2");
                    }
                    if (version == 490) {
                        player.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.14.3");
                    }
                    if (version == 498) {
                        player.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.14.4");
                    }
                    if (version == 573) {
                        player.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.15");
                    }
                    if (version == 575) {
                        player.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.15.1");
                    }
                    if (version == 578) {
                        player.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.15.2");
                    }
                    if (version == 735) {
                        player.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.16");
                    }
                    if (version == 736) {
                        player.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.16.1");
                    }
                    if (version == 751) {
                        player.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.16.2");
                    }
                    if (version == 753) {
                        player.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.16.3");
                    }
                    if (version == 754) {
                        player.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.16.4 or 1.16.5");
                    }
                    if (version == 755) {
                        player.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.17");
                    }
                    if (version == 756) {
                        player.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.17.1");
                    }
                    if (version == 757) {
                        player.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.18 or 1.18.1");
                    }
                    if (version == 758) {
                        player.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.18.2");
                    }
                    if (version == 759) {
                        player.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.19");
                    }
                    if (version == 760) {
                        player.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.19.1 or 1.19.2");
                    }

                }
                if (target == player) {
                    player.sendMessage(ChatColor.AQUA + "You have known your version ?");
                }
                return true;
            }
        }
        if (!(sender instanceof Player)) {
            if (args.length == 0) {
                sender.sendMessage(ChatColor.GREEN + "You must be a player");
            } else {
                if (args.length > 1) {
                    sender.sendMessage(ChatColor.AQUA + "?????");
                }
                Player target = Bukkit.getPlayer(args[0]);
                if (target == null && args.length == 1) {
                    sender.sendMessage(ChatColor.GREEN + args[0] + " is not online!");
                    return true;
                }
                if (target != null && args.length == 1) {
                    int version = Via.getPlatform().getApi().getPlayerVersion(target);
                    if (version == 47) {
                        sender.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.8");
                    }
                    if (version == 107) {
                        sender.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.9");
                    }
                    if (version == 108) {
                        sender.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.9.1");
                    }
                    if (version == 109) {
                        sender.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.9.2");
                    }
                    if (version == 110) {
                        sender.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.9.3 or 1.9.4");
                    }
                    if (version == 210) {
                        sender.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.10 or 1.10.1 or 1.10.2");
                    }
                    if (version == 315) {
                        sender.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.11");
                    }
                    if (version == 316) {
                        sender.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.11.1 or 1.11.2");
                    }
                    if (version == 335) {
                        sender.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.12");
                    }
                    if (version == 338) {
                        sender.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.12.1");
                    }
                    if (version == 340) {
                        sender.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.12.2");
                    }
                    if (version == 393) {
                        sender.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.13");
                    }
                    if (version == 401) {
                        sender.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.13.1");
                    }
                    if (version == 404) {
                        sender.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.13.2");
                    }
                    if (version == 477) {
                        sender.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.14");
                    }
                    if (version == 480) {
                        sender.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.14.1");
                    }
                    if (version == 485) {
                        sender.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.14.2");
                    }
                    if (version == 490) {
                        sender.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.14.3");
                    }
                    if (version == 498) {
                        sender.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.14.4");
                    }
                    if (version == 573) {
                        sender.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.15");
                    }
                    if (version == 575) {
                        sender.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.15.1");
                    }
                    if (version == 578) {
                        sender.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.15.2");
                    }
                    if (version == 735) {
                        sender.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.16");
                    }
                    if (version == 736) {
                        sender.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.16.1");
                    }
                    if (version == 751) {
                        sender.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.16.2");
                    }
                    if (version == 753) {
                        sender.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.16.3");
                    }
                    if (version == 754) {
                        sender.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.16.4 or 1.16.5");
                    }
                    if (version == 755) {
                        sender.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.17");
                    }
                    if (version == 756) {
                        sender.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.17.1");
                    }
                    if (version == 757) {
                        sender.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.18 or 1.18.1");
                    }
                    if (version == 758) {
                        sender.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.18.2");
                    }
                    if (version == 759) {
                        sender.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.19");
                    }
                    if (version == 760) {
                        sender.sendMessage(ChatColor.GREEN + "[Checkversion] " + target.getName() + " minecraft version is 1.19.1 or 1.19.2");
                    }
                }
            }
        }
        return true;
    }
}
