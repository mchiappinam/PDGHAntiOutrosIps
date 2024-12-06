package me.mchiappinam.pdghantioutrosips;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
		getServer().getConsoleSender().sendMessage("§3[PDGHAntiOutrosIps] §2ativado - Plugin by: mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHAntiOutrosIps] §2Acesse: http://pdgh.com.br/");
	}

	public void onDisable() {
		getServer().getConsoleSender().sendMessage("§3[PDGHAntiOutrosIps] §2desativado - Plugin by: mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHAntiOutrosIps] §2Acesse: http://pdgh.com.br/");
	}
		
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		String pi = e.getPlayer().getAddress().toString().replaceAll("/", "").split(":")[0];
		if(!pi.equals("192.99.2.191")) {
			e.getPlayer().kickPlayer("§4§l[PDGH]\n§c§lVocê precisa se conectar no servidor principal: §f§ljogar.overcraftbr.com.br");
			getServer().getConsoleSender().sendMessage("§3[PDGHAntiOutrosIps] §c"+e.getPlayer().getName()+" tentou entrar com o IP real.");
		}
	}
	
}