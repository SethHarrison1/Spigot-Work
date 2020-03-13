package me.simplenmm.helloworld;

import org.bukkit.plugin.java.JavaPlugin;

import me.simplenmm.helloworld.commands.HelloCommand;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		new HelloCommand(this);
	}
}
