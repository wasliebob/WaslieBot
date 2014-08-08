package wasliebot.commands;

import java.util.ArrayList;

import wasliebot.helpers.Utils;
import wasliebot.interfaces.ICommand;
import wasliebot.main.WaslieBot;

public class CommandDrama implements ICommand{
	public CommandDrama(){
		names.add("wasliebob");
		names.add("Vazkii");
		names.add("Pokefenn");
		names.add("Player");
		names.add("Nekosune");
		names.add("Tahg");
		names.add("mDiyo");
		names.add("Glassmaker");
		names.add("KingLemming");
		names.add("Skyboy");
		names.add("Dan200");
		names.add("Notch");
		names.add("Mikee");
		names.add("Pahimar");
		names.add("RWTema");
		names.add("Jeb_");
		names.add("Pahimar");
		names.add("Grumm");
		names.add("Direwolf20");
		names.add("Jadedcat");
		names.add("Slowpoke");
		names.add("Tonius11");
		names.add("Chickenbones");
		names.add("ProfMobius");
		names.add("Searge");
		names.add("cpw");
		names.add("tterrag");
		names.add("Roarax");
		names.add("alexbegt");
		names.add("Drullkus");
		names.add("Eloraam");
		names.add("SpitefulFox");
		names.add("WayOfTime");

		mods.add("Thaumcraft Extras");
		mods.add("Forestry Extras");
		mods.add("Modular Machines");
		mods.add("Botania");
		mods.add("Totemic");
		mods.add("Industrial Craft");
		mods.add("Thaumic Tinkerer");
		mods.add("ExtraTiC");
		mods.add("Tinkers Construct");
		mods.add("Metallurgy");
		mods.add("Thermal Expansion");
		mods.add("CoFHCore");
		mods.add("MineFactory Reloaded");
		mods.add("Chisel");
		mods.add("Forge Multipart");
		mods.add("Forge Multipart Integration");
		mods.add("OpenBlocks");
		mods.add("Extra Utilies");
		mods.add("Computercraft");
		mods.add("XyCraft");
		mods.add("SimplyJetpacks");
		mods.add("FeedTheBeast");
		mods.add("AgrarianSkies");
		mods.add("Tekkit");
		mods.add("WaslieCore");
		mods.add("NotEnoughItems");
		mods.add("EnderStorage");
		mods.add("WAILA");
		mods.add("AetherCraft");
		mods.add("Equivelent Exchange");
		mods.add("Redpower");
		mods.add("Forbidden Magic");
		mods.add("Blood Magic");

		extras.add("hates");
		extras.add("sues");
		extras.add("copies");
		extras.add("destroys");
		extras.add("decompiles");
		extras.add("compiles");
		extras.add("scams");
		extras.add("donates");
		extras.add("supports");

		reasons.add("A new build is done.");
		reasons.add("It updates way to often.");
		reasons.add("because it's made by a noob.");
		reasons.add("because it adds nothing new.");
		reasons.add("because it's made by " + names.get(names.size() - 1) + ".");
		reasons.add("because it copied code from " + mods.get(mods.size() - 1) + ".");
	}
	public static ArrayList<String> names = new ArrayList<String>();
	public static ArrayList<String> mods = new ArrayList<String>();
	public static ArrayList<String> extras = new ArrayList<String>();
	public static ArrayList<String> reasons = new ArrayList<String>();
	
	@Override
	public void executeCommand(String args, String sender, String channel) {
		WaslieBot.bot.sendMessage(channel, names.get(Utils.random(0, names.size() - 1)) + " " + extras.get(Utils.random(0, extras.size() - 1)) + " " + mods.get(Utils.random(0, mods.size() - 1)) + " " + reasons.get(Utils.random(0, reasons.size() - 1)));
	}

	@Override
	public boolean requiresOp() {
		return false;
	}
}