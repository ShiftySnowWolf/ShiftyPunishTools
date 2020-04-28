package ssw;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

	public static Main plugin;

	@Override
	public void onEnable() {
		plugin = this;

	}

	@Override
	public void onDisable() {
		// Plugin shutdown logic
	}
}
