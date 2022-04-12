package com.github.professorSam.bungeeUuidChanger;

import java.util.UUID;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.plugin.Command;

public class UuidCommand extends Command{

	public UuidCommand() {
		super("uuid");
	}

	@Override
	public void execute(CommandSender sender, String[] args) {
		if(args.length != 2) {
			sender.sendMessage(new ComponentBuilder().append("Wrong arguments").create());
			return;
		}
		LoginListener.playerAndUuids.put(args[0], UUID.fromString(args[1]));
		sender.sendMessage(new ComponentBuilder().append("Sucess").create());
	}
	

}
